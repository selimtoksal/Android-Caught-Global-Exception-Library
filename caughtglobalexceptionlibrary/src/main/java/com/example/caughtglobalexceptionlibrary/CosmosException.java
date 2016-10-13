package com.example.caughtglobalexceptionlibrary;

import android.app.Activity;
import android.content.Intent;
import android.os.Process;
import android.util.Log;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

import transferObject.TransferObject;

/**
 * Created by Selim on 13.10.2016.
 */
public class CosmosException implements java.lang.Thread.UncaughtExceptionHandler {
    private final Activity myContext;
    public TransferObject to;
    public CosmosException(Activity context, TransferObject transferObject) {
        myContext = context;
        to = transferObject;
    }
    @Override
    public void uncaughtException(Thread thread, Throwable throwable) {
        final Writer result = new StringWriter();
        final PrintWriter printWriter = new PrintWriter(result);
        throwable.printStackTrace(printWriter);
        String stacktrace = result.toString();
        printWriter.close();
        Log.d("stacktrace", stacktrace);
        Intent intent = new Intent(myContext, CollapseActivity.class);
        intent.putExtra("stacktrace",stacktrace);
        intent.putExtra("transferobject",to);
        myContext.startActivity(intent);
        Process.killProcess(Process.myPid());
        System.exit(0);
    }
}

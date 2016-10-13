package com.example.selim.caughtglobalexception;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.caughtglobalexceptionlibrary.CosmosException;

import transferObject.TransferObject;

public class Main2Activity extends AppCompatActivity {
    public TransferObject transferObject = new TransferObject();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        transferObject.setCrashText("D'oh! Its Crash..");
        transferObject.setDestinationActivity(MainActivity.class);
        transferObject.setDetailsButonText("Details");
        transferObject.setRestartAppButtonText("Contiune");
        transferObject.setImagePath(R.drawable.homer);
        transferObject.setBackgorundHex("#ffffff");
        transferObject.setCrashTextColor("#000000");
        Thread.setDefaultUncaughtExceptionHandler(new CosmosException(this,transferObject));


        String den = null;
        if(den.equals("patla la")) {
        }
    }
}

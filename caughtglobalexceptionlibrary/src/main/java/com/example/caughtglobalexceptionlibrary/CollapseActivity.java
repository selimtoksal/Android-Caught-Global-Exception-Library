package com.example.caughtglobalexceptionlibrary;

import android.app.AlarmManager;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import transferObject.TransferObject;

public class CollapseActivity extends AppCompatActivity {
    private Button btnDetaylarC;
    private Button btnDonC;
    private TextView textViewC;
    private ImageView image;
    private FrameLayout back;
    TransferObject transferObject;

    private void init(){
        textViewC = (TextView) findViewById(R.id.textViewC);
        btnDetaylarC = (Button) findViewById(R.id.btnDetaylarC);
        btnDonC = (Button) findViewById(R.id.btnDonC);
        image = (ImageView) findViewById(R.id.image);
        back = (FrameLayout) findViewById(R.id.back);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collapse);
        init();
        Intent i = getIntent();
        transferObject = (TransferObject)i.getSerializableExtra("transferobject");
        textViewC.setText(transferObject.getCrashText());
        textViewC.setTextColor(Color.parseColor(transferObject.getCrashTextColor()));
        btnDetaylarC.setText(transferObject.getDetailsButonText());
        btnDonC.setText(transferObject.getRestartAppButtonText());
        image.setImageResource(transferObject.getImagePath());
        back.setBackgroundColor(Color.parseColor(transferObject.getBackgorundHex()));
        final Bundle extraExp = getIntent().getExtras();
        btnDetaylarC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(extraExp != null)
                {
                    final String hata = extraExp.getString("stacktrace");
                    AlertDialog.Builder builderDetay = new AlertDialog.Builder(CollapseActivity.this);
                    builderDetay.setTitle("Reason");
                    builderDetay.setMessage(hata);
                    builderDetay.setPositiveButton("CLOSE",null);
                    builderDetay.show();
                }
            }
        });

        btnDonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mStartActivity = new Intent(getApplicationContext(),transferObject.getDestinationActivity());
                int mPendingIntentId = 123456;
                PendingIntent mPendingIntent = PendingIntent.getActivity(getApplicationContext(), mPendingIntentId,    mStartActivity, PendingIntent.FLAG_CANCEL_CURRENT);
                AlarmManager mgr = (AlarmManager)getApplicationContext().getSystemService(Context.ALARM_SERVICE);
                mgr.set(AlarmManager.RTC, System.currentTimeMillis() + 100, mPendingIntent);
                System.exit(0);

                Intent intent = new Intent(getApplicationContext(), transferObject.getDestinationActivity());
                startActivity(intent);
            }
        });
    }
    @Override //reason: not opening your crash page, opeing your starting page
    public void onBackPressed(){
        Intent mStartActivity = new Intent(getApplicationContext(), transferObject.getDestinationActivity());
        int mPendingIntentId = 123456;
        PendingIntent mPendingIntent = PendingIntent.getActivity(getApplicationContext(), mPendingIntentId,    mStartActivity, PendingIntent.FLAG_CANCEL_CURRENT);
        AlarmManager mgr = (AlarmManager)getApplicationContext().getSystemService(Context.ALARM_SERVICE);
        mgr.set(AlarmManager.RTC, System.currentTimeMillis() + 100, mPendingIntent);
        System.exit(0);
    }
}

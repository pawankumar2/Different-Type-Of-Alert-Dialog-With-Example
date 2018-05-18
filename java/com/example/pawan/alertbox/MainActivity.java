package com.example.pawan.alertbox;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private static int TIME_OUT = 4000; //Time to launch the another activity

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final View myLayout = findViewById(R.id.activitymain);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent  i = new Intent(getApplicationContext(),alertList.class);
                startActivity(i);
                finish();
            }
        }, TIME_OUT);

}

}


package com.example.pawan.alertbox;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.media.MediaPlayer;
import android.widget.Toast;

public class alertList extends AppCompatActivity {
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_list);
        toolbar = (Toolbar) findViewById(R.id.my_toolbar);
        toolbar.setTitle("Type Of Alert Dialog");
        setSupportActionBar(toolbar);
        Button one = (Button) this.findViewById(R.id.btnAlertOne);
        Button two = (Button) this.findViewById(R.id.btnAlertTwo);
        Button three = (Button) this.findViewById(R.id.btnAlertThree);
        Button alertlistview = (Button) this.findViewById(R.id.btnAlertList);



        final MediaPlayer mp = MediaPlayer.create(this, R.raw.ping);
        one.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                mp.start();
                Showalert();
            }
        });
        alertlistview.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                mp.start();
                Showalert4();
            }
        });
        two.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                mp.start();
                Showalert2();
            }
        });
        three.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                mp.start();
                Showalert3();
            }
        });
    }

    public  void Showalert()
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("One Alert Dialog Box");
        builder.setTitle("Android Programming");
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext()," You clicked OK Button",Toast.LENGTH_SHORT).show();

            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();

    }
    public  void Showalert4()
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
       // builder.setMessage("Single Alert Dialog Box");
        builder.setTitle("Choose Alert Type");
        String[] animals= {"One Alert","Two Alert","Three Alert","alertListview"};
        builder.setItems(animals, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
             switch (which)
             { case 0:
                 Toast.makeText(getApplicationContext(),"One Alert",Toast.LENGTH_SHORT).show();
                 case  1:
                     Toast.makeText(getApplicationContext(),"Two Alert",Toast.LENGTH_SHORT).show();
                 case  2:
                     Toast.makeText(getApplicationContext(),"Three Alert",Toast.LENGTH_SHORT).show();

                 case 3:
                     Toast.makeText(getApplicationContext()," Alert ListView",Toast.LENGTH_SHORT).show();


             }
            }
        });
          AlertDialog dialog = builder.create();
        dialog.show();

    }
    public  void Showalert3()
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Share This Application To Your Friend");
        builder.setTitle("Android Programming");
        builder.setPositiveButton("Share", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                String shareBody = "  Hi I am new in writing tutorial for the Android Development Please Support Me ";
                String shareSub = "PKAndroidTutorial";
                sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, shareSub);
                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(sharingIntent, "Share using"));
            }
        });
        builder.setNeutralButton("Remind Me Later", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                Toast.makeText(getApplicationContext()," You clicked Remind me Later",Toast.LENGTH_SHORT).show();

            }
        });
        builder.setNegativeButton("Cancel",null);

        AlertDialog dialog = builder.create();
        dialog.show();

    }
    public  void Showalert2()
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Would you Like to Continue ?");
        builder.setTitle("Android Programming");
        builder.setPositiveButton("Continue", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(),"You Clicked Continue Button",Toast.LENGTH_SHORT).show();

            }
        });
        builder.setNegativeButton("Cancel",null);

        AlertDialog dialog = builder.create();
        dialog.show();

    }
}

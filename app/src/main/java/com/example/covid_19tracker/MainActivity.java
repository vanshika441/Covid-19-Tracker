package com.example.covid_19tracker;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUTTIME  = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent registrationIntent = new Intent(MainActivity.this,Home.class);
                startActivity(registrationIntent);
                finish();

            }
        },SPLASH_TIME_OUTTIME);
    }

}
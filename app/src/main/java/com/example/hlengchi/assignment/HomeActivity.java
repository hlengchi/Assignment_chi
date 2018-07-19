package com.example.hlengchi.assignment;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT=4000;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen_bmi);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeInten=new Intent(HomeActivity.this,BmiCalculatorActivity.class);
                startActivity(homeInten);
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}

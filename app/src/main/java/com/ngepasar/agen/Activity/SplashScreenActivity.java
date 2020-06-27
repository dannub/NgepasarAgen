package com.ngepasar.agen.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;

import com.ngepasar.agen.R;

public class SplashScreenActivity extends AppCompatActivity {
    private int splash = 3000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainIntent = new Intent(SplashScreenActivity.this, MainActivity.class);
                //  MainActivity.showCart = false;
                startActivity(mainIntent);
                finish();
            }
            public  void  finish(){
                SplashScreenActivity.this.finish();
            }
        },splash);



    }
}
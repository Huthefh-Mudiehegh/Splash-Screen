package com.huthfy.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

/**
 *  to create splash screen we have three ways
 *  1- the old school habit
 *  2- launcher theme (recommended)
 *  3- splash screen api
*/


public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
// create splash screen by launcher theme
//        new Handler().postDelayed(
//                () -> {
//                    startActivity(new Intent(Splash.this, MainActivity.class));
//                    finish();
//                },
//                2000);


        // create splash screen by old way
         setContentView(R.layout.activity_splash);
         getSupportActionBar().hide();
         getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
         new Handler().postDelayed(
                 () -> {
                     startActivity(new Intent(Splash.this, MainActivity.class));
                     finish();
                 },
                 2000);
    }
}
package com.example.archit.androidtutorial;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Thread(){
            public void run(){
                try{
                    sleep(3000);
                    startActivity(new Intent(Splash.this,LoginActivity.class));
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }.start();


    }

    @Override
    protected void onStop() {
        super.onStop();
        finish();
    }
}

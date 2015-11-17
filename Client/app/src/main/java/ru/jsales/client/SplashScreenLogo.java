package ru.jsales.client;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SplashScreenLogo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen_logo);
        //thread for the  splash screen:
        Thread splash_time = new Thread()
        {
            public void run()
            {
                try
                {
                    //Time yo show logo:
                    int SplashTimer = 0;
                    /* 3 seconds (TODO: time depends on the loading process) */
                    while(SplashTimer < 3000) {
                        sleep(100);
                        SplashTimer = SplashTimer +100;
                    };
                }
                catch (InterruptedException e) {
                    e.printStackTrace(); }
            }
        };
        splash_time.start();
        startActivity(new Intent(SplashScreenLogo.this, MainActivity.class));
    }
}

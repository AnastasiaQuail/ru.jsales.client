package ru.jsales.client;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashScreenLogo extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen_logo);
        final ImageView logo = (ImageView) findViewById(R.id.splash_logo);
       // final Animation anim_logo = AnimationUtils.loadAnimation(R.id.abc_fade_out);
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
                    while(SplashTimer < 300) {
                        sleep(100);
                        SplashTimer = SplashTimer +100;
                    };
                }
                catch (InterruptedException e) {
                    e.printStackTrace(); }
            }
        };
        splash_time.start();
        Intent i = new Intent(getBaseContext(), MainActivity.class);
        startActivity(i);
    }
}

package com.example.apps.splashscreen;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.ProgressBar;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.apps.R;


public class SplashScreenActivity extends AppCompatActivity {

    private int ms = 0;
    private int splashTime = 2000;
    private boolean splashActive = true;
    private boolean paused = false;

    private ProgressBar progressBar;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        /*
        progressBar = findViewById(R.id.progressBar);
        Thread thread = new Thread(() -> {
            try {
                while(ms < splashTime) {
                    ms += 100;
                    Thread.sleep(100);
                }
            } catch (Exception e) {
                e.fillInStackTrace();
            } finally {
                startActivity(new Intent(this, MainSplashActivity.class));
            }
        });
        thread.start();
         */
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        super.onKeyDown(keyCode,event);
        if(keyCode == KeyEvent.KEYCODE_MENU) {
            startActivity(new Intent(this, MainSplashActivity.class));
        }
        if(keyCode == KeyEvent.KEYCODE_BACK) {
            finish();
        }
        return false;
    }
}

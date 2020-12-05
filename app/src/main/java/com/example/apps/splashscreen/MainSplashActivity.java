package com.example.apps.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.apps.R;
import com.example.apps.splashscreen.ui.main.MainSplashFragment;

public class MainSplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_splash_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MainSplashFragment.newInstance())
                    .commitNow();
        }
    }
}
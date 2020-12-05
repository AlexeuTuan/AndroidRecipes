package com.example.apps.chargecontrol;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.apps.R;
import com.example.apps.chargecontrol.receiver.BlankFragment;

public class ChargeControlActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(savedInstanceState == null) {
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction()
                    .replace(R.id.fragment_container, new BlankFragment());
            ft.commit();
        }
    }
}
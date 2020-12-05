package com.example.chargecontrol;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MyFragment extends VisibleFragment {

    public MyFragment() {

    }

    public static MyFragment newInstance() {
        MyFragment fragment = new MyFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_blank, container, false);
        return v;
    }

    @Override
    public void onResume() {
        super.onResume();
        Intent i = new Intent(ACTION_SHOW_NOTIFICATION);
        getActivity().sendOrderedBroadcast(i, PERM_PRIVATE, new StartupReceiver(), null,
                Activity.RESULT_OK, null, null);
    }
}
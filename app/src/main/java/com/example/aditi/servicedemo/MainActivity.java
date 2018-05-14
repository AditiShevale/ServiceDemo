package com.example.aditi.servicedemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startService(View view) {
        Intent i1 = new Intent(this,MyOwnService.class);
        startService(i1);
    }

    public void stopService(View view) {
        Intent i1 = new Intent(this,MyOwnService.class);
        stopService(i1);
    }
}

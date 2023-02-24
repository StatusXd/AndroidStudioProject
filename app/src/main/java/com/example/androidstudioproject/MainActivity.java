package com.example.androidstudioproject;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    final String TAG = "ACTIVITY_STATE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast toast = Toast.makeText(getApplicationContext(), "onCreate",Toast.LENGTH_LONG);
        toast.show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast toast = Toast.makeText(getApplicationContext(), "onStart",Toast.LENGTH_LONG);
        toast.show();
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast toast = Toast.makeText(getApplicationContext(), "onStop",Toast.LENGTH_LONG);
        toast.show();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast toast = Toast.makeText(getApplicationContext(), "onDestroy",Toast.LENGTH_LONG);
        toast.show();
    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast toast = Toast.makeText(getApplicationContext(), "onPause",Toast.LENGTH_LONG);
        toast.show();
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast toast = Toast.makeText(getApplicationContext(), "onResume",Toast.LENGTH_LONG);
        toast.show();
    }

    public void onClick(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}

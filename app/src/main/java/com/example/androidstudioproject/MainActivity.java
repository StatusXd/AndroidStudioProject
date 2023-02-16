package com.example.androidstudioproject;

import androidx.appcompat.app.AppCompatActivity;

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
        Log.d(TAG, "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast toast = Toast.makeText(getApplicationContext(), "onStart",Toast.LENGTH_LONG);
        toast.show();
        Log.d(TAG, "onStart");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast toast = Toast.makeText(getApplicationContext(), "onStop",Toast.LENGTH_LONG);
        toast.show();
        Log.d(TAG, "onStop");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast toast = Toast.makeText(getApplicationContext(), "onDestroy",Toast.LENGTH_LONG);
        toast.show();
        Log.d(TAG, "onDestroy");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast toast = Toast.makeText(getApplicationContext(), "onPause",Toast.LENGTH_LONG);
        toast.show();
        Log.d(TAG, "onPause");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast toast = Toast.makeText(getApplicationContext(), "onResume",Toast.LENGTH_LONG);
        toast.show();
        Log.d(TAG, "onResume");
    }
}

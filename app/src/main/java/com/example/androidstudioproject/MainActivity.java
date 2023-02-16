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
        Log.d(TAG, "onCreate");
    }

    public  void onClick(View view){
        Toast toast = Toast.makeText(this, "Это Тост",Toast.LENGTH_LONG);
        toast.show();
        Log.d(TAG, "onClick");
    }
}
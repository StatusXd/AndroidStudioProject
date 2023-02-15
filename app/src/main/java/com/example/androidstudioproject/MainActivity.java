package com.example.androidstudioproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void onClick(View view){
        Toast toast = Toast.makeText(this, "Это Тост",Toast.LENGTH_LONG);
        toast.show();
    }
}
package com.example.androidstudioproject;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    final String TAG = "ACTIVITY_STATE";
    String s;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.constraint_layout);
        Toast toast = Toast.makeText(getApplicationContext(), "onCreate",Toast.LENGTH_LONG);
        toast.show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast toast = Toast.makeText(getApplicationContext(), "onStart",Toast.LENGTH_LONG);
        toast.show();



        TextView textView = findViewById(R.id.textView2);
        textView.setText(R.string.flightscope);

        ImageView iv = findViewById(R.id.imageView4);
        iv.setImageResource(R.drawable.airplane);

        ImageButton account = findViewById(R.id.imageButton5);

        editText = findViewById(R.id.editText);

        account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(TAG, "Нажали на кнопку входа в аккаунт");
            }
        });
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

    public void OnSearchClick(View v) {
        Log.i(TAG, "Нажали на кнопку поиска");
        s = editText.getText().toString();
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("flightnum", s);
        startActivity(intent);
    }
}

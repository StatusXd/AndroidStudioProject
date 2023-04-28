package com.example.androidstudioproject.UI.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;

import com.example.androidstudioproject.Data.RecModule;
import com.example.androidstudioproject.R;
import com.example.androidstudioproject.UI.viewHolder.RecAdapter;


import java.util.ArrayList;

public class ThirdWindow extends AppCompatActivity {

    ArrayList<RecModule> states = new ArrayList<RecModule>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_window);
        // начальная инициализация списка
        setInitialData();
        RecyclerView recyclerView = findViewById(R.id.list);
        // создаем адаптер
        RecAdapter adapter = new RecAdapter(this, states);
        // устанавливаем для списка адаптер
        recyclerView.setAdapter(adapter);
    }

    private void setInitialData(){
        states.add(new RecModule ("Рейс№228", "Бразилиа", R.drawable.airplane));
        states.add(new RecModule ("Рейс№1337", "Буэнос-Айрес", R.drawable.airplane));
        states.add(new RecModule ("Рейс№777", "Богота", R.drawable.airplane));
        states.add(new RecModule ("Рейс№548395", "Монтевидео", R.drawable.airplane));
        states.add(new RecModule ("Рейс№какой-то", "Сантьяго", R.drawable.airplane));
        states.add(new RecModule ("Рейс№тыитактут", "Москва", R.drawable.airplane));
        states.add(new RecModule ("Рейс№Унаслучше", "Лос-Анджелес", R.drawable.airplane));
        states.add(new RecModule ("Рейс№здесьцифры", "Париж", R.drawable.airplane));
        states.add(new RecModule ("Рейс№мммколбаски", "Берлин", R.drawable.airplane));
        states.add(new RecModule ("Рейс№14543688", "Киев", R.drawable.airplane));
        for (int i = 0; i<200; i++){
            states.add(new RecModule("Рейс№"+i, "Недоступно", R.drawable.airplane));
        }
    }
}
package com.example.androidstudioproject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;

public class SecondWindow extends ListActivity {

    ArrayList<ListModule> states = new ArrayList<ListModule>();
    ListView countriesList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_window);
        // начальная инициализация списка
        setInitialData();
        // получаем элемент ListView
        countriesList = findViewById(R.id.list);
        // создаем адаптер
        ListAdapter listAdapter = new ListAdapter(this, R.layout.list_item, states);
        // устанавливаем адаптер
        countriesList.setAdapter(listAdapter);
        // слушатель выбора в списке
        AdapterView.OnItemClickListener itemListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                Toast.makeText(getApplicationContext(), "Рейс недоступен", Toast.LENGTH_SHORT).show();

                Log.i("List item clicked", "List item clicked");
            }
        };
        countriesList.setOnItemClickListener(itemListener);
    }
    private void setInitialData() {

        states.add(new ListModule("Рейс№228", "Бразилиа", R.drawable.airplane));
        states.add(new ListModule("Рейс№1337", "Буэнос-Айрес", R.drawable.airplane));
        states.add(new ListModule("Рейс№777", "Богота", R.drawable.airplane));
        states.add(new ListModule("Рейс№548395", "Монтевидео", R.drawable.airplane));
        states.add(new ListModule("Рейс№какой-то", "Сантьяго", R.drawable.airplane));
        states.add(new ListModule("Рейс№тыитактут", "Москва", R.drawable.airplane));
        states.add(new ListModule("Рейс№Унаслучше", "Лос-Анджелес", R.drawable.airplane));
        states.add(new ListModule("Рейс№здесьцифры", "Париж", R.drawable.airplane));
        states.add(new ListModule("Рейс№мммколбаски", "Берлин", R.drawable.airplane));
        states.add(new ListModule("Рейс№14543688", "Киев", R.drawable.airplane));
        for (int i = 0; i < 200; i++) {
            states.add(new ListModule("Рейс№" + i, "Недоступно", R.drawable.airplane));
        }
    }
}
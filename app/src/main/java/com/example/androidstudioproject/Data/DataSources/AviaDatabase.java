package com.example.androidstudioproject.Data.DataSources;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;


import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database(entities = {AviaEntity.class}, version = 1)
public abstract class AviaDatabase extends RoomDatabase {
    public Executor databaseWriteExecutor;

    public abstract AviaDao aviaDao();
    private static volatile AviaDatabase INSTANCE;

    public static AviaDatabase getDatabase(final Context context){
        if (INSTANCE == null){
            System.out.println("hello from database");
            synchronized (AviaDatabase.class){
                if (INSTANCE == null){
                    INSTANCE = Room.databaseBuilder(
                            context.getApplicationContext(),
                            AviaDatabase.class,
                            "avia_database")
                            .build();
                }
            }
        }
        return INSTANCE;
    }
}

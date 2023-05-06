package com.example.androidstudioproject.Data.DataSources.Room.Database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;


import com.example.androidstudioproject.Data.DataSources.Room.Entity.AviaEntity;
import com.example.androidstudioproject.Data.DataSources.Room.Dao.AviaDao;

import java.util.concurrent.Executor;

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

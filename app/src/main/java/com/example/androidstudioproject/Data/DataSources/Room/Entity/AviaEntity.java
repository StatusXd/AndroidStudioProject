package com.example.androidstudioproject.Data.DataSources.Room.Entity;

import android.text.style.IconMarginSpan;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Avia")
public class AviaEntity {
    @PrimaryKey(autoGenerate = true)
    public int uid;
    @ColumnInfo(name = "track")
    public String track;

    public AviaEntity(@NonNull String track){
        this.track = track;
    }

    public static <Y, X> Y toDomainModel(X x) {
    }
}

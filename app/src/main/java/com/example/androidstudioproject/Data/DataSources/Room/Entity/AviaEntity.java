package com.example.androidstudioproject.Data.DataSources.Room.Entity;

import android.text.style.IconMarginSpan;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.example.androidstudioproject.Data.Models.TrackModel;

@Entity(tableName = "Avia")
public class AviaEntity {
    @PrimaryKey(autoGenerate = true)
    public int uid;
    @ColumnInfo(name = "track")
    public String track;
    @ColumnInfo(name = "img")
    public int img;

    public AviaEntity(@NonNull String track, @NonNull int img){
        this.track = track;
        this.img = img;
    }

    public TrackModel toDomainModel(){
        return new TrackModel(track, img);
    }
}

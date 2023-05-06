package com.example.androidstudioproject.Data.Repositories;

import android.content.Context;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.androidstudioproject.Data.DataSources.Room.Database.AviaDatabase;
import com.example.androidstudioproject.Data.DataSources.Room.Entity.AviaEntity;
import com.example.androidstudioproject.Data.DataSources.TrackDataSource;
import com.example.androidstudioproject.Data.Models.TrackModel;

import java.util.LinkedList;
import java.util.List;

public class TrackRepository {
    private final TrackDataSource trackDataSource;
    private final AviaDatabase aviaDatabase;

    public TrackRepository(Context context) {
        trackDataSource = new TrackDataSource();
        aviaDatabase = AviaDatabase.getDatabase(context);
    }

    public MutableLiveData<LinkedList<TrackModel>> getTracks() {
        return trackDataSource.getTracks();
    }

    public void addTrack(TrackModel trackModel){
        aviaDatabase.databaseWriteExecutor.execute(() ->{
            aviaDatabase.aviaDao().insert(
                    new AviaEntity(trackModel.getTrack(), trackModel.getImg()
                    ));
        });
    }

    public void deleteAll(){
        aviaDatabase.databaseWriteExecutor.execute(()->
                aviaDatabase.aviaDao().deleteAll());
    }

    public LiveData<List<TrackModel>> getDatabaseData(){
        return null;
    }
}



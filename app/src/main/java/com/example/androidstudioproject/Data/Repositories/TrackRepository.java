package com.example.androidstudioproject.Data.Repositories;

import androidx.lifecycle.MutableLiveData;

import com.example.androidstudioproject.Data.DataSources.Room.Database.AviaDatabase;
import com.example.androidstudioproject.Data.DataSources.Room.Entity.AviaEntity;
import com.example.androidstudioproject.Data.DataSources.TrackDataSource;
import com.example.androidstudioproject.Data.Models.TrackModel;

import java.util.LinkedList;

public class TrackRepository {
    private final TrackDataSource trackDataSource;
    private final AviaDatabase aviaDatabase;

    public TrackRepository(AviaDatabase aviaDatabase) {
        this.aviaDatabase = aviaDatabase;
        trackDataSource = new TrackDataSource();
    }

    public MutableLiveData<LinkedList<TrackModel>> getTracks() {
        return trackDataSource.getTracks();
    }

    public void addTrack(TrackModel trackModel){
        aviaDatabase.databaseWriteExecutor.execute(() ->{
            aviaDatabase.aviaDao().insert(
                    new AviaEntity(trackModel.getTrack()
                    ));
        });
    }

    public void deleteAll(){
        aviaDatabase.databaseWriteExecutor.execute(()->
                aviaDatabase.aviaDao().deleteAll());
    }
}



package com.example.androidstudioproject.Data.Repositories;

import androidx.lifecycle.MutableLiveData;

import com.example.androidstudioproject.Data.DataSources.TrackDataSource;
import com.example.androidstudioproject.Data.Models.TrackModel;

import java.util.LinkedList;

public class TrackRepository {
    private final TrackDataSource trackDataSource;

    public TrackRepository() {
        trackDataSource = new TrackDataSource();
    }

    public MutableLiveData<LinkedList<TrackModel>> getTracks() {
        return trackDataSource.getTracks();
    }
}



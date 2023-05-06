package com.example.androidstudioproject.Data.DataSources;

import androidx.lifecycle.MutableLiveData;

import com.example.androidstudioproject.Data.Models.TrackModel;
import com.example.androidstudioproject.R;

import java.util.LinkedList;

public class TrackDataSource {
    private final LinkedList<TrackModel> tracks = new LinkedList<>();

    public TrackDataSource() {
        for (int i = 100; i <= 150; i++) {
            TrackModel track = new TrackModel(" " + (char) i, R.drawable.airplane);
            tracks.add(track);
        }
    }

    public MutableLiveData<LinkedList<TrackModel>> getTracks() {
        return new MutableLiveData<>(tracks);
    }
}



package com.example.androidstudioproject.Data;

import com.example.androidstudioproject.R;

import java.util.LinkedList;
import java.util.List;

public class TrackDataSource {
    private final List<TrackDTO> traks = new LinkedList<>();

    public TrackDataSource(){
        for(int i = 100; i <= 150; i++) {
            TrackDTO track = new TrackDTO(" " + (char) i, R.drawable.airplane);
            traks.add(track);
        }
    }

    public List<TrackDTO> getTraks() {
        return traks;
    }
}

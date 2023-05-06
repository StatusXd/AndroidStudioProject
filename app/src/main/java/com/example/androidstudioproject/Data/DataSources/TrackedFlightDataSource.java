package com.example.androidstudioproject.Data.DataSources;

import android.content.Context;

import com.example.androidstudioproject.Data.Models.TrackModel;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TrackedFlightDataSource {
    String filename = "tracked_flight";

    public void TrackedFlight(TrackModel track){
        File tracked_flight = new File("/storage/emulated/0/Android/data", filename);
        try (FileWriter writer = new FileWriter(tracked_flight)){
            writer.write(track.getTrack());
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}

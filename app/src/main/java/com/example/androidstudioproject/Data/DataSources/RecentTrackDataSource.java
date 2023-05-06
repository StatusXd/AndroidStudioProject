package com.example.androidstudioproject.Data.DataSources;

import android.content.Context;

import com.example.androidstudioproject.Data.Models.TrackModel;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class RecentTrackDataSource {
    private final File dir;

    public RecentTrackDataSource(Context context){
        dir = context.getApplicationContext().getFilesDir();
    }

    public void RecentTrack(TrackModel track){
        File recent_track = new File(dir, "recent_track");
        try (FileWriter writer = new FileWriter(recent_track)){
            writer.write(track.getTrack());
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}

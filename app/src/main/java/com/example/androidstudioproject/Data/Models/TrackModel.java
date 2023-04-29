package com.example.androidstudioproject.Data.Models;

public class TrackModel {
    private final String track;
    private final int img;

    public TrackModel(String track, int img){
        this.track = track;
        this.img = img;
    }

    public TrackModel(TrackModel trackModel){
        this.track = trackModel.getTrack();
        this.img = trackModel.getImg();
    }

    public String getTrack() {
        return track;
    }

    public int getImg() {
        return img;
    }
}



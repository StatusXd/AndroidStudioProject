package com.example.androidstudioproject.Data;

public class TrackModel {
    private final String track;
    private final int img;

    public TrackModel(String track, int img){
        this.track = track;
        this.img = img;
    }

    public TrackModel(TrackDTO trackDTO){
        this.track = trackDTO.getTrack();
        this.img = trackDTO.getImg();
    }

    public String getTrack() {
        return track;
    }

    public int getImg() {
        return img;
    }
}

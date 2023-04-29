package com.example.androidstudioproject.Data;

public class TrackDTO {
    private final String track;
    private final int img;

    public TrackDTO(String track, int img){
        this.track = track;
        this.img = img;
    }

    public String getTrack() {
        return track;
    }

    public int getImg() {
        return img;
    }
}

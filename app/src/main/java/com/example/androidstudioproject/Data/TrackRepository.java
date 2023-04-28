package com.example.androidstudioproject.Data;

public class TrackRepository {
    private String track;
    private int img;

    public TrackRepository(String track, int img){
        this.track = track;
        this.img = img;
    }

    public TrackRepository() {

    }

    public int getImg() {
        return img;
    }
}

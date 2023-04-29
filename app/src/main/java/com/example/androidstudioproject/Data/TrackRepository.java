package com.example.androidstudioproject.Data;

import java.util.Iterator;

public class TrackRepository {
    private final TrackDataSource trackDataSource;
    private static TrackRepository INSTANSE;
    private Iterator<TrackDTO> iter;
    private TrackDTO current;

    public TrackRepository() {
        trackDataSource = new TrackDataSource();
        iter = trackDataSource.getTraks().listIterator();
        current = iter.next();
    }

    public static TrackRepository getInstance(){
        if (INSTANSE == null){
            INSTANSE = new TrackRepository();
        }
        return INSTANSE;
    }

    public TrackDTO getCurrent() {
        return current;
    }
}

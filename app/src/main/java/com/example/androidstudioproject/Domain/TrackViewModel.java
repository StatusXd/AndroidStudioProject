package com.example.androidstudioproject.Domain;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.androidstudioproject.Data.TrackRepository;

public class TrackViewModel extends ViewModel {
    private final MutableLiveData<TrackRepository> track =
            new MutableLiveData<>(new TrackRepository());

    public LiveData<TrackRepository> getTrack(){ return track; }

    public void setTrack(String tracker){
        track.setValue(
                new TrackRepository(
                        tracker,
                        track.getValue().getImg()
                )
        );
    }
}

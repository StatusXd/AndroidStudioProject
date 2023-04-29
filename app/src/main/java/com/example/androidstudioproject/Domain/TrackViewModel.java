package com.example.androidstudioproject.Domain;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.androidstudioproject.Data.TrackModel;
import com.example.androidstudioproject.Data.TrackRepository;

public class TrackViewModel extends ViewModel {
    private final TrackRepository trackRepository = TrackRepository.getInstance();

    private final MutableLiveData<TrackModel> track =
            new MutableLiveData<>(new TrackModel(trackRepository.getCurrent()));

    public LiveData<TrackModel> getTrack(){
        return track;
    }

    public void setTrack(String tracker){
        track.setValue(
                new TrackModel(
                        tracker,
                        track.getValue().getImg()
                )
        );
    }
}

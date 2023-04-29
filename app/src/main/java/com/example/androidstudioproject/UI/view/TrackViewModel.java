package com.example.androidstudioproject.UI.view;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.androidstudioproject.Data.Models.TrackModel;
import com.example.androidstudioproject.Data.Repositories.TrackRepository;

import java.util.LinkedList;

public class TrackViewModel extends ViewModel {
    private final TrackRepository trackRepository;
    private final MutableLiveData<LinkedList<TrackModel>> tracks;

    public TrackViewModel(TrackRepository trackRepository) {
        this.trackRepository = trackRepository;
        tracks = trackRepository.getTracks();
    }
    public MutableLiveData<LinkedList<TrackModel>> getTracks(){
        return tracks;
    }
}



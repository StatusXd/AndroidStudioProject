package com.example.androidstudioproject.UI.view;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import com.example.androidstudioproject.R;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


public class SecondViewFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_second_view, container, false);

        ListView listView = (ListView) rootView.findViewById(R.id.listView);



        return rootView;
    }
}
package com.example.androidstudioproject;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class FirstWindowFragment extends Fragment implements View.OnClickListener {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_first_window,
                container, false);

        Button searchButton = (Button) rootView.findViewById(R.id.searchButton);
        ImageButton viewedButton = (ImageButton) rootView.findViewById(R.id.viewedButton);

        searchButton.setOnClickListener(this);
        viewedButton.setOnClickListener(this);

        return rootView;
    }

    int translateIdToIndex(int id) {
        int index = -1;
        switch (id) {
            case R.id.searchButton:
                index = 1;
                break;
            case R.id.viewedButton:
                index = 2;
                break;
        }
        return index;
    }

    @Override
    public void onClick(View view) {
        int buttonIndex = translateIdToIndex(view.getId());

        Toast.makeText(getActivity(), String.valueOf(buttonIndex),
                Toast.LENGTH_SHORT).show();

        OnSelectedButtonListener listener = (OnSelectedButtonListener) getActivity();
        listener.onButtonSelected(buttonIndex);
    }

    public interface OnSelectedButtonListener {
        void onButtonSelected(int buttonIndex);
    }
}
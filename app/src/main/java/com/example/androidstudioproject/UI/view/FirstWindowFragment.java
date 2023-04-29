package com.example.androidstudioproject.UI.view;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.androidstudioproject.R;

public class FirstWindowFragment extends Fragment {
    private TrackViewModel model;

    public void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        model = new ViewModelProvider(this).get(TrackViewModel.class);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_first_window,
                container, false);



        Button searchButton = (Button) rootView.findViewById(R.id.searchButton);
        ImageButton viewedButton = (ImageButton) rootView.findViewById(R.id.viewedButton);

        FragmentFirstWinndowBinding binding = FragmentFirstWinndowBinding.inflate(inflater, container,
                false);

        model.getTracks().observe(getViewLifecycleOwner(), t-> {
            binding.trackNum.setText(t.getTracks());
        });

        View.OnClickListener serBut = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        };

        View.OnClickListener vieBut = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        };

        searchButton.setOnClickListener(serBut);
        viewedButton.setOnClickListener(vieBut);

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
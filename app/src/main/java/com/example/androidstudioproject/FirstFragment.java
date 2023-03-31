package com.example.androidstudioproject;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class FirstFragment extends Fragment {
    final String TAG = "FirstFragment";

    public FirstFragment(){
        super(R.layout.fragment_first);
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Context context = getActivity().getApplicationContext();
        Toast toast = Toast.makeText(context, "onCreate toast",Toast.LENGTH_LONG);
        toast.show();
        Log.i(TAG, "creating fragment");
//        getParentFragmentManager().setFragmentResultListener("requestKey ",
//                this, new FragmentResultListener() {
//                @Override
//                public void onFragmentResult(@NonNull String requestKey, @NonNull Bundle bundle) {
//                    String result = bundle.getString("bundleKey");
//                }
//        });
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @NonNull ViewGroup container,
                             @NonNull Bundle savedInstanceState) {
        Context context = getActivity().getApplicationContext();
        Toast toast = Toast.makeText(context, "onCreateView toast",Toast.LENGTH_LONG);
        toast.show();
        Log.i(TAG, "creating view fragment");
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onViewCreated( @NonNull View view, @Nullable Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);
        Context context = getActivity().getApplicationContext();
        Toast toast = Toast.makeText(context, "onViewCreated toast",Toast.LENGTH_LONG);
        toast.show();
        Log.i(TAG, "on view created fragment");
    }
}


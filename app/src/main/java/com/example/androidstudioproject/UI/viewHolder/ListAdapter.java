package com.example.androidstudioproject.UI.viewHolder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.androidstudioproject.Data.Models.ListModule;
import com.example.androidstudioproject.R;

import java.util.List;

public class ListAdapter extends ArrayAdapter<ListModule> {

    private final LayoutInflater inflater;
    private final int layout;
    private final List<ListModule> states;

    public ListAdapter(Context context, int resource, List<ListModule> states) {
        super(context, resource, states);
        this.states = states;
        this.layout = resource;
        this.inflater = LayoutInflater.from(context);
    }
    public View getView(int position, View convertView, ViewGroup parent) {

        View view=inflater.inflate(this.layout, parent, false);

        ImageView flagView = view.findViewById(R.id.flag);
        TextView nameView = view.findViewById(R.id.name);
        TextView numberView = view.findViewById(R.id.capital);

        ListModule state = states.get(position);

        flagView.setImageResource(state.getFlag());
        nameView.setText(state.getName());
        numberView.setText(state.getNumber());

        return view;
    }
}

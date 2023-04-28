package com.example.androidstudioproject.UI.viewHolder;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.example.androidstudioproject.Data.RecModule;
import com.example.androidstudioproject.R;

import java.util.List;

public class RecAdapter extends RecyclerView.Adapter<RecAdapter.ViewHolder>{

    private final LayoutInflater inflater;
    private final List<RecModule> states;
    private final Context context;

    public RecAdapter(Context context, List<RecModule> states) {
        this.states = states;
        this.inflater = LayoutInflater.from(context);
        this.context = context;
    }
    @Override
    public RecAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.reclist_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecAdapter.ViewHolder holder, int position) {
        RecModule state = states.get(position);
        holder.flagView.setImageResource(state.getFlagResource());
        holder.nameView.setText(state.getName());
        holder.capitalView.setText(state.getCapital());
        holder.flagView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CharSequence text = "Нет инормации о рейсе";
                Toast.makeText(context, text, Toast.LENGTH_SHORT).show();

                Log.i("RecyclerView", "List item clicked");
            }
        });
    }

    @Override
    public int getItemCount() {
        return states.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView flagView;
        final TextView nameView, capitalView;
        ViewHolder(View view){
            super(view);
            flagView = view.findViewById(R.id.flag);
            nameView = view.findViewById(R.id.name);
            capitalView = view.findViewById(R.id.capital);
        }
    }
}

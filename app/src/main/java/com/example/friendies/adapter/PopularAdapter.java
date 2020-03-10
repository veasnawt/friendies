package com.example.friendies.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.friendies.R;
import com.example.friendies.holder.PopularHolder;
import com.example.friendies.model.PopularModel;

import java.util.ArrayList;

public class PopularAdapter extends RecyclerView.Adapter<PopularHolder> {

    Context context;

    ArrayList<PopularModel> listModel;

    public PopularAdapter(Context context, ArrayList<PopularModel> listModel){
        this.context = context;
        this.listModel = listModel;
    }

    @NonNull
    @Override
    public PopularHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.popular_item, null);
        return new PopularHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PopularHolder holder, int position) {
        holder.imgCover.setImageResource(listModel.get(position).getImgCover());
    }

    @Override
    public int getItemCount() {
        return listModel.size();
    }
}


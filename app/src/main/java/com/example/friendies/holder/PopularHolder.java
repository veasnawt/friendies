package com.example.friendies.holder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.friendies.R;

public class PopularHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public ImageView imgCover;

    public PopularHolder(@NonNull View itemView) {
        super(itemView);

        this.imgCover = itemView.findViewById(R.id.imgCover);
    }

    @Override
    public void onClick(View v) {

    }
}



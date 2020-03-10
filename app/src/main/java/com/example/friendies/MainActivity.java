package com.example.friendies;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.friendies.adapter.PopularAdapter;
import com.example.friendies.model.PopularModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView popular_recyclerview;
    PopularAdapter adapter;
    ArrayList<PopularModel> popularModels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        popular_recyclerview = findViewById(R.id.popular_recyclerview);
        popularModels = new ArrayList<>();

        for(int i = 0; i < 5; i++){
            PopularModel model = new PopularModel();
            model.setImgCover(R.drawable.popularbook);
            popularModels.add(model);

        }

        popular_recyclerview.setLayoutManager(new LinearLayoutManager(this));
        adapter = new PopularAdapter(this,popularModels);
        popular_recyclerview.setAdapter(adapter);
    }
}

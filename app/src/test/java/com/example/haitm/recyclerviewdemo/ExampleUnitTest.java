package com.example.haitm.recyclerviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    RecyclerViewAdapter mRcvAdapter;
    List<String> data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        data = new ArrayList<>();
        data.add("Táo");
        data.add("Củ Dền");
        data.add("Ngò Rí");
        data.add("Cà Chua");
        data.add("Trái bơ");
        data.add("Quả Lê");
        data.add("Cà Tím");
        data.add("Trái Nho");
        data.add("Trái Xoài");
        data.add("Trái Cam");
        data.add("Hoa Hướng Dương");
        data.add("Quả Dưa Hấu");
        data.add("Hoa Dâm Bụt");
        data.add("Hoa Lan Giả Hạc");
        
        mRcvAdapter = new RecyclerViewAdapter(data);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setAdapter(mRcvAdapter);

    }
}

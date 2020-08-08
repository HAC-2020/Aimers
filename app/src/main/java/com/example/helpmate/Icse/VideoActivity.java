package com.example.helpmate.Icse;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.example.helpmate.R;

import java.util.ArrayList;

public class VideoActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    ArrayList<DataSetList> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        arrayList = new ArrayList<DataSetList>();
        //https://www.youtube.com/watch?v=YVfyYrEmzgM

        DataSetList dataSetList = new DataSetList("https://www.youtube.com/embed/sTIwVt_YE98");
        arrayList.add(dataSetList);
        dataSetList = new DataSetList("https://www.youtube.com/embed/nVzB0dhTCAU");
        arrayList.add(dataSetList);
        dataSetList = new DataSetList("https://www.youtube.com/embed/CoZPtDL369o");
        arrayList.add(dataSetList);
        dataSetList = new DataSetList("https://www.youtube.com/embed/6Twvh06a6jk");
        arrayList.add(dataSetList);
        dataSetList = new DataSetList("https://www.youtube.com/embed/xr2WhWhCuDM");
        arrayList.add(dataSetList);

        YoutubeAdapter youtubeAdapter = new YoutubeAdapter(arrayList,getApplicationContext());
        recyclerView.setAdapter(youtubeAdapter);

    }
}
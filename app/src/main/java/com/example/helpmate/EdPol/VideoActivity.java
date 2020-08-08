package com.example.helpmate.EdPol;

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
        DataSetList dataSetList =  new DataSetList("https://www.youtube.com/embed/AZnAjbB3e7E");
        arrayList.add(dataSetList);
        dataSetList = new DataSetList("https://www.youtube.com/embed/XxtnKkPMjKg");
        arrayList.add(dataSetList);
        dataSetList = new DataSetList("https://www.youtube.com/embed/i7YnGK2eCtk");
        arrayList.add(dataSetList);
        dataSetList = new DataSetList("https://www.youtube.com/embed/bdibELlgCoA");
        arrayList.add(dataSetList);
        dataSetList = new DataSetList("https://www.youtube.com/embed/4MjBeib-7Us");
        arrayList.add(dataSetList);
        dataSetList = new DataSetList("https://www.youtube.com/embed/8tiQuiCdbkM");
        arrayList.add(dataSetList);


        YoutubeAdapter youtubeAdapter = new YoutubeAdapter(arrayList,getApplicationContext());
        recyclerView.setAdapter(youtubeAdapter);

    }
}
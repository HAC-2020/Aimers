package com.example.helpmate.Cbse;

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
        DataSetList dataSetList = new DataSetList("https://www.youtube.com/embed/nWhjf6l0tRs");
        arrayList.add(dataSetList);
        dataSetList = new DataSetList("https://www.youtube.com/embed/jR8Pl2iHHcg");
        arrayList.add(dataSetList);
        dataSetList = new DataSetList("https://www.youtube.com/embed/KdFVSpcjZyg");
        arrayList.add(dataSetList);
        dataSetList = new DataSetList("https://www.youtube.com/embed/e6U4Xn5XuIs");
        arrayList.add(dataSetList);
        dataSetList = new DataSetList("https://www.youtube.com/embed/iFwsKSEyAe0");
        arrayList.add(dataSetList);


        YoutubeAdapter youtubeAdapter = new YoutubeAdapter(arrayList,getApplicationContext());
        recyclerView.setAdapter(youtubeAdapter);

    }
}
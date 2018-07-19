package com.example.hlengchi.assignment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.hlengchi.assignment.adapter.MovieRecycleViewAdapter;
import com.example.hlengchi.assignment.model.Movie;

import java.util.ArrayList;

public class MovieRecycleViewActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_custom_recycleview_layout);
        recyclerView=findViewById(R.id.rvMovie);

        ArrayList<Movie> movies= new ArrayList<>();
        movies.add(new Movie(R.mipmap.ic_launcher_01,"The Predator - Added Full Trailer","SHANE BLACK",2018));
        movies.add(new Movie(R.mipmap.ic_launcher_02,"Beautiful Boy"," FELIX VAN GROENINGEN",2017));
        movies.add(new Movie(R.mipmap.ic_launcher_03,"Assassination Nation","PANOS COSMATOS",2016));
        movies.add(new Movie(R.mipmap.ic_launcher_04,"Support the Girls","ANDREW BUJALSK",2015));
        movies.add(new Movie(R.mipmap.ic_launcher_05,"Madeline's Madeline","JOSEPHINE DECKER",2014));
        movies.add(new Movie(R.mipmap.ic_launcher_06,"Dead Night","BRAD BARUH",2015));
        movies.add(new Movie(R.mipmap.ic_launcher_07,"The Legacy of a Whitetail Deer Hunter","JODY HILL",2012));
        MovieRecycleViewAdapter movieRecycleViewAdapter=new MovieRecycleViewAdapter(this,movies);
        recyclerView.setAdapter(movieRecycleViewAdapter);

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));




    }
}


package com.example.hlengchi.assignment.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hlengchi.assignment.R;
import com.example.hlengchi.assignment.model.Movie;

import java.util.ArrayList;

public class MovieRecycleViewAdapter extends RecyclerView.Adapter<ViewHolder> {
    private Context context;
    private ArrayList<Movie> movies;
    private LayoutInflater inflater;

    public MovieRecycleViewAdapter(Context context, ArrayList<Movie> movies) {
        this.context = context;
        this.movies = movies;
        this.inflater=LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View convertView=inflater.inflate(R.layout.list_custom_layout,parent,false);
        ViewHolder viewHolder=new ViewHolder(convertView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Movie movie=movies.get(position);
        ViewHolder.imageView.setImageResource(movie.getPicture());
        ViewHolder.textViewTitle.setText(movie.getTitle());
        ViewHolder.textViewDirector.setText(movie.getDirector());
        ViewHolder.textViewYear.setText(movie.getYear()+"");
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }
}

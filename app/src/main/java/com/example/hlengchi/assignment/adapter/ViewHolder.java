package com.example.hlengchi.assignment.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hlengchi.assignment.R;

public class ViewHolder extends RecyclerView.ViewHolder {
    public static ImageView imageView;
    public static TextView textViewTitle, textViewDirector,textViewYear;
    public ViewHolder(View itemView) {
        super(itemView);
        imageView=itemView.findViewById(R.id.imgIcon);
        textViewTitle=itemView.findViewById(R.id.tvTitle);
        textViewDirector=itemView.findViewById(R.id.tvDirector);
        textViewYear=itemView.findViewById(R.id.tvYear);
    }
}

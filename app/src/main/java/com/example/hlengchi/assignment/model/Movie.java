package com.example.hlengchi.assignment.model;

import com.example.hlengchi.assignment.R;

import java.util.ArrayList;

public class Movie {
    private int picture;
    private String title;
    private String director;
    private int year;

    public Movie(int picture, String title, String director, int year) {
        this.picture = picture;
        this.title = title;
        this.director = director;
        this.year = year;
    }

    public int getPicture() {
        return picture;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
//    public static ArrayList<Movie> createMovieList(int numMovie){
//        ArrayList<Movie> movies= new ArrayList<>();
//        movies.add(new Movie(R.mipmap.ic_launcher_01,"The Predator - Added Full Trailer","SHANE BLACK",2018));
//        movies.add(new Movie(R.mipmap.ic_launcher_02,"Beautiful Boy"," FELIX VAN GROENINGEN",2017));
//        movies.add(new Movie(R.mipmap.ic_launcher_03,"Assassination Nation","PANOS COSMATOS",2016));
//        movies.add(new Movie(R.mipmap.ic_launcher_04,"Support the Girls","ANDREW BUJALSK",2015));
//        movies.add(new Movie(R.mipmap.ic_launcher_05,"Madeline's Madeline","JOSEPHINE DECKER",2014));
//        movies.add(new Movie(R.mipmap.ic_launcher_06,"Dead Night","BRAD BARUH",2015));
//        movies.add(new Movie(R.mipmap.ic_launcher_07,"The Legacy of a Whitetail Deer Hunter","JODY HILL",2012));
//        return movies;
//    }
}

package com.example.admin.mymovieguide.data;

import com.example.admin.mymovieguide.model.Movie;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by ADMIN on 10/22/2017.
 */

public class MoviesWraper {

    @SerializedName("results")
    private List<Movie> movies;

    public List<Movie> getMovieList() {
        return movies;
    }

    public void setMovieList(List<Movie> movieList) {
        this.movies = movieList;
    }
}

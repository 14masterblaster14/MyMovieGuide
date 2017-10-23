package com.example.admin.mymovieguide.listing;

import com.example.admin.mymovieguide.model.Movie;

import java.util.List;

/**
 * Created by ADMIN on 10/22/2017.
 */

public interface MoviesListingView {

    void showMovies(List<Movie> movies);

    void loadingStarted();

    void loadingFailed(String errorMessage);

    void onMovieClicked(Movie movie);
}

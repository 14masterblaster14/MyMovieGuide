package com.example.admin.mymovieguide.listing;

import com.example.admin.mymovieguide.model.Movie;

import java.util.List;

import io.reactivex.Observable;

/**
 * Created by ADMIN on 10/22/2017.
 */

public interface MoviesListingInteractor {

    Observable<List<Movie>> fetchMovies();
}

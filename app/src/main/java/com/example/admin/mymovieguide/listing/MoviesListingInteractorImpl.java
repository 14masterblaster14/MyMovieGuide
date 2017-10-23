package com.example.admin.mymovieguide.listing;

import com.example.admin.mymovieguide.data.MoviesWraper;
import com.example.admin.mymovieguide.model.Movie;
import com.example.admin.mymovieguide.network.TmdbWebService;

import java.util.List;

import io.reactivex.Observable;

/**
 * Created by ADMIN on 10/22/2017.
 */

public class MoviesListingInteractorImpl implements MoviesListingInteractor {

    private TmdbWebService tmdbWebService;

    public MoviesListingInteractorImpl(TmdbWebService tmdbWebService) {
        this.tmdbWebService = tmdbWebService;
    }

    @Override
    public Observable<List<Movie>> fetchMovies() {
        return tmdbWebService.highestRatedMovies().map(MoviesWraper::getMovieList);
        //return tmdbWebService.popularMovies().map(MoviesWraper::getMovieList);

        //return null;
    }
}

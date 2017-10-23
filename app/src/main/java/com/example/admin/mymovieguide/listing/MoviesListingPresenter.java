package com.example.admin.mymovieguide.listing;

/**
 * Created by ADMIN on 10/22/2017.
 */

public interface MoviesListingPresenter {

    void displayMovies();

    void setView(MoviesListingView view);

    void destroy();
}

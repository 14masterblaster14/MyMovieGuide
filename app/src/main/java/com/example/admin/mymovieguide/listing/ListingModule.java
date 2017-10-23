package com.example.admin.mymovieguide.listing;

import com.example.admin.mymovieguide.network.TmdbWebService;

import dagger.Module;
import dagger.Provides;

/**
 * Created by ADMIN on 10/23/2017.
 */

@Module
public class ListingModule {

    @Provides
    MoviesListingInteractor provideMoviesListingInteractor(TmdbWebService tmdbWebService) {
        return new MoviesListingInteractorImpl(tmdbWebService);
    }

    @Provides
    MoviesListingPresenter providesMoviesListingPresenter(MoviesListingInteractor moviesListingInteractor) {
        return new MoviesListingPresenterImpl(moviesListingInteractor);
    }
}

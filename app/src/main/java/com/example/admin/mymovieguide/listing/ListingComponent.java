package com.example.admin.mymovieguide.listing;

import dagger.Subcomponent;

/**
 * Created by ADMIN on 10/23/2017.
 */

@ListingScope
@Subcomponent(modules = ListingModule.class)
public interface ListingComponent {

    MoviesListingFragment inject(MoviesListingFragment moviesListingFragment);
}

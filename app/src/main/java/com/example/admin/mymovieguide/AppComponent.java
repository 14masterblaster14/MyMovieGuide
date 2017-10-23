package com.example.admin.mymovieguide;

import com.example.admin.mymovieguide.listing.ListingComponent;
import com.example.admin.mymovieguide.listing.ListingModule;
import com.example.admin.mymovieguide.network.NetworkModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by ADMIN on 10/23/2017.
 */
@Singleton
@Component(modules = {
        AppModule.class,
        NetworkModule.class})
public interface AppComponent {

    ListingComponent plus(ListingModule listingModule);
}

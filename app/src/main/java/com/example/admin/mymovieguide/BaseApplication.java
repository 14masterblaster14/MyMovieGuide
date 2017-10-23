package com.example.admin.mymovieguide;

import android.app.Application;
import android.os.StrictMode;

import com.example.admin.mymovieguide.listing.ListingComponent;
import com.example.admin.mymovieguide.listing.ListingModule;
import com.example.admin.mymovieguide.network.NetworkModule;

/**
 * Created by ADMIN on 10/23/2017.
 */

public class BaseApplication extends Application {

    private AppComponent appComponent;
    private ListingComponent listingComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        StrictMode.enableDefaults();
        appComponent = createAppComponent();
    }

    private AppComponent createAppComponent() {

        return DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .networkModule(new NetworkModule())
                .build();
    }

    public ListingComponent createListingComponent() {

        listingComponent = appComponent.plus(new ListingModule());
        return listingComponent;
    }

    public ListingComponent getListingComponent() {

        return listingComponent;
    }
}

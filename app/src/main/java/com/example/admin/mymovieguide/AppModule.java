package com.example.admin.mymovieguide;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by ADMIN on 10/23/2017.
 */

@Module
public class AppModule {

    private Context context;

    AppModule(Application application) {
        this.context = application;
    }

    @Provides
    @Singleton
    public Context providesContext() {
        return context;
    }

    @Provides
    @Singleton
    public Resources provideResource(Context context) {
        return context.getResources();
    }
}

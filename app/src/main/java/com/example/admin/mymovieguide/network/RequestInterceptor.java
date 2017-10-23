package com.example.admin.mymovieguide.network;

import com.example.admin.mymovieguide.BuildConfig;

import java.io.IOException;

import javax.inject.Inject;
import javax.inject.Singleton;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by ADMIN on 10/22/2017.
 */

@Singleton
public class RequestInterceptor implements Interceptor {

    @Inject
    public RequestInterceptor() {
    }

    @Override
    public Response intercept(Chain chain) throws IOException {

        Request originalRequest = chain.request();
        HttpUrl originalHttpUrl = originalRequest.url();

        HttpUrl httpUrl = originalHttpUrl.newBuilder()
                .addQueryParameter("API_KEY", BuildConfig.TMDB_API_KEY)
                .build();

        Request request = originalRequest.newBuilder().url(httpUrl).build();
        return chain.proceed(request);
        //return null;
    }
}

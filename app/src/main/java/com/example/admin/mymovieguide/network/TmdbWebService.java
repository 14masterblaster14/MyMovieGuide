package com.example.admin.mymovieguide.network;

import com.example.admin.mymovieguide.data.MoviesWraper;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by ADMIN on 10/22/2017.
 */

public interface TmdbWebService {

 /*
    @GET("3/discover/movie?language=en&sort_by=popularity.desc")
    Observable<MoviesWraper> popularMovies(); */

    @GET("3/discover/movie?vote_count.gte=500&language=en&sort_by=vote_average.desc")
    Observable<MoviesWraper> highestRatedMovies();
/*
    @GET("3/movie/{movieId}/videos")
    Observable<VideoWrapper> trailers(@Path("movieId") String movieId);

    @GET("3/movie/{movieId}/reviews")
    Observable<ReviewsWrapper> reviews(@Path("movieId") String movieId);*/
}

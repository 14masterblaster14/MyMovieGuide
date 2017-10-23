package com.example.admin.mymovieguide.listing;

import com.example.admin.mymovieguide.model.Movie;
import com.example.admin.mymovieguide.util.RxUtils;

import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by ADMIN on 10/22/2017.
 */

public class MoviesListingPresenterImpl implements MoviesListingPresenter {

    private MoviesListingView moviesListingView;
    private MoviesListingInteractor moviesListingInteractor;
    private Disposable fetchSubscription;

    public MoviesListingPresenterImpl(MoviesListingInteractor moviesListingInteractor) {
        this.moviesListingInteractor = moviesListingInteractor;
    }

    @Override
    public void destroy() {
        moviesListingView = null;
        RxUtils.unsubscribe(fetchSubscription);
    }

    @Override
    public void setView(MoviesListingView view) {
        this.moviesListingView = view;
        displayMovies();
    }

    @Override
    public void displayMovies() {
        showLoading();
        fetchSubscription = moviesListingInteractor.fetchMovies()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(this::onMovieFetchSuccess, this::onMovieFetchFailed);
    }

    private void showLoading() {
        if (isViewAttached()) {
            moviesListingView.loadingStarted();
        }
    }

    private void onMovieFetchSuccess(List<Movie> movies) {
        if (isViewAttached()) {
            moviesListingView.loadingStarted();
        }
    }

    private void onMovieFetchFailed(Throwable throwable) {
        moviesListingView.loadingFailed(throwable.getMessage());
    }


    public boolean isViewAttached() {
        return moviesListingView != null;
        //return viewAttached;
    }
}

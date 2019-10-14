package com.app.showflix.repository.movie;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000bH\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\f"}, d2 = {"Lcom/app/showflix/repository/movie/PopuparMovieListDataSourceFactory;", "Landroidx/paging/DataSource$Factory;", "", "Lcom/app/showflix/model/movies/Results;", "()V", "popularMovieLiveDataSource", "Landroidx/lifecycle/MutableLiveData;", "Lcom/app/showflix/repository/movie/PopularMovieListDataSource;", "getPopularMovieLiveDataSource", "()Landroidx/lifecycle/MutableLiveData;", "create", "Landroidx/paging/DataSource;", "app_debug"})
public final class PopuparMovieListDataSourceFactory extends androidx.paging.DataSource.Factory<java.lang.Integer, com.app.showflix.model.movies.Results> {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.app.showflix.repository.movie.PopularMovieListDataSource> popularMovieLiveDataSource = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.app.showflix.repository.movie.PopularMovieListDataSource> getPopularMovieLiveDataSource() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.paging.DataSource<java.lang.Integer, com.app.showflix.model.movies.Results> create() {
        return null;
    }
    
    public PopuparMovieListDataSourceFactory() {
        super();
    }
}
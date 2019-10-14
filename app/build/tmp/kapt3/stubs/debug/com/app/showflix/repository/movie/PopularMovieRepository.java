package com.app.showflix.repository.movie;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\fJ\u0012\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR&\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0016"}, d2 = {"Lcom/app/showflix/repository/movie/PopularMovieRepository;", "Lcom/app/showflix/repository/BaseRepository;", "()V", "POST_PER_PAGE", "", "popularMovieListDataSourceFactory", "Lcom/app/showflix/repository/movie/PopuparMovieListDataSourceFactory;", "getPopularMovieListDataSourceFactory", "()Lcom/app/showflix/repository/movie/PopuparMovieListDataSourceFactory;", "setPopularMovieListDataSourceFactory", "(Lcom/app/showflix/repository/movie/PopuparMovieListDataSourceFactory;)V", "popularMoviePagedList", "Landroidx/lifecycle/LiveData;", "Landroidx/paging/PagedList;", "Lcom/app/showflix/model/movies/Results;", "getPopularMoviePagedList", "()Landroidx/lifecycle/LiveData;", "setPopularMoviePagedList", "(Landroidx/lifecycle/LiveData;)V", "getNetworkState", "Lcom/app/showflix/utils/NetworkState;", "getPopularMovies", "app_debug"})
public final class PopularMovieRepository extends com.app.showflix.repository.BaseRepository {
    @org.jetbrains.annotations.NotNull()
    public static androidx.lifecycle.LiveData<androidx.paging.PagedList<com.app.showflix.model.movies.Results>> popularMoviePagedList;
    @org.jetbrains.annotations.NotNull()
    public static com.app.showflix.repository.movie.PopuparMovieListDataSourceFactory popularMovieListDataSourceFactory;
    public static final int POST_PER_PAGE = 10;
    public static final com.app.showflix.repository.movie.PopularMovieRepository INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<androidx.paging.PagedList<com.app.showflix.model.movies.Results>> getPopularMoviePagedList() {
        return null;
    }
    
    public final void setPopularMoviePagedList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<androidx.paging.PagedList<com.app.showflix.model.movies.Results>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.app.showflix.repository.movie.PopuparMovieListDataSourceFactory getPopularMovieListDataSourceFactory() {
        return null;
    }
    
    public final void setPopularMovieListDataSourceFactory(@org.jetbrains.annotations.NotNull()
    com.app.showflix.repository.movie.PopuparMovieListDataSourceFactory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<androidx.paging.PagedList<com.app.showflix.model.movies.Results>> getPopularMovies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.app.showflix.utils.NetworkState> getNetworkState() {
        return null;
    }
    
    private PopularMovieRepository() {
        super();
    }
}
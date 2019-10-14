package com.app.showflix.viewmodel.movies;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u000f\u001a\u00020\u0010R!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\'\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\r\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lcom/app/showflix/viewmodel/movies/PopularMoviesViewModel;", "Lcom/app/showflix/viewmodel/BaseViewModel;", "()V", "networkState", "Landroidx/lifecycle/LiveData;", "Lcom/app/showflix/utils/NetworkState;", "getNetworkState", "()Landroidx/lifecycle/LiveData;", "networkState$delegate", "Lkotlin/Lazy;", "popularMoviePagedList", "Landroidx/paging/PagedList;", "Lcom/app/showflix/model/movies/Results;", "getPopularMoviePagedList", "popularMoviePagedList$delegate", "listIsEmpty", "", "app_debug"})
public final class PopularMoviesViewModel extends com.app.showflix.viewmodel.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy popularMoviePagedList$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy networkState$delegate = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<androidx.paging.PagedList<com.app.showflix.model.movies.Results>> getPopularMoviePagedList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.app.showflix.utils.NetworkState> getNetworkState() {
        return null;
    }
    
    public final boolean listIsEmpty() {
        return false;
    }
    
    public PopularMoviesViewModel() {
        super();
    }
}
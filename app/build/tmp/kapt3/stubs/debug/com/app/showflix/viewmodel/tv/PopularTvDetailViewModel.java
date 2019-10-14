package com.app.showflix.viewmodel.tv;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\n\u001a\u00020\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/app/showflix/viewmodel/tv/PopularTvDetailViewModel;", "Lcom/app/showflix/viewmodel/BaseViewModel;", "tvId", "", "(I)V", "popularTvDetailLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/app/showflix/model/tv/PopularTvDetailResponse;", "getPopularTvDetailLiveData", "()Landroidx/lifecycle/MutableLiveData;", "fetchPopularTvDetail", "", "Factory", "app_debug"})
public final class PopularTvDetailViewModel extends com.app.showflix.viewmodel.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.app.showflix.model.tv.PopularTvDetailResponse> popularTvDetailLiveData = null;
    private final int tvId = 0;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.app.showflix.model.tv.PopularTvDetailResponse> getPopularTvDetailLiveData() {
        return null;
    }
    
    /**
     * Fetch Popular movie detail data and
     * launch within the scope only
     * from TMDB  Api
     */
    public final void fetchPopularTvDetail() {
    }
    
    public PopularTvDetailViewModel(int tvId) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\'\u0010\u0005\u001a\u0002H\u0006\"\n\b\u0000\u0010\u0006*\u0004\u0018\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00060\tH\u0016\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/app/showflix/viewmodel/tv/PopularTvDetailViewModel$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "tvId", "", "(I)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_debug"})
    public static final class Factory implements androidx.lifecycle.ViewModelProvider.Factory {
        private final int tvId = 0;
        
        @java.lang.Override()
        public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
        java.lang.Class<T> modelClass) {
            return null;
        }
        
        public Factory(int tvId) {
            super();
        }
    }
}
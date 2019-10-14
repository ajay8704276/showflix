package com.app.showflix.datasource.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\u0006H\'J,\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\u0006H\'J(\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r2\b\b\u0001\u0010\u0010\u001a\u00020\b2\b\b\u0003\u0010\u0005\u001a\u00020\u0006H\'J,\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\u0006H\'J(\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u000e0\r2\b\b\u0001\u0010\u0015\u001a\u00020\b2\b\b\u0003\u0010\u0005\u001a\u00020\u0006H\'J(\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u000e0\r2\b\b\u0001\u0010\u0018\u001a\u00020\b2\b\b\u0003\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0019"}, d2 = {"Lcom/app/showflix/datasource/network/TMDBApi;", "", "getPopularMovie", "Lretrofit2/Call;", "Lcom/app/showflix/model/movies/PopularMovieResponse;", "lang", "", "page", "", "region", "getPopularPeople", "Lcom/app/showflix/model/people/PopularPeopleResponse;", "getPopularPeopleDetail", "Lkotlinx/coroutines/Deferred;", "Lretrofit2/Response;", "Lcom/app/showflix/model/people/PopularPeopleDetailResponse;", "personId", "getPopularTv", "Lcom/app/showflix/model/tv/PopularTvShowsResponse;", "getPopularTvDetail", "Lcom/app/showflix/model/tv/PopularTvDetailResponse;", "tvId", "getPopuparMovieDetail", "Lcom/app/showflix/model/movies/PopularMovieDetailResponse;", "movieId", "app_debug"})
public abstract interface TMDBApi {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "movie/popular")
    public abstract retrofit2.Call<com.app.showflix.model.movies.PopularMovieResponse> getPopularMovie(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "language")
    java.lang.String lang, @retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "region")
    java.lang.String region);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "tv/popular")
    public abstract retrofit2.Call<com.app.showflix.model.tv.PopularTvShowsResponse> getPopularTv(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "language")
    java.lang.String lang, @retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "region")
    java.lang.String region);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "person/popular")
    public abstract retrofit2.Call<com.app.showflix.model.people.PopularPeopleResponse> getPopularPeople(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "language")
    java.lang.String lang, @retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "region")
    java.lang.String region);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "person/{person_id}")
    public abstract kotlinx.coroutines.Deferred<retrofit2.Response<com.app.showflix.model.people.PopularPeopleDetailResponse>> getPopularPeopleDetail(@retrofit2.http.Path(value = "person_id")
    int personId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "language")
    java.lang.String lang);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "movie/{movie_id}")
    public abstract kotlinx.coroutines.Deferred<retrofit2.Response<com.app.showflix.model.movies.PopularMovieDetailResponse>> getPopuparMovieDetail(@retrofit2.http.Path(value = "movie_id")
    int movieId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "language")
    java.lang.String lang);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "tv/{tv_id}")
    public abstract kotlinx.coroutines.Deferred<retrofit2.Response<com.app.showflix.model.tv.PopularTvDetailResponse>> getPopularTvDetail(@retrofit2.http.Path(value = "tv_id")
    int tvId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "language")
    java.lang.String lang);
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}
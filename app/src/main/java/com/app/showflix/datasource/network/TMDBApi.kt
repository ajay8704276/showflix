package com.app.showflix.datasource.network

import com.app.showflix.model.movies.PopularMovieDetailResponse
import com.app.showflix.model.movies.PopularMovieResponse
import com.app.showflix.model.people.PopularPeopleDetailResponse
import com.app.showflix.model.people.PopularPeopleResponse
import com.app.showflix.model.tv.PopularTvDetailResponse
import com.app.showflix.model.tv.PopularTvShowsResponse
import com.app.showflix.utils.Constants
import kotlinx.coroutines.Deferred
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface TMDBApi {

    @GET("movie/popular")
    fun getPopularMovie(
        @Query(Constants.API_LANGUAGE) lang: String = "en-US",
        @Query(Constants.API_PAGE) page: Int = 1,
        @Query(Constants.API_REGION) region: String = ""
    ): Call<PopularMovieResponse>

    @GET("tv/popular")
    fun getPopularTv(
        @Query(Constants.API_LANGUAGE) lang: String = "en-US",
        @Query(Constants.API_PAGE) page: Int = 1,
        @Query(Constants.API_REGION) region: String = ""
    ): Call<PopularTvShowsResponse>


    @GET("person/popular")
    fun getPopularPeople(
        @Query(Constants.API_LANGUAGE) lang: String = "en-US",
        @Query(Constants.API_PAGE) page: Int = 1,
        @Query(Constants.API_REGION) region: String = ""
    ): Call<PopularPeopleResponse>


    @GET("person/{person_id}")
    fun getPopularPeopleDetail(
        @Path("person_id") personId: Int,
        @Query(Constants.API_LANGUAGE) lang: String = "en_US"
    ): Deferred<Response<PopularPeopleDetailResponse>>

    @GET("movie/{movie_id}")
    fun getPopuparMovieDetail(
        @Path("movie_id") movieId: Int,
        @Query(Constants.API_LANGUAGE) lang: String = "en-US"
    ): Deferred<Response<PopularMovieDetailResponse>>

    @GET("tv/{tv_id}")
    fun getPopularTvDetail(
        @Path("tv_id") tvId: Int,
        @Query(Constants.API_LANGUAGE) lang: String = "en-US"
    ): Deferred<Response<PopularTvDetailResponse>>
}
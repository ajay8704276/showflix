package com.app.showflix.repository.movie

import android.util.Log
import com.app.showflix.datasource.network.TMDBClient
import com.app.showflix.model.movies.PopularMovieDetailResponse
import com.app.showflix.repository.BaseRepository

object PopularMovieDetailRepository:BaseRepository() {


    suspend fun  getPopularMovieDetail(movieId :Int): PopularMovieDetailResponse? {
        val movieDetailResponse = safeApiCall(
            call = {TMDBClient.tmdbApi.getPopuparMovieDetail(movieId).await()},
            errorMessage = "Error Fetching Popular Movie Detail Response"
        )
        Log.d("MovieDetail",movieDetailResponse.toString())
        return movieDetailResponse
    }
}
package com.app.showflix.repository.tv

import android.util.Log
import com.app.showflix.datasource.network.TMDBClient
import com.app.showflix.model.tv.PopularTvDetailResponse
import com.app.showflix.repository.BaseRepository

object PopularTvDetailRepository:BaseRepository() {

    suspend fun getPopularTvDetail(tvId :Int):PopularTvDetailResponse?{
        val tvDetailResponse = safeApiCall(
            call = { TMDBClient.tmdbApi.getPopularTvDetail(tvId).await()},
            errorMessage = "Error Fetching Popular tv detail info"
        )

        Log.d("PopularPeopleRepo",tvDetailResponse.toString())
        return tvDetailResponse
    }
}
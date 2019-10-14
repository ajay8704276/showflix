package com.app.showflix.repository.people

import android.util.Log
import com.app.showflix.datasource.network.TMDBClient
import com.app.showflix.model.people.PopularPeopleDetailResponse
import com.app.showflix.repository.BaseRepository

object PopularPeopleDetailRepository:BaseRepository() {

    suspend fun getPopularPeopleDetail(peopleId:Int):PopularPeopleDetailResponse?{
        val peopleDetailResponse = safeApiCall(
            call = { TMDBClient.tmdbApi.getPopularPeopleDetail(peopleId).await()},
            errorMessage = "Error Fetching Popular People detail info"
        )

        Log.d("PopularPeopleRepo",peopleDetailResponse.toString())
        return peopleDetailResponse
    }
}
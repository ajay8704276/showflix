package com.app.showflix.repository

import android.util.Log
import retrofit2.Response
import java.io.IOException

open class BaseRepository {

    suspend fun <T : Any> safeApiCall(call: suspend () -> Response<T>, errorMessage: String): T? {
        val result: Result<T> = safeApiResult(call, errorMessage)
        var data: T? = null

        when (result) {
            is Result.Success -> data = result.data
            is Result.Error -> Log.d(
                "Data Respository",
                "$errorMessage & Exception  -  ,${result.exception}"
            )
        }
        Log.d("Safe Api Call Data",data.toString())
        return data
    }

    private suspend fun <T : Any> safeApiResult(
        call: suspend () -> Response<T>,
        errorMessage: String
    ): Result<T> {
        val response = call.invoke()
        if (response.isSuccessful) {
            return Result.Success(response.body()!!)
        }
        return Result.Error(IOException("Error Occurred during getting safe Api result  , Custom Error - ${errorMessage}"))
    }
}


sealed class Result<out T : Any> {
    data class Success<out T : Any>(val data: T) : Result<T>()
    data class Error(val exception: Exception) : Result<Nothing>()
}
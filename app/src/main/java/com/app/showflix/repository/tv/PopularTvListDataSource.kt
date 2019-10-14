package com.app.showflix.repository.tv

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.paging.PageKeyedDataSource
import com.app.showflix.datasource.network.TMDBClient
import com.app.showflix.model.tv.PopularTvShowsResponse
import com.app.showflix.model.tv.Results
import com.app.showflix.utils.NetworkState
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

const val FIRST_PAGE = 1

class PopularTvListDataSource : PageKeyedDataSource<Int, Results>() {

    private var page = FIRST_PAGE
    val networkState: MutableLiveData<NetworkState> = MutableLiveData()

    companion object {
        val TAG = PopularTvListDataSource.javaClass.simpleName
    }


    override fun loadInitial(
        params: LoadInitialParams<Int>,
        callback: LoadInitialCallback<Int, Results>
    ) {
        networkState.postValue(NetworkState.LOADING)
        TMDBClient.tmdbApi.getPopularTv("en-US", page)
            .enqueue(object : Callback<PopularTvShowsResponse> {
                override fun onFailure(call: Call<PopularTvShowsResponse>, t: Throwable) {
                    Log.d(TAG, t.message)
                }

                override fun onResponse(
                    call: Call<PopularTvShowsResponse>,
                    response: Response<PopularTvShowsResponse>
                ) {
                    if (response.isSuccessful) {
                        response.body()?.results?.let {
                            callback.onResult(it, null, page + 1)
                            networkState.postValue(NetworkState.LOADED)
                        }
                    } else {
                        networkState.postValue(NetworkState.ERROR)
                        Log.d(TAG, response.errorBody().toString())
                    }
                }
            })
    }

    override fun loadAfter(params: LoadParams<Int>, callback: LoadCallback<Int, Results>) {

        networkState.postValue(NetworkState.LOADING)

        TMDBClient.tmdbApi.getPopularTv("en-US", params.key)
            .enqueue(object :Callback<PopularTvShowsResponse>{
                override fun onFailure(call: Call<PopularTvShowsResponse>, t: Throwable) {
                    networkState.postValue(NetworkState.ERROR)
                    Log.d(TAG, t.message)
                }

                override fun onResponse(
                    call: Call<PopularTvShowsResponse>,
                    response: Response<PopularTvShowsResponse>
                ) {
                    if (response.isSuccessful) {
                        response.body()?.let {
                            if (it.total_pages >= params.key) {
                                callback.onResult(it.results, params.key + 1)
                                networkState.postValue(NetworkState.LOADED)

                            } else {
                                networkState.postValue(NetworkState.ENDOFLIST)

                            }
                        }
                    }
                }

            })
    }

    override fun loadBefore(params: LoadParams<Int>, callback: LoadCallback<Int, Results>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
package com.app.showflix.repository.people

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.paging.PageKeyedDataSource
import com.app.showflix.datasource.network.TMDBClient
import com.app.showflix.model.people.PopularPeopleResponse
import com.app.showflix.model.people.Results
import com.app.showflix.utils.NetworkState
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


const val FIRST_PAGE = 1

class PopularPeopleListDataScource : PageKeyedDataSource<Int, Results>() {

    private var page = FIRST_PAGE
    val networkState: MutableLiveData<NetworkState> = MutableLiveData()

    companion object {
        val TAG = PopularPeopleListDataScource.javaClass.simpleName
    }


    override fun loadInitial(
        params: LoadInitialParams<Int>,
        callback: LoadInitialCallback<Int, Results>
    ) {
        networkState.postValue(NetworkState.LOADING)
        TMDBClient.tmdbApi.getPopularPeople("en-US", page)
            .enqueue(object : Callback<PopularPeopleResponse> {
                override fun onFailure(call: Call<PopularPeopleResponse>, t: Throwable) {
                    Log.d(TAG, t.message)
                }

                override fun onResponse(
                    call: Call<PopularPeopleResponse>,
                    response: Response<PopularPeopleResponse>
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

        TMDBClient.tmdbApi.getPopularPeople("en-US", params.key)
            .enqueue(object :Callback<PopularPeopleResponse>{
                override fun onFailure(call: Call<PopularPeopleResponse>, t: Throwable) {
                    networkState.postValue(NetworkState.ERROR)
                    Log.d(TAG, t.message)
                }

                override fun onResponse(
                    call: Call<PopularPeopleResponse>,
                    response: Response<PopularPeopleResponse>
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
package com.app.showflix.viewmodel.tv

import androidx.lifecycle.LiveData
import androidx.paging.PagedList
import com.app.showflix.model.tv.Results
import com.app.showflix.repository.tv.PopularTvRepository
import com.app.showflix.utils.NetworkState
import com.app.showflix.viewmodel.BaseViewModel

class PopularTvViewModel:BaseViewModel() {


    // Live data for popular movies
    val popularTvPagedList : LiveData<PagedList<Results>> by lazy {
        PopularTvRepository.getPopularTv()
    }


    val  networkState : LiveData<NetworkState> by lazy {
        PopularTvRepository.getNetworkState()
    }

    fun listIsEmpty(): Boolean {
        return popularTvPagedList.value?.isEmpty() ?: true
    }




    // Live data for popular movies
    //val popularTvLiveData = MutableLiveData<MutableList<Results>>()

    /**
     * Fetch popular tv data and launch within this scope only
     * from TMDB Api
     */
    /*fun fetchPopularTv(){
        scope.launch {
            val popularTv = PopularTvRepository.getPopularTv()
            popularTvLiveData.postValue(popularTv)
        }
    }*/
}
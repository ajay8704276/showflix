package com.app.showflix.viewmodel.people

import androidx.lifecycle.LiveData
import androidx.paging.PagedList
import com.app.showflix.model.people.Results
import com.app.showflix.repository.people.PopularPeopleRepository
import com.app.showflix.utils.NetworkState
import com.app.showflix.viewmodel.BaseViewModel

class PopularPeopleViewModel:BaseViewModel() {

    // Live data for popular movies
    val popularPeoplePagedList : LiveData<PagedList<Results>> by lazy {
        PopularPeopleRepository.getPopularPeople()
    }


    val  networkState : LiveData<NetworkState> by lazy {
        PopularPeopleRepository.getNetworkState()
    }

    fun listIsEmpty(): Boolean {
        return popularPeoplePagedList.value?.isEmpty() ?: true
    }



   /* // Live data for popular movies
    val popularPeopleLiveData = MutableLiveData<MutableList<Results>>()

    *//**
     * Fetch popular tv data and launch within this scope only
     * from TMDB Api
     *//*
    fun fetchPopularPeople(){
        scope.launch {
            val popularPeople = PopularPeopleRepository.getPopularPeople()
            popularPeopleLiveData.postValue(popularPeople)
        }
    }*/
}
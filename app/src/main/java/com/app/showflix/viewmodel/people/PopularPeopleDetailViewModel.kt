package com.app.showflix.viewmodel.people

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.app.showflix.model.people.PopularPeopleDetailResponse
import com.app.showflix.repository.people.PopularPeopleDetailRepository
import com.app.showflix.viewmodel.BaseViewModel
import kotlinx.coroutines.launch

class PopularPeopleDetailViewModel(private val peopleId :Int):BaseViewModel() {

    val popularPeopleDetailLiveData = MutableLiveData<PopularPeopleDetailResponse>()


    /**
     * Fetch Popular movie detail data and
     * launch within the scope only
     * from TMDB  Api
     */
    fun fetchPopularPeopleDetail(){
        scope.launch {
            val popularPeopleDetail = PopularPeopleDetailRepository.getPopularPeopleDetail(peopleId)
            popularPeopleDetailLiveData.postValue(popularPeopleDetail)
        }
    }

    class Factory(private val peopleId :Int): ViewModelProvider.Factory{
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            if (modelClass.isAssignableFrom(PopularPeopleDetailViewModel::class.java)){
                return PopularPeopleDetailViewModel(peopleId) as T
            }
            throw IllegalArgumentException("Unable to instantiate the view model PopularMovieDetailViewModel")
        }
    }
}
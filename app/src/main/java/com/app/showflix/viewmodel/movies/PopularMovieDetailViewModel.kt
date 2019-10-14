package com.app.showflix.viewmodel.movies

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.app.showflix.model.movies.PopularMovieDetailResponse
import com.app.showflix.repository.movie.PopularMovieDetailRepository
import com.app.showflix.viewmodel.BaseViewModel
import kotlinx.coroutines.launch

class PopularMovieDetailViewModel(private val movieId :Int):BaseViewModel() {

    val popularMovieDetailLiveData = MutableLiveData<PopularMovieDetailResponse>()


    /**
     * Fetch Popular movie detail data and
     * launch within the scope only
     * from TMDB  Api
     */
    fun fetchPopularMovieDetail(){
        scope.launch {
            val popularMovieDetail = PopularMovieDetailRepository.getPopularMovieDetail(movieId)
            popularMovieDetailLiveData.postValue(popularMovieDetail)
        }
    }


    class Factory(private val movieId :Int):ViewModelProvider.Factory{
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            if (modelClass.isAssignableFrom(PopularMovieDetailViewModel::class.java)){
                return PopularMovieDetailViewModel(movieId) as T
            }
            throw IllegalArgumentException("Unable to instantiate the view model PopularMovieDetailViewModel")
        }
    }
}
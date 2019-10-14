package com.app.showflix.viewmodel.movies

import androidx.lifecycle.LiveData
import androidx.paging.PagedList
import com.app.showflix.model.movies.Results
import com.app.showflix.repository.movie.PopularMovieRepository
import com.app.showflix.utils.NetworkState
import com.app.showflix.viewmodel.BaseViewModel

class PopularMoviesViewModel() : BaseViewModel() {

    // Live data for popular movies
     val popularMoviePagedList :LiveData<PagedList<Results>> by lazy {
        PopularMovieRepository.getPopularMovies()
    }


    val  networkState : LiveData<NetworkState> by lazy {
        PopularMovieRepository.getNetworkState()
    }

    fun listIsEmpty(): Boolean {
        return popularMoviePagedList.value?.isEmpty() ?: true
    }


    /**
     * Fetch popular movies data and launch within this scope only
     * from TMDB Api
     */
   /* fun fetchPopularMovie() {
        scope.launch {
            val popularMovies = PopularMovieRepository.getPopularMovies()
            popularMoviesLiveData.postValue(popularMovies)
        }
    }*/


}

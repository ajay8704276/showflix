package com.app.showflix.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.app.showflix.viewmodel.movies.PopularMoviesViewModel
import com.app.showflix.viewmodel.people.PopularPeopleViewModel
import com.app.showflix.viewmodel.tv.PopularTvViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlin.coroutines.CoroutineContext

abstract class BaseViewModel :ViewModel(){

    // Coroutine Job initialization
    private val parentJob = Job()

    // Coroutine Job Context
    private val coroutineContext: CoroutineContext
        get() = parentJob + Dispatchers.Default

    // Scope of Coroutine
    val scope = CoroutineScope(coroutineContext)

    /**
     * Cancel Job on clearing of view model
     * or when view model getting destroyed
     */
    override fun onCleared() {
        super.onCleared()
        if (parentJob != null && parentJob.isActive) {
            parentJob.cancel()
        }
    }

    /**
     * View Model Extension function
     */


    /**
     * Creation of view model factory
     */
    class Factory() : ViewModelProvider.Factory {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            if (modelClass.isAssignableFrom(PopularMoviesViewModel::class.java)) {
                return PopularMoviesViewModel() as T
            }

            if(modelClass.isAssignableFrom(PopularTvViewModel::class.java)){
                return PopularTvViewModel() as T
            }

            if (modelClass.isAssignableFrom(PopularPeopleViewModel::class.java)){
                return PopularPeopleViewModel() as T
            }

           /* if (modelClass.isAssignableFrom(PopularMovieDetailViewModel::class.java)){
                return PopularMovieDetailViewModel() as T
            }

            if (modelClass.isAssignableFrom(PopularTvDetailViewModel::class.java)){
                return PopularTvDetailViewModel() as T
            }

            if (modelClass.isAssignableFrom(PopularPeopleDetailViewModel::class.java)){
                return PopularPeopleDetailViewModel() as T
            }*/
            throw IllegalArgumentException("Unable to construct view model ${modelClass.simpleName}")
        }
    }
}
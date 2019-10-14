package com.app.showflix.repository.movie

import androidx.lifecycle.MutableLiveData
import androidx.paging.DataSource
import com.app.showflix.model.movies.Results

class PopuparMovieListDataSourceFactory : DataSource.Factory<Int, Results>(){

    val popularMovieLiveDataSource = MutableLiveData<PopularMovieListDataSource>()

    override fun create(): DataSource<Int, Results> {
        val popularMovie = PopularMovieListDataSource()
        popularMovieLiveDataSource.postValue(popularMovie)
        return popularMovie

    }
}
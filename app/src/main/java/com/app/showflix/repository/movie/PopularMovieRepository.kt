package com.app.showflix.repository.movie

import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import androidx.paging.LivePagedListBuilder
import androidx.paging.PagedList
import com.app.showflix.model.movies.Results
import com.app.showflix.repository.BaseRepository
import com.app.showflix.utils.NetworkState

object PopularMovieRepository : BaseRepository() {

    lateinit var popularMoviePagedList: LiveData<PagedList<Results>>
    lateinit var popularMovieListDataSourceFactory: PopuparMovieListDataSourceFactory
    const val POST_PER_PAGE = 10

     fun getPopularMovies(): LiveData<PagedList<Results>> {
        /* val movieResponse = safeApiCall(
             call = {TMDBClient.tmdbApi.getPopularMovie().await()},
             errorMessage = "Error fetching popular movies"
         )
         Log.d("PopularMovieResponse",movieResponse.toString())
         return movieResponse?.results!!.toMutableList()*/


        popularMovieListDataSourceFactory = PopuparMovieListDataSourceFactory()

        val config = PagedList.Config.Builder()
            .setEnablePlaceholders(false)
            .setPageSize(POST_PER_PAGE)
            .setPrefetchDistance(5)
            .build()

        popularMoviePagedList =
            LivePagedListBuilder(popularMovieListDataSourceFactory, config).build()

        return popularMoviePagedList

    }


    fun getNetworkState(): LiveData<NetworkState> {
        return Transformations.switchMap<PopularMovieListDataSource, NetworkState>(
            popularMovieListDataSourceFactory.popularMovieLiveDataSource, PopularMovieListDataSource::networkState)
    }

}
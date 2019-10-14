package com.app.showflix.repository.tv

import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import androidx.paging.LivePagedListBuilder
import androidx.paging.PagedList
import com.app.showflix.model.tv.Results
import com.app.showflix.repository.BaseRepository
import com.app.showflix.utils.NetworkState

object PopularTvRepository: BaseRepository() {

    lateinit var popularTvPagedList : LiveData<PagedList<Results>>
    lateinit var popularTvListDataSourceFactory : PopularTvListDataSourcefactory

    const val POST_PER_PAGE = 10

     fun getPopularTv():LiveData<PagedList<Results>>{
       /* val tvResponse = safeApiCall(
            call = {TMDBClient.tmdbApi.getPopularTv().await()},
            errorMessage = "Error Fetching Popular Tv Shows "
        )

        Log.d("PopularTvRespository",tvResponse.toString())
        return tvResponse?.results!!.toMutableList()*/

        popularTvListDataSourceFactory = PopularTvListDataSourcefactory()

        val config = PagedList.Config.Builder()
            .setEnablePlaceholders(false)
            .setPageSize(POST_PER_PAGE)
            .setPrefetchDistance(5)
            .build()

        popularTvPagedList =
            LivePagedListBuilder(popularTvListDataSourceFactory, config).build()

        return popularTvPagedList
    }

    fun getNetworkState(): LiveData<NetworkState> {
        return Transformations.switchMap<PopularTvListDataSource, NetworkState>(
            popularTvListDataSourceFactory.popularTvLiveDataSource, PopularTvListDataSource::networkState)
    }
}
package com.app.showflix.repository.people

import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import androidx.paging.LivePagedListBuilder
import androidx.paging.PagedList
import com.app.showflix.model.people.Results
import com.app.showflix.repository.BaseRepository
import com.app.showflix.utils.NetworkState

object PopularPeopleRepository: BaseRepository() {

    lateinit var popularPeoplePagedList :LiveData<PagedList<Results>>
    lateinit var popularPeopleListDataSourceFactory : PopularPeopleListDataSourceFactory

    const val POST_PER_PAGE = 10

    fun getPopularPeople():LiveData<PagedList<Results>>{
       /* val peopleResponse = safeApiCall(
            call = { TMDBClient.tmdbApi.getPopularPeople().await()},
            errorMessage = "Error Fetching Popular People detail info"
        )

        Log.d("PopularPeopleRepo",peopleResponse.toString())
        return peopleResponse?.results!!.toMutableList()*/
        popularPeopleListDataSourceFactory = PopularPeopleListDataSourceFactory()

        val config = PagedList.Config.Builder()
            .setEnablePlaceholders(false)
            .setPageSize(POST_PER_PAGE)
            .setPrefetchDistance(5)
            .build()

        popularPeoplePagedList =
            LivePagedListBuilder(popularPeopleListDataSourceFactory, config).build()

        return popularPeoplePagedList

    }

    fun getNetworkState(): LiveData<NetworkState> {
        return Transformations.switchMap<PopularPeopleListDataScource, NetworkState>(
            popularPeopleListDataSourceFactory.popularPeopleLiveDataSource, PopularPeopleListDataScource::networkState)
    }
}
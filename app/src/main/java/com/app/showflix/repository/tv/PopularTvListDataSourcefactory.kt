package com.app.showflix.repository.tv

import androidx.lifecycle.MutableLiveData
import androidx.paging.DataSource
import com.app.showflix.model.tv.Results

class PopularTvListDataSourcefactory:DataSource.Factory<Int,Results>(){

    val popularTvLiveDataSource = MutableLiveData<PopularTvListDataSource>()

    override fun create(): DataSource<Int, Results> {
        val popularTv  = PopularTvListDataSource()
        popularTvLiveDataSource.postValue(popularTv)
        return popularTv
    }
}
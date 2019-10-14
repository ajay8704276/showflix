package com.app.showflix.repository.people

import androidx.lifecycle.MutableLiveData
import androidx.paging.DataSource
import com.app.showflix.model.people.Results

class PopularPeopleListDataSourceFactory:DataSource.Factory<Int, Results>() {

    val popularPeopleLiveDataSource = MutableLiveData<PopularPeopleListDataScource>()


    override fun create(): DataSource<Int, Results> {
        val popularPeople  = PopularPeopleListDataScource()
        popularPeopleLiveDataSource.postValue(popularPeople)
        return popularPeople
    }
}
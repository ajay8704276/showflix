package com.app.showflix.viewmodel.tv

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.app.showflix.model.tv.PopularTvDetailResponse
import com.app.showflix.repository.tv.PopularTvDetailRepository
import com.app.showflix.viewmodel.BaseViewModel
import kotlinx.coroutines.launch

class PopularTvDetailViewModel(private val tvId: Int) : BaseViewModel() {

    val popularTvDetailLiveData = MutableLiveData<PopularTvDetailResponse>()


    /**
     * Fetch Popular movie detail data and
     * launch within the scope only
     * from TMDB  Api
     */
    fun fetchPopularTvDetail() {
        scope.launch {
            val popularTvDetail = PopularTvDetailRepository.getPopularTvDetail(tvId)
            popularTvDetailLiveData.postValue(popularTvDetail)
        }
    }


    class Factory(private val tvId: Int) : ViewModelProvider.Factory {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            if (modelClass.isAssignableFrom(PopularTvDetailViewModel::class.java)) {
                return PopularTvDetailViewModel(tvId) as T
            }
            throw IllegalArgumentException("Unable to instantiate view model")
        }

    }
}
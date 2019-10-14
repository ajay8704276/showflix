package com.app.showflix.view.activities.tv

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.app.showflix.R
import com.app.showflix.viewmodel.tv.PopularTvDetailViewModel
import kotlinx.android.synthetic.main.popular_tv_detail.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext

class PopularTvDetailActivity:AppCompatActivity(),CoroutineScope {

    private lateinit var job:Job

    override val coroutineContext: CoroutineContext
        get() = job + Dispatchers.Main //To change initializer of created properties use File | Settings | File Templates.

    private lateinit var viewModelFactory: ViewModelProvider.Factory

    private lateinit var viewModel : PopularTvDetailViewModel

    private var tvId :Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if(intent!=null){
            tvId = intent.getIntExtra("id",0)
        }
        job = Job()
        setContentView(R.layout.popular_tv_detail)
        setSupportActionBar(toolbar)


        viewModelFactory = PopularTvDetailViewModel.Factory(tvId)
        viewModel = ViewModelProviders.of(this, viewModelFactory)
            .get(PopularTvDetailViewModel::class.java)

        bindUI()
    }

    private fun bindUI() = launch {
        viewModel.fetchPopularTvDetail()
        toolbar.title = "Tv Detail"
        viewModel.popularTvDetailLiveData.observe(this@PopularTvDetailActivity, Observer {
            if (it == null) return@Observer
            text.text = it.homepage +it.last_air_date + it.original_language
        })
    }
}
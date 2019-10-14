package com.app.showflix.view.activities.movie

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.app.showflix.R
import com.app.showflix.databinding.PopularMovieDetailActivityBinding
import com.app.showflix.viewmodel.movies.PopularMovieDetailViewModel
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext

class PopularMovieDetailActivity : AppCompatActivity(), CoroutineScope {


    private lateinit var job: Job

    override val coroutineContext: CoroutineContext
        get() = job + Dispatchers.Main


    private lateinit var viewModelFactory: ViewModelProvider.Factory

    private lateinit var viewModel: PopularMovieDetailViewModel

    private var movieId: Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (intent != null) {
            movieId = intent.getIntExtra("id", 0)
        }
        job = Job()
        //setContentView(R.layout.popular_movie_details)
        setSupportActionBar(toolbar)
        viewModelFactory = PopularMovieDetailViewModel.Factory(movieId)
        viewModel = ViewModelProviders.of(this, viewModelFactory)
            .get(PopularMovieDetailViewModel::class.java)


        DataBindingUtil.setContentView<PopularMovieDetailActivityBinding>(
            this,
            R.layout.popular_movie_detail_activity
        ).apply {
            this.setLifecycleOwner(this@PopularMovieDetailActivity)
            this.testViewModel = viewModel
        }
/*
        val binding:PopularMovieDetailActivityBinding = DataBindingUtil.setContentView(this, R.layout.popular_movie_detail_activity)
        binding.lifecycleOwner = this*/
        bindUI()
    }

    private fun bindUI() = launch {
        viewModel.fetchPopularMovieDetail()
        // toolbar.title = "Movie Detail"
        viewModel.popularMovieDetailLiveData.observe(this@PopularMovieDetailActivity, Observer {
            if (it == null) return@Observer
//            text.text = it.toString()
        })
    }


    override fun onDestroy() {
        super.onDestroy()
        job.cancel()
    }
}
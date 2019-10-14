package com.app.showflix.view.fragments.movies

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.app.showflix.R
import com.app.showflix.view.fragments.BaseFragment
import com.app.showflix.viewmodel.BaseViewModel
import com.app.showflix.viewmodel.movies.PopularMovieDetailViewModel
import kotlinx.android.synthetic.main.popular_movie_details.*

class PopularMovieDetailFragment : BaseFragment() {

    private val viewModelFactory = BaseViewModel.Factory()

    private lateinit var viewModel: PopularMovieDetailViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.popular_movie_details,container,false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModel = ViewModelProviders.of(this,viewModelFactory).get(PopularMovieDetailViewModel::class.java)

        bindUI()
    }

    private fun bindUI() {
        viewModel.fetchPopularMovieDetail()
        viewModel.popularMovieDetailLiveData.observe(this, Observer {
            if (it == null) return@Observer
            text.text = it.toString()
        })
    }
}
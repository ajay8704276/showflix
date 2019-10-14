package com.app.showflix.view.fragments.movies

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.app.showflix.R
import com.app.showflix.utils.NetworkState
import com.app.showflix.view.adapter.PopularMoviePagedListAdapter
import com.app.showflix.view.fragments.BaseFragment
import com.app.showflix.viewmodel.BaseViewModel
import com.app.showflix.viewmodel.movies.PopularMoviesViewModel
import kotlinx.android.synthetic.main.popular_movies.*
import kotlinx.coroutines.CoroutineScope

class PopularMoviesFragment : BaseFragment(), CoroutineScope {

    private val viewModelFactory = BaseViewModel.Factory()

    private lateinit var viewModel: PopularMoviesViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.popular_movies, container, false)
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModel =
            ViewModelProviders.of(this, viewModelFactory).get(PopularMoviesViewModel::class.java)

        bindUI()


    }

    private fun bindUI() {

        val movieAdapter = activity?.let { PopularMoviePagedListAdapter(it) }

        val linearLayoutManager = LinearLayoutManager(activity)

        rv_movie_list.layoutManager = linearLayoutManager
        rv_movie_list.setHasFixedSize(true)
        rv_movie_list.adapter = movieAdapter

        viewModel.popularMoviePagedList.observe(this, Observer {
            movieAdapter?.submitList(it)
        })

        viewModel.networkState.observe(this, Observer {
            progress_bar_popular.visibility =
                if (viewModel.listIsEmpty() && it == NetworkState.LOADING) View.VISIBLE else View.GONE
            txt_error_popular.visibility =
                if (viewModel.listIsEmpty() && it == NetworkState.ERROR) View.VISIBLE else View.GONE

            if (!viewModel.listIsEmpty()) {
                movieAdapter?.setNetworkState(it)
            }
        })

    }
}
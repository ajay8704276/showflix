package com.app.showflix.view.fragments.tv

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.app.showflix.R
import com.app.showflix.utils.NetworkState
import com.app.showflix.view.adapter.PopularTvPagedListAdapter
import com.app.showflix.view.fragments.BaseFragment
import com.app.showflix.viewmodel.BaseViewModel
import com.app.showflix.viewmodel.tv.PopularTvViewModel
import kotlinx.android.synthetic.main.popular_tv.*

class PopularTvFragment : BaseFragment() {

    private val viewModelFactory = BaseViewModel.Factory()

    private lateinit var viewModel: PopularTvViewModel


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.popular_tv, container, false)
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel =
            ViewModelProviders.of(this, viewModelFactory).get(PopularTvViewModel::class.java)
        bindUI()
    }

    private fun bindUI() {
        val tvAdapter = activity?.let { PopularTvPagedListAdapter(it) }

        val linearLayoutManager = LinearLayoutManager(activity)

        rv_tv_list.layoutManager = linearLayoutManager
        rv_tv_list.setHasFixedSize(true)
        rv_tv_list.adapter = tvAdapter

        viewModel.popularTvPagedList.observe(this, Observer {
            tvAdapter?.submitList(it)
        })

        viewModel.networkState.observe(this, Observer {
            progress_bar_popular.visibility =
                if (viewModel.listIsEmpty() && it == NetworkState.LOADING) View.VISIBLE else View.GONE
            txt_error_popular.visibility =
                if (viewModel.listIsEmpty() && it == NetworkState.ERROR) View.VISIBLE else View.GONE

            if (!viewModel.listIsEmpty()) {
                tvAdapter?.setNetworkState(it)
            }
        })

    }
}
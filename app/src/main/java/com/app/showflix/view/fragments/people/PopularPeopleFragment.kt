package com.app.showflix.view.fragments.people

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.app.showflix.R
import com.app.showflix.utils.NetworkState
import com.app.showflix.view.adapter.PopularPeoplePagedListAdapter
import com.app.showflix.view.fragments.BaseFragment
import com.app.showflix.viewmodel.BaseViewModel
import com.app.showflix.viewmodel.people.PopularPeopleViewModel
import kotlinx.android.synthetic.main.popular_people.*

class PopularPeopleFragment :BaseFragment(){

    private val viewModelFactory = BaseViewModel.Factory()

    lateinit var viewModel: PopularPeopleViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.popular_people,container,false)
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModel = ViewModelProviders.of(this,viewModelFactory).get(PopularPeopleViewModel::class.java)
        bindUI()

    }

    private fun bindUI(){
        val peopleAdapter = activity?.let { PopularPeoplePagedListAdapter(it) }

        val linearLayoutManager = LinearLayoutManager(activity)

        rv_people_list.layoutManager = linearLayoutManager
        rv_people_list.setHasFixedSize(true)
        rv_people_list.adapter = peopleAdapter

        viewModel.popularPeoplePagedList.observe(this, Observer {
            peopleAdapter?.submitList(it)
        })

        viewModel.networkState.observe(this, Observer {
            progress_bar_popular.visibility =
                if (viewModel.listIsEmpty() && it == NetworkState.LOADING) View.VISIBLE else View.GONE
            txt_error_popular.visibility =
                if (viewModel.listIsEmpty() && it == NetworkState.ERROR) View.VISIBLE else View.GONE

            if (!viewModel.listIsEmpty()) {
                peopleAdapter?.setNetworkState(it)
            }
        })

    }
}
package com.app.showflix.view.activities.people

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.app.showflix.R
import com.app.showflix.viewmodel.people.PopularPeopleDetailViewModel
import kotlinx.android.synthetic.main.popular_people_detail.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext

class PopularPeopleDetailActivity:AppCompatActivity(),CoroutineScope {

    private lateinit var job:Job

    override val coroutineContext: CoroutineContext
        get() = job + Dispatchers.Main

    private lateinit var viewModelFactory : ViewModelProvider.Factory

    private lateinit var viewModel : PopularPeopleDetailViewModel

    private var peopleId:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (intent!=null){
            peopleId = intent.getIntExtra("id",0)
        }
        job = Job()
        setContentView(R.layout.popular_people_detail)
        setSupportActionBar(toolbar)

        viewModelFactory =PopularPeopleDetailViewModel.Factory(peopleId)

        viewModel = ViewModelProviders.of(this, viewModelFactory)
            .get(PopularPeopleDetailViewModel::class.java)

        bindUI()
    }

    private fun bindUI() = launch {
        viewModel.fetchPopularPeopleDetail()
        toolbar.title = "People Detail"
        viewModel.popularPeopleDetailLiveData.observe(this@PopularPeopleDetailActivity, Observer {
            if (it == null) return@Observer
            text.text = it.name + it.gender.toString() + it.birthday
        })
    }
}
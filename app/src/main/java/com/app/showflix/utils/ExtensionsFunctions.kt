package com.app.showflix.utils

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

/**
 * View Model Extension function
 */
fun <T : ViewModel> T.createFactory(): ViewModelProvider.Factory {

    val viewModel = this

    return object : ViewModelProvider.Factory {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            if (modelClass.isAssignableFrom(viewModel::class.java)) {
                return viewModel as T
            }
            throw IllegalArgumentException("Unable to initialize the view model : ${viewModel.javaClass.canonicalName}")
        }
    }
}


package com.app.showflix

import android.app.Application
import com.app.showflix.utils.connectivity.ConnectivityInterceptor
import com.app.showflix.utils.connectivity.ConnectivityInterceptorImp
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.android.androidModule
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.singleton

class ShowFlixApplication : Application(), KodeinAware {
    override val kodein = Kodein.lazy {
        import(androidModule(this@ShowFlixApplication))

        bind<ConnectivityInterceptor>() with singleton {
            ConnectivityInterceptorImp(instance())
        }

       // bind() from provider { PopularMoviesViewModelFactory(instance()) }
    }
}
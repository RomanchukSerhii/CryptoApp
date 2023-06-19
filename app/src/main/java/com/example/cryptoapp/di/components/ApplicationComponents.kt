package com.example.cryptoapp.di.components

import android.app.Application
import com.example.cryptoapp.App
import com.example.cryptoapp.di.annotations.ApplicationScope
import com.example.cryptoapp.di.modules.DataModule
import com.example.cryptoapp.di.modules.ViewModelModule
import com.example.cryptoapp.presentation.CoinDetailFragment
import com.example.cryptoapp.presentation.CoinPriceListActivity
import dagger.BindsInstance
import dagger.Component

@ApplicationScope
@Component(modules = [DataModule::class, ViewModelModule::class])
interface ApplicationComponents {

    fun inject(activity: CoinPriceListActivity)

    fun inject(fragment: CoinDetailFragment)

    fun inject(application: App)

    @Component.Factory
    interface ApplicationComponentsFactory {
        fun create(
            @BindsInstance application: Application
        ): ApplicationComponents
    }
}
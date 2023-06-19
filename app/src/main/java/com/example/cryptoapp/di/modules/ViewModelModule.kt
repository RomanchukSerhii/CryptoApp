package com.example.cryptoapp.di.modules

import androidx.lifecycle.ViewModel
import com.example.cryptoapp.di.annotations.ViewModelKey
import com.example.cryptoapp.presentation.CoinViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface ViewModelModule {

    @IntoMap
    @ViewModelKey(CoinViewModel::class)
    @Binds
    fun bindCoinViewModel(impl: CoinViewModel): ViewModel
}
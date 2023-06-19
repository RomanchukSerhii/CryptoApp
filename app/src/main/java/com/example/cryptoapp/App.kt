package com.example.cryptoapp

import android.app.Application
import com.example.cryptoapp.di.components.DaggerApplicationComponents

class App : Application() {

    val component by lazy {
        DaggerApplicationComponents.factory()
            .create(this)
    }
}
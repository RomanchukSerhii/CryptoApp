package com.example.cryptoapp.di.modules

import com.example.cryptoapp.data.workers.ChildWorkerFactory
import com.example.cryptoapp.data.workers.RefreshDataWorker
import com.example.cryptoapp.di.annotations.WorkerKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface WorkerModule {

    @Binds
    @IntoMap
    @WorkerKey(RefreshDataWorker::class)
    fun bindRefreshDataWorkerFactory(worker: RefreshDataWorker.Factory) : ChildWorkerFactory
}
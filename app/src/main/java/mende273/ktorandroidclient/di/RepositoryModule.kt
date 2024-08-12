package mende273.ktorandroidclient.di

import mende273.ktorandroidclient.data.repository.RemoteRepository
import mende273.retrofitandroidclient.data.repository.RemoteRepositoryImpl
import mende273.retrofitandroidclient.network.ApiService
import org.koin.dsl.module

val repositoryModule = module {
    single<RemoteRepository> { RemoteRepositoryImpl(get()) }
}

fun provideRemoteRepository(apiService: ApiService): RemoteRepositoryImpl {
    return RemoteRepositoryImpl(apiService)
}

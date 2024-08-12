package mende273.ktorandroidclient.di

import mende273.retrofitandroidclient.ui.screen.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { MainViewModel(get()) }
}
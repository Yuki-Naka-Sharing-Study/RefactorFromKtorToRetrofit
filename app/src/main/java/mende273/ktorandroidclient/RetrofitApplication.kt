package mende273.ktorandroidclient

import android.app.Application
import mende273.ktorandroidclient.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class RetrofitApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@RetrofitApplication)
            modules(appModule)
        }
    }
}
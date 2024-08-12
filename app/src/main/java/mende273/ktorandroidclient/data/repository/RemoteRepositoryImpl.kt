package mende273.retrofitandroidclient.data.repository

import mende273.ktorandroidclient.data.model.Drink
import mende273.ktorandroidclient.data.repository.RemoteRepository
import mende273.retrofitandroidclient.network.ApiService

class RemoteRepositoryImpl(
    private val apiService: ApiService
) : RemoteRepository {
    override suspend fun getDrinks(): Result<List<Drink>> =
        runCatching {
            apiService.getDrinks().drinks
        }
}
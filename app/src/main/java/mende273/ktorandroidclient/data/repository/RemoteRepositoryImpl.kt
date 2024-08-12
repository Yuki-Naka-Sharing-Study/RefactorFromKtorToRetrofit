package mende273.retrofitandroidclient.data.repository

import mende273.ktorandroidclient.data.model.Drink

interface RemoteRepository {
    suspend fun getDrinks(): Result<List<Drink>>
}

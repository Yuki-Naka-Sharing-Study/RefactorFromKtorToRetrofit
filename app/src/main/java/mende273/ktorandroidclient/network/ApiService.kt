package mende273.retrofitandroidclient.network

import mende273.ktorandroidclient.data.model.DrinksResponse
import retrofit2.http.GET

interface ApiService {
    @GET("api/json/v1/1/filter.php?c=Ordinary_Drink")
    suspend fun getDrinks(): DrinksResponse
}
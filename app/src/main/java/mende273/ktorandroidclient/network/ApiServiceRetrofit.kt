package mende273.ktorandroidclient.network

import mende273.ktorandroidclient.data.model.DrinksResponse
import retrofit2.Call
import retrofit2.http.GET

interface ApiServiceRetrofit {
    @GET("https://www.thecocktaildb.com/api/json/v1/1/filter.php?c=Ordinary_Drink")
    fun getDrinks(): Call<List<DrinksResponse>>
}
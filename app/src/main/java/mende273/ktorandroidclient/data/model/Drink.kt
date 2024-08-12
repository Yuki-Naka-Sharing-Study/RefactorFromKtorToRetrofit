package mende273.ktorandroidclient.data.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Drink(
    @Json(name = "idDrink") val idDrink: Long? = null,
    @Json(name = "strDrink") val strDrink: String? = null,
    @Json(name = "strDrinkThumb") val strDrinkThumb: String? = null
)
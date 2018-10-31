package com.pelingulcinar.sonraneolduapp.network

import com.pelingulcinar.sonraneolduapp.network.response.StoriesByIdResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface StoriesService {

    @GET("stories/{id}") //linki kontrol et

    fun getStoriesById(@Path("id") id: String): Call<StoriesByIdResponse>

}



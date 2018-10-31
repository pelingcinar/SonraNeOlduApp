package com.pelingulcinar.sonraneolduapp.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient {

    companion object {

        fun getClient() : Retrofit {

            return Retrofit.Builder()
                    .baseUrl("http://api.sonraneoldu.com/v2/")
                    .addConverterFactory(GsonConverterFactory.create()).build()
        }

    }
}
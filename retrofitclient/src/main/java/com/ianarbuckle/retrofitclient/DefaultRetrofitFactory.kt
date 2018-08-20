package com.ianarbuckle.retrofitclient

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

/**
 * Created by Ian Arbuckle on 16/07/2018.
 *
 */
open class DefaultRetrofitFactory(private val baseUrl: String, private val okHttpClient: OkHttpClient) : RetrofitFactory {

    private lateinit var retrofit: Retrofit

    open fun modifyRetrofit(builder: Retrofit.Builder): Retrofit.Builder {
        builder.addConverterFactory(MoshiConverterFactory.create())
        return builder
    }

    override fun getRetrofit(): Retrofit {
        var retrofitBuilder: Retrofit.Builder = Retrofit.Builder()
                .baseUrl(baseUrl)
                .client(okHttpClient)
        retrofitBuilder = modifyRetrofit(retrofitBuilder)
        retrofit = retrofitBuilder.build()
        return retrofit
    }
}
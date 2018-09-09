package com.ianarbuckle.restaurants.builder

import android.arch.lifecycle.LifecycleOwner
import com.ianarbuckle.restaurants.home.RestaurantsFragment
import com.ianarbuckle.restaurants.home.builder.DaggerHomeComponent
import com.ianarbuckle.restaurants.home.builder.HomeModule
import com.ianarbuckle.restaurants.network.builder.NetworkModule
import okhttp3.OkHttpClient
import retrofit2.Converter

/**
 * Created by Ian Arbuckle on 18/07/2018.
 *
 */
class DefaultRestaurantsInjector(private val okHttpClient: OkHttpClient, private val baseUrl: String, private val converterFactory: Converter.Factory) : RestaurantsInjector {

    override fun inject(fragment: RestaurantsFragment, lifecycleOwner: LifecycleOwner) {
        DaggerHomeComponent.builder()
                .homeModule(HomeModule(fragment, lifecycleOwner))
                .networkModule(NetworkModule(okHttpClient, baseUrl, converterFactory))
                .build()
                .inject(fragment)
    }
}
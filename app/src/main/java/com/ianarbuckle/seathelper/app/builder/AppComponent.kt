package com.ianarbuckle.seathelper.app.builder

import com.ianarbuckle.client.AuthenticationClient
import com.ianarbuckle.database.client.DatabaseClient
import com.ianarbuckle.seathelper.app.RestaurantBuddyApplication
import com.ianarbuckle.seathelper.network.NetworkModule
import dagger.Component
import okhttp3.Cache
import okhttp3.Interceptor
import okhttp3.OkHttpClient

/**
 * Created by Ian Arbuckle on 18/05/2018.
 *
 */
@AppScope
@Component(modules = [
    AppModule::class,
    NetworkModule::class,
    NavigationModule::class,
    DatabaseModule::class,
    AuthenticationModule::class
])
interface AppComponent {
    fun inject(restaurantBuddyApplication: RestaurantBuddyApplication)
    fun authenticationClient(): AuthenticationClient
}
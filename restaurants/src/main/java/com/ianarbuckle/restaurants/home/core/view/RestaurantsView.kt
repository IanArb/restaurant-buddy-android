package com.ianarbuckle.restaurants.home.core.view

import android.view.View
import com.ianarbuckle.restaurants.home.model.Restaurant
import com.ianarbuckle.restaurants.home.model.Restaurants
import io.reactivex.Observable

/**
 * Created by Ian Arbuckle on 11/07/2018.
 *
 */
interface RestaurantsView {
    fun getView(): View
    fun showRestaurants(restaurants: MutableList<Restaurants>?)
    fun showEmptyState()
    fun showLoading()
    fun hideLoading()
    fun showPullToRefresh()
    fun observeOnPullToRefresh(): Observable<Any>
    fun terminatePullToRefresh()
    fun observeOnTryAgainClick(): Observable<Any>
}
package com.ianarbuckle.restaurants.builder

import com.ianarbuckle.restaurants.ui.home.RestaurantsFragment

/**
 * Created by Ian Arbuckle on 15/07/2018.
 *
 */
interface RestaurantsInjector {
    fun inject(fragment: RestaurantsFragment)
}
package com.ianarbuckle.seathelper.home.router

import com.ianarbuckle.seathelper.utils.BottomNavigationPosition

/**
 * Created by Ian Arbuckle on 18/05/2018.
 *
 */
interface HomeRouter {
    fun switchFragment(navigationPosition: BottomNavigationPosition): Boolean
}
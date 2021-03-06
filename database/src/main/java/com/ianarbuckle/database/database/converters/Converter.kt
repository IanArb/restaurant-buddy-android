package com.ianarbuckle.database.database.converters

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.ianarbuckle.models.restaurant.Dish
import com.ianarbuckle.models.restaurant.Location
import com.ianarbuckle.models.restaurant.Restaurant
import org.threeten.bp.LocalDateTime

/**
 * Created by Ian Arbuckle on 2019-05-26.
 *
 */
object LocationConverter {

    @TypeConverter
    @JvmStatic
    fun fromLocation(location: Location): String {
        val gson = Gson()
        val type = object : TypeToken<Location>() {}.type
        return gson.toJson(location, type)
    }

    @TypeConverter
    @JvmStatic
    fun toLocation(locationString: String): Location {
        val gson = Gson()
        val type = object : TypeToken<Location>() {}.type
        return gson.fromJson<Location>(locationString, type)
    }

}

object DishConverter {
    @TypeConverter
    @JvmStatic
    fun fromDishList(dishes: MutableList<Dish>): String {
        val gson = Gson()
        return gson.toJson(dishes)
    }

    @TypeConverter
    @JvmStatic
    fun toDishList(menuString: String): MutableList<Dish> {
        val gson = Gson()
        val type = object : TypeToken<MutableList<Dish>>() {}.type
        return gson.fromJson<MutableList<Dish>>(menuString, type)
    }
}

object RestaurantConverter {
    @TypeConverter
    @JvmStatic
    fun fromRestaurantList(restaurants: MutableList<Restaurant>): String {
        val gson = Gson()
        return gson.toJson(restaurants)
    }

    @TypeConverter
    @JvmStatic
    fun toRestaurantList(restaurantsString: String): MutableList<Restaurant> {
        val gson = Gson()
        val type = object : TypeToken<MutableList<Restaurant>>() {}.type
        return gson.fromJson<MutableList<Restaurant>>(restaurantsString, type)
    }
}

object LocalDateTimeConverter {
    @TypeConverter
    @JvmStatic
    fun fromLocalDateTime(value: String): LocalDateTime = LocalDateTime.parse(value)

    @TypeConverter
    @JvmStatic
    fun toLocalDateTime(localDateTime: LocalDateTime): String = localDateTime.toString()
}

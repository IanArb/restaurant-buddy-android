package com.ianarbuckle.booking.ui.calendar.core.view

import android.content.Context
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.ianarbuckle.booking.R
import com.ianarbuckle.core.extensions.getDrawableFromAttr
import com.squareup.timessquare.CalendarPickerView
import kotlinx.android.synthetic.main.calendar_view.view.*
import java.util.*

/**
 * Created by Ian Arbuckle on 2019-09-02.
 *
 */
interface CalendarView {
    fun getView(): View
//    fun onCalendarClick(clickListener: (Date) -> Unit)
    fun toolbarClickListener(clickListener: () -> Unit)
}

class CalendarViewImpl(context: Context) : CalendarView, ConstraintLayout(context) {

    private lateinit var bottomSheetBehavior: BottomSheetBehavior<View>

    private val calendarPickerView: CalendarPickerView

    init {
        inflate(context, R.layout.calendar_view, this)
        calendarPickerView = findViewById<View>(R.id.calendar) as CalendarPickerView
        initCalendar(context)
    }

    private fun initCalendar(context: Context) {
        val nextYear = Calendar.getInstance()
        nextYear.add(Calendar.YEAR, 1)
        val today = Date()
        calendarPickerView.init(today, nextYear.time)
                .inMode(CalendarPickerView.SelectionMode.SINGLE)
                .withSelectedDate(today)
        toolbar.setNavigationIcon(context.getDrawableFromAttr(R.attr.backArrowDrawable))
        calendarPickerView.setOnDateSelectedListener(object : CalendarPickerView.OnDateSelectedListener {
            override fun onDateSelected(date: Date) {
                bottomSheet.visibility = View.VISIBLE
            }

            override fun onDateUnselected(date: Date?) {

            }
        })
    }

    override fun getView(): View = this

//    override fun onCalendarClick(clickListener: (Date) -> Unit) {
//        calendarPickerView.setOnDateSelectedListener(object : CalendarPickerView.OnDateSelectedListener {
//            override fun onDateSelected(date: Date) {
//
//            }
//
//            override fun onDateUnselected(date: Date?) {
//                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//            }
//        })
//    }

    override fun toolbarClickListener(clickListener: () -> Unit) {
        clickListener()
    }

}
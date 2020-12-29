package ro.iacmi.calendar

import android.os.Bundle
//import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.CalendarView
import android.widget.CalendarView.OnDateChangeListener
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*


class MainActivity : AppCompatActivity() {
    // Define the variable of CalendarView type
    // and TextView type;
    lateinit var calender: CalendarView
    lateinit var date_view: TextView
    lateinit var holiday: TextView
    private lateinit var publicHolidayByDate: Map<Date, List<PublicHoliday>>

    private fun fallback(): Map<Date, List<PublicHoliday>>{
        if (!this::publicHolidayByDate.isInitialized){
            publicHolidayByDate = getApplication()
                .getApplicationContext()
                .offlineFallbackHoliday()
                .responseToPublicHolidays()
                .publicHolidayByDate()
        }
        return publicHolidayByDate
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calender = findViewById<View>(R.id.calender) as CalendarView
        date_view = findViewById<View>(R.id.date_view) as TextView
        holiday = findViewById<View>(R.id.holidays) as TextView

        // Add Listener in calendar
        calender!!
            .setOnDateChangeListener(
                OnDateChangeListener { view, year, month, dayOfMonth ->

                    // set this date in TextView for Display
                    date_view.text = dayOfMonth.toString() + "-" + (month + 1) + "-" + year
                    holiday.text = computeHolidaysText(year,month, dayOfMonth)
                })


    }

    private fun computeHolidaysText(year: Int, month: Int, dayOfMonth:Int): String {
        val currentDate = Date(year- 1900,month, dayOfMonth)
        val currentHolidays: List<PublicHoliday> = fallback()[currentDate] ?: emptyList()
        return currentHolidays.toText()
    }
}
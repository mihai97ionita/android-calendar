package ro.iacmi.calendar

//import android.support.v7.app.AppCompatActivity

import android.os.Bundle
import android.view.View
import android.widget.CalendarView
import android.widget.CalendarView.OnDateChangeListener
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class CalendarByMonthActivity : AppCompatActivity() {
    private lateinit var calendarView: CalendarView
    private lateinit var dateTextView: TextView
    private lateinit var holidayTextView: TextView
    private lateinit var holidayService: HolidayService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dateTextView = findViewById<View>(R.id.date_view) as TextView
        holidayTextView = findViewById<View>(R.id.holidays) as TextView
        initHolidayService()
        initCalendar()
    }

    private fun initHolidayService() {
        if (!this::holidayService.isInitialized){
            holidayService = HolidayService(
                HttpClientFactory.httpGetHolidays(applicationContext),
                application.applicationContext.fallbackHolidayResponse()
            )
        }
    }

    private fun initCalendar() {
        if (!this::calendarView.isInitialized) {
            calendarView = findViewById<View>(R.id.calender) as CalendarView
            calendarView
                .setOnDateChangeListener(
                    OnDateChangeListener { view, year, month, dayOfMonth ->
                        dateTextView.text = toText(year, month, dayOfMonth)
                        holidayTextView.text =
                            holidayService.computeHolidaysText(year, month, dayOfMonth)
                    })
        }
    }

    private fun toText(year: Int, month: Int, dayOfMonth: Int) =
        dayOfMonth.toString() + "-" + (month + 1) + "-" + year
}
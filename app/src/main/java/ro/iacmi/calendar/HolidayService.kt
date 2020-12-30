package ro.iacmi.calendar

import android.os.Handler
import com.androidnetworking.common.ANRequest
import com.androidnetworking.error.ANError
import com.androidnetworking.interfaces.StringRequestListener
import java.util.*

class HolidayService(
    private val httpGetHolidays: ANRequest<out ANRequest<*>>,
    private val fallbackHolidayResponse: String,
    private val refreshIntervalMs: Long = 180_000
){
    @Volatile
    private var holidays: Map<Date, List<PublicHoliday>> = fallbackHolidayResponse.toPublicHolidays().toMapByDate()
    private val handler: Handler = Handler()

    init {
        initPeriodicalPopulation()
    }

    fun computeHolidaysText(year: Int, month: Int, dayOfMonth:Int): String {
        val currentDate = Date(year - 1900, month, dayOfMonth)
        val currentHolidays: List<PublicHoliday> =  holidays[currentDate] ?: emptyList()
        return currentHolidays.toText()
    }

    private fun initPeriodicalPopulation() {
        val runnableCode: Runnable = object : Runnable {
            override fun run() {
                repopulateHolidays()
                handler.postDelayed(this, refreshIntervalMs)
            }
        }
        handler.post(runnableCode)
    }

    private fun repopulateHolidays(){
        httpGetHolidays
            .getAsString(object : StringRequestListener {
                override fun onResponse(response: String?) {
                    holidays = response!!.toPublicHolidays().toMapByDate()
                    println("onResponse: $holidays")
                }

                override fun onError(error: ANError) {
                    holidays = fallbackHolidayResponse.toPublicHolidays().toMapByDate()
                    println("onError: $error")
                }
            })
    }
}
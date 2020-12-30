package ro.iacmi.calendar

import android.content.Context
import com.androidnetworking.AndroidNetworking
import com.androidnetworking.common.ANRequest
import com.androidnetworking.common.Priority

object HttpClientFactory {

    private lateinit var httpClient: ANRequest<out ANRequest<*>>

    fun httpGetHolidays(applicationContext: Context): ANRequest<out ANRequest<*>> {
        AndroidNetworking.initialize(applicationContext);
        if (!this::httpClient.isInitialized){
            httpClient = AndroidNetworking.get("https://www.googleapis.com/calendar/v3/calendars/en.uk%23holiday%40group.v.calendar.google.com/events")
                .addQueryParameter("key", "REMOVED")
                .setPriority(Priority.HIGH)
                .build()
        }
        return httpClient
    }
}
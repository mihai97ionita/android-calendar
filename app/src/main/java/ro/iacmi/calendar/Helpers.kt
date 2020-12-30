package ro.iacmi.calendar

import android.content.Context
import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.ObjectMapper
import java.io.ByteArrayOutputStream
import java.util.*


fun Context.fallbackHolidayResponse(): String{
    val inputStream = this.resources.openRawResource(R.raw.fall_back_holiday)
    val result = ByteArrayOutputStream()
    val buffer = ByteArray(1024)
    var length: Int
    while (inputStream.read(buffer).also { length = it } != -1) {
        result.write(buffer, 0, length)
    }
    return result.toString("UTF-8")
}

fun String.toPublicHolidays(): List<PublicHoliday> {
    val list = ObjectMapper()
        .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
        .readValue(this, ApiResponse::class.java)
        .items
    return list
        ?.filter {
                it.endDate != null &&
                it.startDate != null &&
                it.summary != null &&
                it.summary!!.isNotBlank() }
        ?.map { PublicHoliday(summary = it.summary!!, startDate = it.startDate!!, endDate = it.endDate!!) }
        ?: emptyList()
}

fun List<PublicHoliday>.toMapByDate(): Map<Date, List<PublicHoliday>>{
    return this.groupBy { it.startDate }
}

fun List<PublicHoliday>.toText(): String{
    return this
        .map { "- ${it.summary}" }
        .ifEmpty { return "" }
        .reduce { acc, s ->
        acc + "$s\n"
    }
}
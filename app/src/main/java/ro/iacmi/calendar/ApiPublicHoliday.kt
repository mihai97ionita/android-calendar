package ro.iacmi.calendar

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.ObjectMapper
import java.text.SimpleDateFormat
import java.util.*

data class PublicHoliday(
        val summary: String,
        val startDate: Date,
        val endDate: Date
)

data class ApiPublicHoliday(
        var summary: String? = null,
        var startDate: Date? =null,
        var endDate: Date? =null
){
    @JsonProperty("start")
    private fun startDate(input: Map<String, Any>) {
        startDate = getDate(input)
    }

    @JsonProperty("end")
    private fun endDate(input: Map<String, Any>) {
        endDate = getDate(input)
    }

    companion object{
        private val format = SimpleDateFormat("yyyy-MM-dd")

        fun getDate(input: Map<String, Any>): Date{
            val date = input["date"] as String
            return format.parse(date)
        }
    }
}

data class ApiResponse (
        var items: List<ApiPublicHoliday>? = null
)




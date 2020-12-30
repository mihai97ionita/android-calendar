package ro.iacmi.calendar

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class UnitTest {

    @Test
    fun `parse json response`() {

        val response = DataProvider.getJsonHoliday()

        val list = response.toPublicHolidays()

        assertNotNull(list)
        assertTrue(list.isNotEmpty())
        assertTrue(list.toText().isNotBlank())
    }
}
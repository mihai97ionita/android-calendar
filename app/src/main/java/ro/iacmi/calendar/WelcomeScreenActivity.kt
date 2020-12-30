package ro.iacmi.calendar

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class WelcomeScreenActivity : AppCompatActivity() {

    private lateinit var GOButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.welcome_screen)

        GOButton = findViewById<View>(R.id.button) as Button
        GOButton.setOnClickListener(View.OnClickListener {
            setContentView(R.layout.activity_main)
            val intent = Intent(applicationContext, CalendarByMonthActivity::class.java)
            startActivity(intent)
        })
    }


}
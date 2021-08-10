package net.bible.android.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import android.view.View
import androidx.core.view.MotionEventCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton
import net.bible.android.view.activity.navigation.ChooseDocument
import net.bible.android.view.activity.page.MainBibleActivity
class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }



    override fun onTouchEvent(event: MotionEvent): Boolean {

        val action: Int = MotionEventCompat.getActionMasked(event)

        return when (action) {
            MotionEvent.ACTION_DOWN -> {
                val intent = Intent(this, MainBibleActivity::class.java)
                startActivity(intent)
                true
            }
            //else -> super.onTouchEvent(event)
            else -> true
        }
    }
}

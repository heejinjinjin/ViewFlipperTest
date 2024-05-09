package kr.ac.kopo.viewflippertest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ViewFlipper

class MainActivity : AppCompatActivity() {
    lateinit var btnNext : Button
    lateinit var btnPrev : Button
    lateinit var vFlip : ViewFlipper
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnNext = findViewById<Button>(R.id.btnNext)
        btnPrev = findViewById<Button>(R.id.btnPrev)
        vFlip = findViewById<ViewFlipper>(R.id.flipper)

        btnNext.setOnClickListener(btnListner)
        btnPrev.setOnClickListener(btnListner)
    }

    val btnListner = View.OnClickListener {
        when(it.id){
            R.id.btnNext -> vFlip.showNext()
            R.id.btnPrev -> vFlip.showPrevious()
        }
    }
}
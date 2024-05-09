package kr.ac.kopo.viewflippertest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ViewFlipper

class MainActivity : AppCompatActivity() {
    lateinit var btnStart : Button
    lateinit var btnStop : Button
    lateinit var vFlip : ViewFlipper
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnStart = findViewById<Button>(R.id.btnStart)
        btnStop = findViewById<Button>(R.id.btnStop)
        vFlip = findViewById<ViewFlipper>(R.id.flipper)

        btnStart.setOnClickListener(btnListner)
        vFlip.setFlipInterval(2000)
        btnStop.setOnClickListener(btnListner)
    }

    val btnListner = View.OnClickListener {
        when(it.id){
            R.id.btnStart -> vFlip.startFlipping()
            R.id.btnStop -> vFlip.stopFlipping()
        }
    }
}
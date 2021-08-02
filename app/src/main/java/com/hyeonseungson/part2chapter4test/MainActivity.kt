package com.hyeonseungson.part2chapter4test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val singer1 = Singer("다혜", 29)
        val singer2 = Singer("현승", 30)

        singer1Img.setOnClickListener {
            showToast("${singer1.age}세 ${singer1.name} 선택")
            selectedSinger.setText("선택된 가수 : ${singer1.name}")
        }
        singer2Img.setOnClickListener {
            showToast("${singer2.age}세 ${singer2.name} 선택")
            selectedSinger.setText("선택된 가수 : ${singer2.name}")
        }

    }
    fun showToast(message:String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}

class Singer (val name : String, val age : Int) {
}
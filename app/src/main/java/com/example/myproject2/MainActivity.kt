package com.example.myproject2

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val layout: LinearLayout = findViewById (R.id.layout)
        val tv1: TextView = findViewById (R.id.tv1)
        val btn1: Button = findViewById (R.id.btn1)
        val btn2: Button = findViewById (R.id.btn2)
        val btn3: Button = findViewById (R.id.btn3)
        //val bt3: Button = findViewById<>(R.id.btn3)
        var size: Float =10f
        var i:Int=0
        var j:Int=0
        btn1.setOnClickListener {
            tv1.setTextSize(size)
            size=(size+2)%20
        }
        btn2.setOnClickListener {
            when(i%3){
                0 -> tv1.setTextColor(Color.BLACK)
                1 -> tv1.setTextColor(Color.BLUE)
                2 -> tv1.setTextColor(Color.GREEN)
            }
            i=i+1

        }
        btn3.setOnClickListener {
            when(j%3){
                0 -> layout.setBackgroundColor(Color.BLACK)
                1 -> layout.setBackgroundColor(Color.BLUE)
                2 -> layout.setBackgroundColor(Color.GREEN)
            }
            j=j+1
        }
    }
}
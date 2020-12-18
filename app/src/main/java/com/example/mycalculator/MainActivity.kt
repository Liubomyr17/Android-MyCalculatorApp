package com.example.mycalculator

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    var lastNumeric : Boolean = false
    var lastDot : Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onDigit(view: View) {
     findViewById<TextView>(R.id.tvInput)?.append((view as Button).text)
        lastNumeric = true
     }

    fun onClear(view: View) {
        findViewById<TextView>(R.id.tvInput).text = ""
        lastNumeric = false
        lastDot = false
    }

    fun onDecimalPoint(view: View) {
        if(lastNumeric && !lastDot) {
            findViewById<TextView>(R.id.tvInput).append(".")
            lastNumeric = false
            lastDot = true
        }
    }
}
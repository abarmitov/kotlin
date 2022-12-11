package com.example.guessthenumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.TextureView
import android.view.View
import android.widget.TextView

class GameActivity : AppCompatActivity() {
    var t1: Int = 0
    var t2: Int = 0
    var x: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)
        t1 = intent.getIntExtra("begin", 0)
        t2 = intent.getIntExtra("end", 100)
        x = (t1 + t2) / 2
        findViewById<TextView>(R.id.question).text = "ваше число больше? $x"
    }

    fun onYesNoClick(view: View) {

        val tvQuestion = findViewById<TextView>(R.id.question)

        when (view.id) {
            R.id.yes -> {
                t1 = x
                x = (t1 + t2) / 2
                tvQuestion.text = "ваше число больше? $x"
            }
            R.id.no -> {
                t2 = x
                x = (t1 + x) / 2
                tvQuestion.text = "ваше число меньше? $x"
            }
        }
        if (t2 - 1 == t1){
            tvQuestion.text = "ваше число: $t2"
        }
    }
}
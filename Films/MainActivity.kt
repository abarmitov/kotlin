package com.example.testapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var array: Array<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        array = resources.getStringArray(R.array.films)
    }

    var count: Int = 0

    fun onClick(v: View) {
        val film = findViewById<TextView>(R.id.films)
        film.text = array[count]
        if (count == 3)
            {
                count = 0}
        else
            {
                count++
        }
    }
    fun onClick_reset(v: View){
        count = 0
        onClick(v)
    }
}
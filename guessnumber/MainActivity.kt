package com.example.guessthenumber

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onGuessClick(view: View) {

        val intent = Intent(this, GameActivity::class.java)

        val minnum = findViewById<EditText>(R.id.begin)
        val maxnum = findViewById<EditText>(R.id.end)

        intent.putExtra("begin", minnum.text)
        intent.putExtra("end", maxnum.text)
        startActivity(intent)

    }
}
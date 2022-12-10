package ru.myitschool.peoplelistk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.ListView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var viewtextlist: MutableList<String> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val lvPeople = findViewById<ListView>(R.id.people)

        val namelist = resources.getStringArray(R.array.firstName)
        val lastnamelist = resources.getStringArray(R.array.lastName)

        namelist.shuffle()
        lastnamelist.shuffle()

        for ((index) in namelist.withIndex()){
            viewtextlist.add(namelist[index] + " " + lastnamelist[index])
        }

        val adapter = ArrayAdapter<String>(this, R.layout.item, viewtextlist)
        lvPeople.adapter = adapter
    }

    fun onAddPersonClick(view: View) {
        val lvPeople = findViewById<ListView>(R.id.people)
        val inptext = findViewById<EditText>(R.id.names)

        viewtextlist.add(inptext.text.toString())

        val adapter = ArrayAdapter<String>(this, R.layout.item, viewtextlist)
        lvPeople.adapter = adapter
        adapter.notifyDataSetChanged()
    }
}
package com.agaba.fieldattachment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun bUClickEvent(view:View){
        val yob = findViewById<EditText>(R.id.etYOB)
        val showAge = findViewById<TextView>(R.id.tvShowAge)

        val userYob:String = yob.text.toString()
        val year:Int = Calendar.getInstance().get(Calendar.YEAR) //getting the current year

        //catching wrong input
        if((userYob.toInt() == 0) || (userYob.toInt() > year)){
            showAge.text = "Invalid Input"
            return
        }
        //calculating the age
        val myAge = year - userYob.toInt()

        //returning result
        showAge.text = "Your age is $myAge"
    }
}


package com.example.assignment2_smd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Page24 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page24)

        var end = findViewById<Button>(R.id.endbutton)
        end.setOnClickListener(View.OnClickListener {

            var intent1 = Intent(this, MainActivity::class.java)
            startActivity(intent1)
        })

        var next = findViewById<Button>(R.id.nextbutton)
        next.setOnClickListener(View.OnClickListener {

            var intent2 = Intent(this, Page25::class.java)
            startActivity(intent2)
        })
    }
}
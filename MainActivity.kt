package com.example.assignment2_smd

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var start = findViewById<Button>(R.id.startbutton)
        start.setOnClickListener(View.OnClickListener {

            var intent = Intent(this, Page1::class.java)
            startActivity(intent)

        })

    }
}
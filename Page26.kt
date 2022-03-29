package com.example.assignment2_smd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Page26 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page26)

        var end = findViewById<Button>(R.id.endbutton)
        end.setOnClickListener(View.OnClickListener {

            var intent1 = Intent(this, MainActivity::class.java)
            startActivity(intent1)
        })
    }
}
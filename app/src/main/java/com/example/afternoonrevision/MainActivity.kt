package com.example.afternoonrevision

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnCalculator:Button
    lateinit var btnContacts:Button
    lateinit var btnWesite:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnCalculator = findViewById(R.id.mBtnCalculator)
        btnContacts = findViewById(R.id.mBtnContacts)
        btnWesite = findViewById(R.id.mBtnWebsite)

        btnCalculator.setOnClickListener {
            val calc = Intent(this, CalculatorActivity::class.java)
            startActivity(calc)
        }
        btnContacts.setOnClickListener {
            val contacts = Intent(this, CalculatorActivity::class.java)
            startActivity(contacts)
        }
        btnWesite.setOnClickListener {
            val web = Intent(this, CalculatorActivity::class.java)
            startActivity(web)
        }
    }
}
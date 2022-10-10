package com.example.project


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toolbar

class TimerActivity : AppCompatActivity() {
    lateinit var toolbar:androidx.appcompat.widget.Toolbar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_timer)
        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        val actionBar =supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)
    }
}
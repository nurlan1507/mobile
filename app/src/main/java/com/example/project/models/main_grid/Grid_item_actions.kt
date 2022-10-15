package com.example.project.models.main_grid

import android.content.Context
import android.content.Intent
import com.example.project.TimerActivity

class Timer(val context: Context):ItemBehaviour{
    override fun performAction() {
        val intent:Intent = Intent(context, TimerActivity::class.java)
        context.startActivity(intent)
    }
}


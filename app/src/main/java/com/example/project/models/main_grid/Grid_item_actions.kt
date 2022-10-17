package com.example.project.models.main_grid

import android.content.Context
import android.content.Intent
import android.widget.Toast
import com.example.project.TimerActivity

class Timer(val context: Context):ItemBehaviour{
    override fun performAction() {
        val intent:Intent = Intent(context, TimerActivity::class.java)
        context.startActivity(intent)
    }
}
class Profile(val context: Context):ItemBehaviour{
    override fun performAction() {
        Toast.makeText(context, "PROFILE", Toast.LENGTH_SHORT)
        return
    }
}


package com.example.project.models.main_grid

import android.content.Context
import android.view.View


class MainMenuItem(
    var name:String,
    private var itemAction:ItemBehaviour,
    var img:Int,
    private var context: Context
){
    fun performAction(){

        itemAction.performAction()
    }
}
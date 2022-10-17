package com.example.project

import android.content.Context
import android.widget.GridLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager

class MainGridLayoutManager(ctx:Context) :GridLayoutManager(ctx,2,GridLayoutManager.VERTICAL, false){

    override fun canScrollVertically(): Boolean {
        return false
    }
}
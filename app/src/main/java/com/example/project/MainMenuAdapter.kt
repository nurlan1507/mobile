package com.example.project

import android.graphics.Color
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.example.project.databinding.LayoutMainGridItemBinding
import com.example.project.models.main_grid.MainMenuItem
import com.example.project.models.main_grid.Timer

class MainMenuAdapter(var options :ArrayList<MainMenuItem>):RecyclerView.Adapter<MainMenuAdapter.MainMenuViewHolder>() {
    class MainMenuViewHolder(val binding:LayoutMainGridItemBinding)
        :RecyclerView.ViewHolder(binding.root)



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainMenuViewHolder {
        val inflater =LayoutInflater.from(parent.context)
        val binding = LayoutMainGridItemBinding.inflate(inflater, parent,false)
        return MainMenuViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MainMenuViewHolder, position: Int) {
        with(holder.binding){
            mainMenuCardImage.setImageResource(options[position].img)
            mainMenuCardName.text = options[position].name
            mainMenuCard.setOnClickListener(){
                options[position].performAction()
            }


        }
    }


    override fun getItemCount(): Int {
        return options.size
    }


}
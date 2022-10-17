package com.example.project


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import android.widget.Toolbar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.project.models.main_grid.MainMenuItem
import com.example.project.models.main_grid.Profile
import com.example.project.models.main_grid.Timer
import com.google.android.material.navigation.NavigationView
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {
    lateinit var toolbar:androidx.appcompat.widget.Toolbar
    lateinit var drawerLayout: DrawerLayout
    lateinit var navView: NavigationView
    lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val actionBar = supportActionBar
        actionBar?.hide()
        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)



        drawerLayout = findViewById(R.id.drawerLayout)
        navView = findViewById(R.id.navigation_view)
        toggle = ActionBarDrawerToggle(this,drawerLayout, 0 ,0)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        navView.setNavigationItemSelectedListener {
            when (it.itemId){
                R.id.nav_home -> Toast.makeText(this, "home", Toast.LENGTH_SHORT).show()
            }
            true
        }



        //recyclerView
        //init adapter and menu options

        val menuOptions = ArrayList<MainMenuItem>()
        menuOptions.add(MainMenuItem("Timer", Timer(this), R.drawable.clocl,this ))
        menuOptions.add(MainMenuItem("Profile", Profile(this), R.drawable.profile , this))

        val mainMenuAdapter = MainMenuAdapter(menuOptions)
        val recyclerView:RecyclerView = findViewById(R.id.recyclerview_main_menu)


        recyclerView.layoutManager = GridLayoutManagers(this)
        recyclerView.adapter=mainMenuAdapter






//        val button:Button = findViewById(R.id.btn)
//        button.setOnClickListener {
//            val intent = Intent(this, TimerActivity::class.java)
//            startActivity(intent)
//        }

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)){
            true
        }
        return super.onOptionsItemSelected(item)
    }
}
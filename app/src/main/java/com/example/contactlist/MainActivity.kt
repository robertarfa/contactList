package com.example.contactlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.Toast

import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private val rvList: RecyclerView by lazy {
        findViewById<RecyclerView>(R.id.rv_list)
    }
    private val adapter = ContactAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.drawer_menu)

        initDrawer()
        bindView()
        updateList()
    }

    private fun initDrawer(){
        val drawerLayout=findViewById<View>(R.id.drawer_layout) as DrawerLayout

        val toolbar =   findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        val toggle  =   ActionBarDrawerToggle(this, drawerLayout , toolbar ,R.string.open_drawer,R.string.close_drawer)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

    }

    private fun bindView(){
        rvList.adapter = adapter
        rvList.layoutManager = LinearLayoutManager(this)
    }

    private fun updateList(){
        adapter.updateList(
            arrayListOf(
                Contact(
                    "Roberta Aguilar 1",
                    "(00) 5555-6666",
                    "img.png"
                ),
                Contact(
                    "Roberta Aguilar 2",
                    "(00) 5555-6666",
                    "img.png"
                ),
                Contact(
                    "Roberta Aguilar 1",
                    "(00) 5555-6666",
                    "img.png"
                ),
                Contact(
                    "Roberta Aguilar 1",
                    "(00) 5555-6666",
                    "img.png"
                ),
                Contact(
                    "Roberta Aguilar 1",
                    "(00) 5555-6666",
                    "img.png"
                ),
                Contact(
                    "Roberta Aguilar 1",
                    "(00) 5555-6666",
                    "img.png"
                ),
                Contact(
                    "Roberta Aguilar 1",
                    "(00) 5555-6666",
                    "img.png"
                ),
                Contact(
                    "Roberta Aguilar 1",
                    "(00) 5555-6666",
                    "img.png"
                ),
                Contact(
                    "Roberta Aguilar 1",
                    "(00) 5555-6666",
                    "img.png"
                ),
                Contact(
                    "Roberta Aguilar 1",
                    "(00) 5555-6666",
                    "img.png"
                ),

            )
        )
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater =  menuInflater
        inflater.inflate(R.menu.menu,menu)
        return true
    }

    private fun showToast(message:String){
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.item_menu_1->{
                showToast("Item 1")
                true
            }
            R.id.item_menu_2 ->{
                showToast("Item 2")
                true
            }
            else    ->super.onOptionsItemSelected(item)
        }
    }
}
package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.ListView
import androidx.core.content.ContextCompat
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.taployalt.frag1
import com.example.taployalt.frag2
import com.example.taployalt.frag3
import com.google.android.material.tabs.TabLayoutMediator
import com.nekotyan9000.lkklkk.MyCustomAdapter
import com.nekotyan9000.lkklkk.MyData

class MainActivity : AppCompatActivity() {
    lateinit var bind: ActivityMainBinding

    private val fragList = listOf(
        frag1.newInstance(),
        frag2.newInstance(),
        frag3.newInstance(),
    )
    private val fragText = listOf(
        "Блюда",
        "Напитки",
        "Корзина",
    )
    private val fragIcon = listOf(
        R.drawable.fon1,
        R.drawable.fon2,
        R.drawable.lamba,
    )

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)
        getSupportActionBar()?.hide()



        val adapter = Viewpageraddapter(this, fragList)
        bind.vp2.adapter = adapter
        TabLayoutMediator(bind.idtabl, bind.vp2){
                tab, pos ->
            tab.text = fragText[pos]
            tab.icon = ContextCompat.getDrawable(this, fragIcon[pos])
        }.attach()



    }
}
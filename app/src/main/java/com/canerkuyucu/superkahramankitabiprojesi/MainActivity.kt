package com.canerkuyucu.superkahramankitabiprojesi

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var superKahramanIsimleri = ArrayList<String>()
        superKahramanIsimleri.add("Batman")
        superKahramanIsimleri.add("Superman")
        superKahramanIsimleri.add("Iron Man")
        superKahramanIsimleri.add("Aquaman")
        superKahramanIsimleri.add("Spiderman ")
/*
        val batmanBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.batman)
        val supermanBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.superman)
        val ironmanBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.ayranman)
        val aquamanBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.aquamann)
        val spidermanBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.spidermannn)
        var superKahramanGorselleri = ArrayList<Bitmap>()
        superKahramanGorselleri.add(batmanBitmap)
        superKahramanGorselleri.add(supermanBitmap)
        superKahramanGorselleri.add(ironmanBitmap)
        superKahramanGorselleri.add(aquamanBitmap)
        superKahramanGorselleri.add(spidermanBitmap)*/
        val batmanDrawableId =R.drawable.batman
        val supermanDrawableId = R.drawable.superman
        val ayranmanDrawableId = R.drawable.ayranman
        val aquamannDrawableId = R.drawable.aquamann
        val spidermanDrawableId = R.drawable.spidermannn
        var superKahramanDrawableListesi = ArrayList<Int>()
        superKahramanDrawableListesi.add(batmanDrawableId)
        superKahramanDrawableListesi.add(supermanDrawableId)
        superKahramanDrawableListesi.add(ayranmanDrawableId)
        superKahramanDrawableListesi.add(aquamannDrawableId)
        superKahramanDrawableListesi.add(spidermanDrawableId)


        //adapter
        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager
        val adapter = RecyclerAdapter(superKahramanIsimleri, superKahramanDrawableListesi)
        recyclerView.adapter = adapter
    }
}
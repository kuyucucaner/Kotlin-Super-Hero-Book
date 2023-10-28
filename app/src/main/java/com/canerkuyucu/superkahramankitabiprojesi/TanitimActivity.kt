package com.canerkuyucu.superkahramankitabiprojesi

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tanitim.*

class TanitimActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tanitim)

        val intent = intent
        val secilenKahramanIsmi = intent.getStringExtra("superKahramanIsmi")
        textView.text = secilenKahramanIsmi
        val secilenKahramaGorseli =intent.getIntExtra("superKahramanGorseli",0)
        val bitmap = BitmapFactory.decodeResource(applicationContext.resources,secilenKahramaGorseli)
        imageView.setImageBitmap(bitmap)
       /* val secilenKahraman = SingletonClass.SecilenKahraman
        val secilenGorsel = secilenKahraman.gorsel
        imageView.setImageBitmap(secilenGorsel)*/
    }
}
package com.example.lab6_2

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.ListAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var mp = MediaPlayer()
        var contacts : Array<user> = arrayOf(
            user(R.drawable.number_one,"One","01",R.raw.number_one),
            user(R.drawable.number_two,"Two","02",R.raw.number_two),
            user(R.drawable.number_three,"Three","03",R.raw.number_three),
            user(R.drawable.number_four,"Four","04",R.raw.number_four),
            user(R.drawable.number_five,"Five","05",R.raw.number_five),
            user(R.drawable.number_six,"Six","06",R.raw.number_six),
            user(R.drawable.number_seven,"Seven","07",R.raw.number_seven),
            user(R.drawable.number_eight,"Eight","08",R.raw.number_eight),
            user(R.drawable.number_nine,"Nine","09",R.raw.number_nine),
            user(R.drawable.number_ten,"Ten","10",R.raw.number_ten)
        )

        var adapter1 : Adapter = MyAdapterClass(this,R.layout.row,contacts)
        var list = findViewById<ListView>(R.id.listV)
        list.adapter = adapter1 as ListAdapter?
        list.setOnItemClickListener{ _, _, position, _ ->
            // 1
            val selectedRecipe = contacts[position]
            mp = MediaPlayer.create(this, selectedRecipe.music)
            mp.start()
        }

    }

}

data class user(val img: Int,val name : String,val msg: String,val music:Int)
package com.example.myapplication

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var imag = findViewById<ImageView>(R.id.imageView7)
        var lbl = findViewById<TextView>(R.id.textView8)
        val bundle: Bundle? = intent.extras
        val ress: Int? = bundle?.getInt("pic")
        val descr : String? = bundle?.getString("des")
        if (ress != null) {
            imag.setImageResource(ress)
            lbl.text = descr
        }
        var ratingB = findViewById<RatingBar>(R.id.ratingBar)

        ratingB.setOnRatingBarChangeListener{ratingB,f1,b->
            var intent = Intent()
            intent.putExtra("Rscore",f1.toString())
            setResult(RESULT_OK,intent)
            finish()
        }
    }

}
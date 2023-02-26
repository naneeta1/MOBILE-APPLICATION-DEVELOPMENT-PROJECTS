package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var img1 =findViewById<ImageView>(R.id.imageView)
        var img2 =findViewById<ImageView>(R.id.imageView2)
        var img3 =findViewById<ImageView>(R.id.imageView3)
        var img4 =findViewById<ImageView>(R.id.imageView4)
        var img5 =findViewById<ImageView>(R.id.imageView5)
        var img6 =findViewById<ImageView>(R.id.imageView6)

        img1.setOnClickListener(View.OnClickListener {
            var intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("pic", R.drawable.one)
            intent.putExtra("Name",R.string.joey)
            intent.putExtra("des",resources.getStringArray(R.array.friend_details)[0])
            startActivityForResult(intent,123)
        })

        img2.setOnClickListener(View.OnClickListener {
            var intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("pic", R.drawable.two)
            intent.putExtra("des",resources.getStringArray(R.array.friend_details)[1])
            startActivityForResult(intent,123)
        })

        img3.setOnClickListener(View.OnClickListener {
            var intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("pic", R.drawable.three)
            intent.putExtra("des",resources.getStringArray(R.array.friend_details)[2])
            startActivityForResult(intent,123)
        })
        img4.setOnClickListener(View.OnClickListener {
            var intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("pic", R.drawable.four)
            intent.putExtra("des",resources.getStringArray(R.array.friend_details)[3])
            startActivityForResult(intent,123)
        })
        img5.setOnClickListener(View.OnClickListener {
            var intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("pic", R.drawable.five)
            startActivity(intent)
        })
        img6.setOnClickListener(View.OnClickListener {
            var intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("pic", R.drawable.six)
            startActivity(intent)
        })




    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(data!=null)
        {
            Toast.makeText(this,"rating: "+data.getStringExtra("Rscore"),Toast.LENGTH_SHORT).show()
        }

    }

}
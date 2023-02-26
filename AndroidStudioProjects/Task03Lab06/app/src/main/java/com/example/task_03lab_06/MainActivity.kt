package com.example.task_03lab_06

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val listview : ListView = findViewById(R.id.list)
        val imageView = findViewById<ImageView>(R.id.imageView)
        val textView = findViewById<TextView>(R.id.textView)
        var list: Array<user> = arrayOf(
            user(R.drawable.clinton,"Hillary Clinton","Hillary Clinton"),
            user(R.drawable.sanders,"Bernie Senders","Bernie Senders"),
            user(R.drawable.omalley,"Martin O'Malley","Martin O'Malley"),
            user(R.drawable.chafee,"Lincoin Chafee","Lincoin Chafee"),
            user(R.drawable.trump,"Donald Trump","Donald Trump"),
            user(R.drawable.carson,"Ben Carson","Ben Carson"),
            user(R.drawable.rubio,"Marco Rubio","Marco Rubio"),
            user(R.drawable.bush,"Jeb Bush","Jeb Bush")
        )
        listview.setOnItemClickListener{parent, view, position ,id->
            val element = parent.getItemAtPosition(position)
                var elemnt = list[position]
                imageView.setImageResource(elemnt.img)
                textView.text= elemnt.desc
         
        }
    }
}
data class user(val img: Int,val name : String,val desc: String)

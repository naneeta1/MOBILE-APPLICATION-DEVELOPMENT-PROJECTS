package com.example.lab_task

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        var description = findViewById<TextView>(R.id.description)
        var lbl = findViewById<TextView>(R.id.qntlabel)
        var textF = findViewById<EditText>(R.id.quantity)
        var summ = findViewById<TextView>(R.id.summary)
        var check1 = findViewById<CheckBox>(R.id.checkBox)
        var check2 = findViewById<CheckBox>(R.id.checkBox2)
        var check3 = findViewById<CheckBox>(R.id.checkBox3)
        var img = findViewById<ImageView>(R.id.imageView3)
        val data = intent.extras
        data?.getInt("Pic")?.let { img.setImageResource(it) }

       

        var cost = data?.getString("price")
        description.text = data?.getString("des")
        //img.setImageResource(R.drawable.img)
        var one = Integer.parseInt(cost)
        var two = Integer.parseInt(textF.text.toString())
        var total =one * two
        check1.setOnClickListener(View.OnClickListener {
            if(check1.isChecked)
            {
                total +=100

            }
            summ.text = "Your Total bill is: " + total
        })
        check2.setOnClickListener(View.OnClickListener {
            var one = Integer.parseInt(cost)
            var two = Integer.parseInt(textF.text.toString())
            var total =one*two
            if(check2.isChecked)
            {
                total+= 50
            }
            summ.text = "Your Total bill is: "+ total
        })
        check3.setOnClickListener(View.OnClickListener {
            var one = Integer.parseInt(cost)
            var two = Integer.parseInt(textF.text.toString())
            var total =one*two

            if(check3.isChecked)
            {
                total += 100
            }
            summ.text = "Your Total bill is: "+ total
        })




    }


}
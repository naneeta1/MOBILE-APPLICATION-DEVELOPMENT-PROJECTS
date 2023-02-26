package com.example.autopurchase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.View
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        var lb1 = findViewById<TextView>(R.id.textView8)
        var lb2 = findViewById<TextView>(R.id.textView9)

        var data = intent.extras
        var p_car = Integer.parseInt(data?.getString("Pcar"))
        var d_pay = Integer.parseInt(data?.getString("Dpay"))
        var t_years = data?.getString("year")
        var monthly_pay = 0
        var total = 0
        var tax = (p_car * 7)/100
        var Borrow_amnt = (p_car - d_pay)
        var total_cost = Borrow_amnt+ tax
        if(t_years=="2 Years"){
            total = (total_cost*9*2)/100
            monthly_pay = (Borrow_amnt + total) / 24
        }
        else if(t_years=="3 Years"){
            total = (total_cost*9*3)/100
            monthly_pay = (Borrow_amnt + total) / 36
        }
        else{
            total = (total_cost*9*4)/100
            monthly_pay = (Borrow_amnt + total) / 48
        }
        lb1.text = "Loan terms in " + monthly_pay
        lb2.text = " Car Sticker price:   $"+ p_car +" \n You will put down: $"+d_pay+" \n Taxed amount: $"+tax+" \n Your cost "+total_cost+"\n Borrowed amount: $"+Borrow_amnt+" \n Interest amount: $ "+total

    }

    fun click(view: View){
        finish()
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        var menuInf : MenuInflater = getMenuInflater()
        menuInf.inflate(R.menu.main_menu,menu)
        return true
    }
}
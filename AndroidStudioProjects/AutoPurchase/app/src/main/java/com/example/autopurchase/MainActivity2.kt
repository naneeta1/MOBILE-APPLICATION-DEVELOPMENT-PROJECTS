package com.example.autopurchase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
/*
        var price = findViewById<EditText>(R.id.car_price)
        var dPayment = findViewById<EditText>(R.id.down_payment)
        var grp = findViewById<RadioGroup>(R.id.radioGroup)
        var loanButton = findViewById<Button>(R.id.Loan_Report)
        loanButton.setOnClickListener(View.OnClickListener {
            var intent = Intent(this,MainActivity3::class.java)
            intent.putExtra("Pcar",price.text.toString())
            intent.putExtra("Dpay",dPayment.text.toString())
            intent.putExtra("year",grp.checkedRadioButtonId.toString())
            startActivityForResult(intent,123)
        })
*/
    }

  /*  override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        var menuInf : MenuInflater= getMenuInflater()
        menuInf.inflate(R.menu.main_menu,menu)
        return true
    }*/
}
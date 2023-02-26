package com.example.yourhappyrecipe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var searchBtn : Button
    lateinit var ingredientsET: EditText
    lateinit var searchTerm: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        searchBtn = findViewById(R.id.searchButton)
        ingredientsET = findViewById(R.id.ingredientsEditText)
        searchTerm = findViewById(R.id.searchTermEditText)
        searchBtn.setOnClickListener {
            val intent = Intent(this, RecipeList::class.java)

            //Getting user input
            val ingredients = ingredientsET.text.toString().trim()
            val searchTerm = searchTermEditText.text.toString().trim()

            intent.putExtra("ingredients", ingredients)
            intent.putExtra("search", searchTerm)

            Log.d("Ingredients ===> ", ingredients)
            Log.d("SearchTerm ===> ", searchTerm)

            startActivity(intent)
        }


    }
}
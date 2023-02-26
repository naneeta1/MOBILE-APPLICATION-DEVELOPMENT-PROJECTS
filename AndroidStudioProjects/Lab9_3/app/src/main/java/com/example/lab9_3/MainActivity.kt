package com.example.lab9_3

import android.content.ContentValues
import android.database.sqlite.SQLiteDatabase
import android.os.Bundle
import android.util.Log
import android.view.*
import android.widget.*
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.MenuItemCompat


class MainActivity : AppCompatActivity() {
    lateinit var database: SQLiteDatabase
    lateinit var list: ListView
    lateinit var listarray: ArrayList<String>
    lateinit var search: MenuItem
    lateinit var searchView:SearchView
    lateinit var adapter :ArrayAdapter<String>
    lateinit var searchText:String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        database = openOrCreateDatabase("dictionary", MODE_PRIVATE, null)
        createTable()
        listarray = ArrayList()
       // val foo_array: Array<String> = getResources().getStringArray(R.array.words)
        list = findViewById(R.id.listView)
        getValues()
        adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,listarray)
        list.adapter = adapter





    }

    fun createTable(){
        var query = "CREATE TABLE IF NOT EXISTS words(word TEXT)"
        database.execSQL(query)
    }
    fun insertValue(word: String){
        var contant: ContentValues = ContentValues()
        contant.put("word", word)
        Log.d("word",word)
        database.insert("words", null, contant)
    }
    fun getValues(){
        var query = "SELECT * FROM words"
        var result = database.rawQuery(query, null)
        result.moveToFirst()
      //  Log.d("result",result.getString(0))
        do{
           listarray.add(result.getString(0).toString())
           Log.d("DEBUGGG",result.getString(0).toString())
        }while (result.moveToNext())
    }
  override fun onCreateOptionsMenu(menu: Menu): Boolean {
      val inflater = menuInflater
      inflater.inflate(R.menu.main_menu, menu)
      val searchViewItem = menu.findItem(R.id.search)
      val searchView = MenuItemCompat.getActionView(searchViewItem) as SearchView
      searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
          override fun onQueryTextSubmit(query: String?): Boolean {
              searchView.clearFocus()
                 if(listarray.contains(query)){
                    adapter.filter.filter(query);
                }else{
                    Toast.makeText(this@MainActivity, "No Match found",Toast.LENGTH_LONG).show();
                }
              return false
          }

          override fun onQueryTextChange(newText: String?): Boolean {
              adapter.filter.filter(newText)
              return false
          }
      })
      return super.onCreateOptionsMenu(menu)
  }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId==R.id.add){
            showDialog();
        }
        return true
    }

    fun showDialog() {
        val li = LayoutInflater.from(this)
        val promptsView: View = li.inflate(R.layout.dialog_signin, null)
        val alertDialogBuilder = AlertDialog.Builder(this)

        alertDialogBuilder.setView(promptsView)
        val userInput = promptsView.findViewById(R.id.editTextDialogUserInput) as EditText

        alertDialogBuilder
            .setCancelable(false)
            .setPositiveButton("Add") { dialog, id ->
                insertValue(userInput.text.toString())
            }
            .setNegativeButton(
                "Cancel"
            ) { dialog, id -> dialog.cancel() }
        val alertDialog = alertDialogBuilder.create()
        alertDialog.show()
    }
}
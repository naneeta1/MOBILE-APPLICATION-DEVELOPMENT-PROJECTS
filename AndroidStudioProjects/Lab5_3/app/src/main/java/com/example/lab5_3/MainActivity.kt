package com.example.lab5_3

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import java.io.*

class MainActivity : AppCompatActivity() {
    lateinit var StrArr : ArrayList<String>
    lateinit var item : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        StrArr = ArrayList<String>()
        var list = findViewById<ListView>(R.id.listV)
         item = findViewById<EditText>(R.id.editTextTextPersonName)
        var btn = findViewById<Button>(R.id.button)





        btn.setOnClickListener(View.OnClickListener {
            write()
            read()
            val arrayAdapter = ArrayAdapter(
                this,
                android.R.layout.simple_list_item_1,
                StrArr
            )
            list.adapter = arrayAdapter
        })

}
    fun read(){
        val bufferedReader =
            BufferedReader(FileReader(File(filesDir.toString() + File.separator + "MyFile.txt")))
        var read: String?
        val builder = StringBuilder("")

        while (bufferedReader.readLine().also { read = it } != null) {
            // builder.append(read)
            StrArr.add(read.toString())
        }
        Toast.makeText(this,"Item added",Toast.LENGTH_SHORT).show()
        bufferedReader.close()
    }

    fun write(){
        val bufferedWriter =
            BufferedWriter(FileWriter(File(filesDir.toString() + File.separator + "MyFile.txt")))
        bufferedWriter.write(item.text.toString())
        bufferedWriter.close()

    }
}
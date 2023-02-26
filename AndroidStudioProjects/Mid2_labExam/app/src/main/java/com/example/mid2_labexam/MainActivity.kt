package com.example.mid2_labexam

import android.content.Context
import android.content.Intent
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.*
import android.widget.*


class AdapterClass(context: Context, resource:Int, objects:ArrayList<out pdt> )
    : ArrayAdapter<pdt>(context,resource,objects) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var view = convertView
        if(view==null){
            view = LayoutInflater.from(context).inflate(R.layout.row,view,false)
        }

        var image = view!!.findViewById<ImageView>(R.id.imageView)
        var name = view!!.findViewById<TextView>(R.id.name1)
        var quantity = view!!.findViewById<TextView>(R.id.quantity1)
        var price = view!!.findViewById<TextView>(R.id.price1)


        val user = getItem(position)
        name.text = user!!.name
        quantity.text = user!!.quantity
        price.text = user!!.price
        image.setImageResource(user!!.img)

        return view!!
    }
}

class MainActivity : AppCompatActivity() {
    lateinit var product : ArrayList<pdt>
    lateinit var database: SQLiteDatabase
    lateinit var list:ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        database = openOrCreateDatabase("DataBase",MODE_PRIVATE,null)
        if(database!=null){
            getValus()
        }

        var btn = findViewById<Button>(R.id.add)
         list = findViewById<ListView>(R.id.list)


        btn.setOnClickListener(View.OnClickListener {
            var intent = Intent(this,MainActivity2::class.java)
            startActivity(intent);
        });

        registerForContextMenu(list);
    }
    fun getValus(){
        var query = "SELECT * FROM Product"
        var results: Cursor = database.rawQuery(query,null)
        results.moveToFirst()
        do{
            var item  = pdt(results.getInt(0),results.getString(1),results.getString(2),results.getString(3))
            product.add(item)
        }while (results.moveToNext())

        var adapter: Adapter = AdapterClass(this,R.layout.row,product)
        list.adapter = adapter as ListAdapter?
    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        var inflater = getMenuInflater()
        inflater.inflate(R.menu.main_menu,menu)
    }
}
data class pdt(val img: Int,val name : String,val price: String,val quantity:String)
package com.example.lab6_2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.lab6_2.R
import com.example.lab6_2.user

class MyAdapterClass(context: Context, resource: Int, objects: Array<out user>)
    : ArrayAdapter<user>(context, resource, objects) {
    val ref = context
    val row = resource
    val data = objects

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var view: View? = convertView

        if(view == null) {
            view = LayoutInflater.from(ref).inflate(row, parent, false)
        }
        val imageV: ImageView? = view?.findViewById(R.id.image)
        val name: TextView? = view?.findViewById(R.id.Name)
        val msg: TextView? = view?.findViewById(R.id.Msg)

        imageV?.setImageResource(data[position].img)
        name?.text = data[position].name

        msg?.text = data[position].msg
        return view!!
    }

}
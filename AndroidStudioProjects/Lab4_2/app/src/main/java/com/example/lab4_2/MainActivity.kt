package com.example.lab4_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.ImageView
import androidx.appcompat.view.ActionMode

class MainActivity : AppCompatActivity() {

    private var actionMode : ActionMode? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imgView = findViewById<ImageView>(R.id.imageView)
        imgView.setOnLongClickListener(object : View.OnLongClickListener {
            override fun onLongClick(view: View?): Boolean {
                if (actionMode != null) {
                    return false
                }
                actionMode = startSupportActionMode(actionModeCallback)
                view?.isSelected = true
                return true
            }
        })
    }
    private val actionModeCallback = object : ActionMode.Callback {
        override fun onCreateActionMode(mode: ActionMode?, menu: Menu?): Boolean {
            val inflater : MenuInflater? = mode?.menuInflater
            inflater?.inflate(R.menu.context_menu,menu)
            return true
        }

        override fun onPrepareActionMode(mode: ActionMode?, menu: Menu?): Boolean {
            return false
        }

        override fun onActionItemClicked(mode: ActionMode?, item: MenuItem?): Boolean {
            return false
        }

        override fun onDestroyActionMode(mode: ActionMode?) {
            actionMode = null
        }
    }
}
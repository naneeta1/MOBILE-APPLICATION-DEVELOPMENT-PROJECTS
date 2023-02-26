package com.example.lab9_3

import android.content.ContentResolver
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import java.util.prefs.PreferencesFactory

class MyDBHelper(context:Context,name : String?, factory: SQLiteDatabase.CursorFactory?,version:Int):
    SQLiteOpenHelper(context,name,factory,version) {



        private val myCR: ContentResolver
            init {
                myCR = context.contentResolver
            }

    override fun onCreate(p0: SQLiteDatabase?) {
        TODO("Not yet implemented")
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        TODO("Not yet implemented")
    }

}
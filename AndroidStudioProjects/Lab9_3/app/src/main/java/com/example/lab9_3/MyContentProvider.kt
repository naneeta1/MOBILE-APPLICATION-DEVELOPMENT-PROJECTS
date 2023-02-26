package com.example.lab9_3

import android.content.ContentProvider
import android.content.ContentValues
import android.content.UriMatcher
import android.database.Cursor
import android.net.Uri

class MyContentProvider: ContentProvider() {

    companion object{
        val SCHEME = "content://";
        val AUTHORITY ="com.exa"
        private val WORDS = "words"
        private val PRODUCTS = "products"
        val CONTENT_URI_WORDS = Uri.parse(SCHEME + AUTHORITY + "/"+ WORDS)

    }

    private val uri_matcher = UriMatcher(UriMatcher.NO_MATCH)
    init{
        uri_matcher.addURI(AUTHORITY, WORDS,1)
        uri_matcher.addURI(AUTHORITY, WORDS +"/#",22)

    }
    override fun onCreate(): Boolean {
        TODO("Not yet implemented")
    }

    override fun query(
        p0: Uri,
        p1: Array<out String>?,
        p2: String?,
        p3: Array<out String>?,
        p4: String?
    ): Cursor? {
        TODO("Not yet implemented")
    }

    override fun getType(p0: Uri): String? {
        TODO("Not yet implemented")
    }

    override fun insert(uri: Uri, p1: ContentValues?): Uri? {
        TODO("Not yet implemented")

    }

    override fun delete(p0: Uri, p1: String?, p2: Array<out String>?): Int {
        TODO("Not yet implemented")
    }

    override fun update(p0: Uri, p1: ContentValues?, p2: String?, p3: Array<out String>?): Int {
        TODO("Not yet implemented")
    }
}
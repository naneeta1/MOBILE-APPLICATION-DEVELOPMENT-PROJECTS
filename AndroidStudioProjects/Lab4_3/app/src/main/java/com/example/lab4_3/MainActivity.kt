package com.example.lab4_3

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.util.Log
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.EditText
import java.util.*
import kotlin.properties.Delegates

class MainActivity : AppCompatActivity() {
    var playing by Delegates.notNull<Boolean>()
    private var tts: TextToSpeech? = null
     var mp : MediaPlayer? = null
    lateinit var textF : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        playing = false
        mp = null
        textF = findViewById(R.id.speech)

        tts = TextToSpeech(this, TextToSpeech.OnInitListener { i ->
            if (i == TextToSpeech.SUCCESS) {
                val result = tts!!.setLanguage(Locale.US)
                if (result == TextToSpeech.LANG_MISSING_DATA
                    || result == TextToSpeech.LANG_NOT_SUPPORTED
                ) {
                    Log.e("TTS", "Language Not Supported")
                }
            } else {
                Log.e("TTS", "Initialization Failed")
            }
        })

    }
    fun Speaktext(){
        val text = textF.text.toString()
        tts!!.speak(text, TextToSpeech.QUEUE_ADD, null)
        tts!!.speak(text, TextToSpeech.QUEUE_ADD, null)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        var inflater = getMenuInflater()
        inflater.inflate(R.menu.main_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
             R.id.on ->{
                 playing = !playing
                 if(playing){
                     if(mp==null){
                         mp = MediaPlayer.create(this,R.raw.d11)
                         mp!!.isLooping = true
                         mp!!.start()
                     }
                     else{ mp!!.start()}
                 }
                 else{
                     if(mp!=null){
                         mp!!.stop()
                         mp!!.release()
                         mp = null
                     }
                 }
                 return true
             }
            R.id.speak ->{
                Speaktext()
                return true
            }
            else -> super.onOptionsItemSelected(item)




        }
    }



}
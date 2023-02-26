package com.example.pyaridhun


import android.annotation.SuppressLint
import android.annotation.TargetApi
import android.content.pm.PackageManager
import android.media.MediaPlayer
import android.media.MediaRecorder
import android.os.Build
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Environment
import android.view.View
import android.view.View.OnTouchListener
import android.widget.ImageButton
import android.widget.Switch
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import java.io.IOException
import kotlin.properties.Delegates


class MainActivity : AppCompatActivity() {

    lateinit var keyd1: View
    lateinit var keyd2: View
    lateinit var keyd3: View
    lateinit var keyd4: View
    lateinit var keyd5: View
    lateinit var keyd6: View
    lateinit var keyd7: View
    lateinit var keyd8: View
    lateinit var keyd9: View
    lateinit var keyd10: View
    lateinit var keyd11: View
    lateinit var keyd12: View
    lateinit var keyt1: View
    lateinit var keyt2: View
    lateinit var keyt3: View
    lateinit var keyt4: View
    lateinit var keyt5: View
    lateinit var keyt6: View
    lateinit var keyt7: View
    lateinit var keyt8: View
    lateinit var keyt9: View
    lateinit var switch:Switch
    lateinit var btnRecord:ImageButton
    lateinit var btnStop:ImageButton
    lateinit var btnPlay:ImageButton
    lateinit var btnSetting:ImageButton
    lateinit var dmp1:MediaPlayer
    lateinit var dmp2:MediaPlayer
    lateinit var dmp3:MediaPlayer
    lateinit var dmp4:MediaPlayer
    lateinit var dmp5:MediaPlayer
    lateinit var dmp6:MediaPlayer
    lateinit var dmp7:MediaPlayer
    lateinit var dmp8:MediaPlayer
    lateinit var dmp9:MediaPlayer
    lateinit var dmp10:MediaPlayer
    lateinit var dmp11:MediaPlayer
    lateinit var dmp12:MediaPlayer
    lateinit var tmp1:MediaPlayer
    lateinit var tmp2:MediaPlayer
    lateinit var tmp3:MediaPlayer
    lateinit var tmp4:MediaPlayer
    lateinit var tmp5:MediaPlayer
    lateinit var tmp6:MediaPlayer
    lateinit var tmp7:MediaPlayer
    lateinit var tmp8:MediaPlayer
    lateinit var tmp9:MediaPlayer
    lateinit var mediaRecorder: MediaRecorder
    lateinit var output: String
    var state by Delegates.notNull<Boolean>()
    var toggle by Delegates.notNull<Boolean>()
    var recordingStopped by Delegates.notNull<Boolean>()

    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        intializeKeys()
        output = Environment.getExternalStorageDirectory().absolutePath + "/recording.mp3"
        mediaRecorder = MediaRecorder()

        mediaRecorder?.setAudioSource(MediaRecorder.AudioSource.MIC)
        mediaRecorder?.setOutputFormat(MediaRecorder.OutputFormat.MPEG_4)
        mediaRecorder?.setAudioEncoder(MediaRecorder.AudioEncoder.AAC)
        mediaRecorder?.setOutputFile(output)

        btnSetting.setOnClickListener(View.OnClickListener {
            Toast.makeText(
                this@MainActivity,
                "Piano Setting",
                Toast.LENGTH_SHORT
            ).show()
        })
        btnStop.setOnClickListener(View.OnClickListener {
            Toast.makeText(this,"Recording Stopped",Toast.LENGTH_SHORT).show()
            if(toggle){
                stopRecording()
            }
        })

        btnRecord.setOnClickListener {
            if (ContextCompat.checkSelfPermission(this,
                    android.Manifest.permission.RECORD_AUDIO) != PackageManager.PERMISSION_GRANTED && ContextCompat.checkSelfPermission(this,
                    android.Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
                val permissions = arrayOf(android.Manifest.permission.RECORD_AUDIO, android.Manifest.permission.WRITE_EXTERNAL_STORAGE, android.Manifest.permission.READ_EXTERNAL_STORAGE)
                ActivityCompat.requestPermissions(this, permissions,0)
            } else {
               if(!toggle)
               {
                   startRecording()
                   toggle= true
               }
            }
        }
        btnPlay.setOnClickListener(View.OnClickListener {
            if(toggle){
                Toast.makeText(this,"Recording Paused",Toast.LENGTH_SHORT).show()
                pauseRecording()
            }


        })



        keyd1.setOnTouchListener(OnTouchListener { v, event ->
            dmp1 = MediaPlayer.create(this,R.raw.d1)
            dmp1.start()
            keyd1.setBackgroundColor(R.color.black)
            object : CountDownTimer(1 * 100, 100) {
                override fun onTick(millisUntilFinished: Long) {
                    (millisUntilFinished / 100).toString()
                }

                @SuppressLint("NewApi")
                override fun onFinish() {
                    keyd1.setBackgroundColor(getColor(R.color.white))
                }
            }.start()
            false
        })

        keyd2.setOnTouchListener(OnTouchListener { v, event ->
            dmp2 = MediaPlayer.create(this,R.raw.d2)
            dmp2.start()
            keyd2.setBackgroundColor(R.color.black)
            object : CountDownTimer(1 * 100, 100) {
                override fun onTick(millisUntilFinished: Long) {
                    (millisUntilFinished / 100).toString()
                }

                @SuppressLint("NewApi")
                override fun onFinish() {
                    keyd2.setBackgroundColor(getColor(R.color.white))
                }
            }.start()
            false
        })

        keyd3.setOnTouchListener(OnTouchListener { v, event ->
            dmp3 = MediaPlayer.create(this,R.raw.d3)
            dmp3.start()
            keyd3.setBackgroundColor(R.color.black)
            object : CountDownTimer(1 * 100, 100) {
                override fun onTick(millisUntilFinished: Long) {
                    (millisUntilFinished / 100).toString()
                }

                @SuppressLint("NewApi")
                override fun onFinish() {
                    keyd3.setBackgroundColor(getColor(R.color.white))
                }
            }.start()
            false
        })

        keyd4.setOnTouchListener(OnTouchListener { v, event ->
            dmp4.start()
            keyd4.setBackgroundColor(R.color.black)
            object : CountDownTimer(1 * 100, 100) {
                override fun onTick(millisUntilFinished: Long) {
                    (millisUntilFinished / 100).toString()
                }

                @SuppressLint("NewApi")
                override fun onFinish() {
                    keyd4.setBackgroundColor(getColor(R.color.white))
                }
            }.start()
            false
        })

        keyd5.setOnTouchListener(OnTouchListener { v, event ->
            dmp5.start()
            keyd5.setBackgroundColor(R.color.black)
            object : CountDownTimer(1 * 100, 100) {
                override fun onTick(millisUntilFinished: Long) {
                    (millisUntilFinished / 100).toString()
                }

                @SuppressLint("NewApi")
                override fun onFinish() {
                    keyd5.setBackgroundColor(getColor(R.color.white))
                }
            }.start()
            false
        })

        keyd6.setOnTouchListener(OnTouchListener { v, event ->
            dmp6.start()
            keyd6.setBackgroundColor(R.color.black)
            object : CountDownTimer(1 * 100, 100) {
                override fun onTick(millisUntilFinished: Long) {
                    (millisUntilFinished / 100).toString()
                }

                @SuppressLint("NewApi")
                override fun onFinish() {
                    keyd6.setBackgroundColor(getColor(R.color.white))
                }
            }.start()
            false
        })

        keyd7.setOnTouchListener(OnTouchListener { v, event ->
            dmp7.start()
            keyd7.setBackgroundColor(R.color.black)
            object : CountDownTimer(1 * 100, 100) {
                override fun onTick(millisUntilFinished: Long) {
                    (millisUntilFinished / 100).toString()
                }

                @SuppressLint("NewApi")
                override fun onFinish() {
                    keyd7.setBackgroundColor(getColor(R.color.white))
                }
            }.start()
            false
        })

        keyd8.setOnTouchListener(OnTouchListener { v, event ->
            dmp8.start()
            keyd8.setBackgroundColor(R.color.black)
            object : CountDownTimer(1 * 100, 100) {
                override fun onTick(millisUntilFinished: Long) {
                    (millisUntilFinished / 100).toString()
                }

                @SuppressLint("NewApi")
                override fun onFinish() {
                    keyd8.setBackgroundColor(getColor(R.color.white))
                }
            }.start()
            false
        })

        keyd9.setOnTouchListener(OnTouchListener { v, event ->
            dmp9.start()
            keyd9.setBackgroundColor(R.color.black)
            object : CountDownTimer(1 * 100, 100) {
                override fun onTick(millisUntilFinished: Long) {
                    (millisUntilFinished / 100).toString()
                }

                @SuppressLint("NewApi")
                override fun onFinish() {
                    keyd9.setBackgroundColor(getColor(R.color.white))
                }
            }.start()
            false
        })

        keyd10.setOnTouchListener(OnTouchListener { v, event ->
            dmp10.start()
            keyd10.setBackgroundColor(R.color.black)
            object : CountDownTimer(1 * 100, 100) {
                override fun onTick(millisUntilFinished: Long) {
                    (millisUntilFinished / 100).toString()
                }

                @SuppressLint("NewApi")
                override fun onFinish() {
                    keyd10.setBackgroundColor(getColor(R.color.white))
                }
            }.start()
            false
        })

        keyd11.setOnTouchListener(OnTouchListener { v, event ->
            dmp11.start()
            keyd11.setBackgroundColor(R.color.black)
            object : CountDownTimer(1 * 100, 100) {
                override fun onTick(millisUntilFinished: Long) {
                    (millisUntilFinished / 100).toString()
                }

                @SuppressLint("NewApi")
                override fun onFinish() {
                    keyd11.setBackgroundColor(getColor(R.color.white))
                }
            }.start()
            false
        })

        keyd12.setOnTouchListener(OnTouchListener { v, event ->
            dmp12.start()
            keyd12.setBackgroundColor(R.color.black)
            object : CountDownTimer(1 * 100, 100) {
                override fun onTick(millisUntilFinished: Long) {
                    (millisUntilFinished / 100).toString()
                }

                @SuppressLint("NewApi")
                override fun onFinish() {
                    keyd12.setBackgroundColor(getColor(R.color.white))
                }
            }.start()
            false
        })

        keyt1.setOnTouchListener(OnTouchListener { v, event ->
            tmp1.start()
            keyt1.setBackgroundColor(R.color.black)
            keyd1.isEnabled = false
            keyd2.isEnabled = false
            object : CountDownTimer(1 * 100, 100) {
                override fun onTick(millisUntilFinished: Long) {
                    (millisUntilFinished / 100).toString()
                }

                @SuppressLint("NewApi")
                override fun onFinish() {
                    keyt1.setBackgroundColor(getColor(R.color.black))
                    keyd1.isEnabled = true
                    keyd2.isEnabled = true
                }
            }.start()
            false
        })

        keyt2.setOnTouchListener(OnTouchListener { v, event ->
            tmp2.start()
            keyt2.setBackgroundColor(R.color.black)
            keyd3.isEnabled = false
            keyd2.isEnabled = false
            object : CountDownTimer(1 * 100, 100) {
                override fun onTick(millisUntilFinished: Long) {
                    (millisUntilFinished / 100).toString()
                }

                @SuppressLint("NewApi")
                override fun onFinish() {
                    keyt2.setBackgroundColor(getColor(R.color.black))
                    keyd3.isEnabled = true
                    keyd2.isEnabled = true
                }
            }.start()
            false
        })

        keyt3.setOnTouchListener(OnTouchListener { v, event ->
            tmp3.start()
            keyt3.setBackgroundColor(R.color.black)
            keyd3.isEnabled = false
            keyd4.isEnabled = false
            object : CountDownTimer(1 * 100, 100) {
                override fun onTick(millisUntilFinished: Long) {
                    (millisUntilFinished / 100).toString()
                }

                @SuppressLint("NewApi")
                override fun onFinish() {
                    keyt3.setBackgroundColor(getColor(R.color.black))
                    keyd3.isEnabled = true
                    keyd4.isEnabled = true
                }
            }.start()
            false
        })

        keyt4.setOnTouchListener(OnTouchListener { v, event ->
            tmp4.start()
            keyt4.setBackgroundColor(R.color.black)
            keyd5.isEnabled = false
            keyd6.isEnabled = false
            object : CountDownTimer(1 * 100, 100) {
                override fun onTick(millisUntilFinished: Long) {
                    (millisUntilFinished / 100).toString()
                }

                @SuppressLint("NewApi")
                override fun onFinish() {
                    keyt4.setBackgroundColor(getColor(R.color.black))
                    keyd5.isEnabled = true
                    keyd6.isEnabled = true
                }
            }.start()
            false
        })

        keyt5.setOnTouchListener(OnTouchListener { v, event ->
            tmp5.start()
            keyt5.setBackgroundColor(R.color.black)
            keyd7.isEnabled = false
            keyd6.isEnabled = false
            object : CountDownTimer(1 * 100, 100) {
                override fun onTick(millisUntilFinished: Long) {
                    (millisUntilFinished / 100).toString()
                }

                @SuppressLint("NewApi")
                override fun onFinish() {
                    keyt5.setBackgroundColor(getColor(R.color.black))
                    keyd7.isEnabled = true
                    keyd6.isEnabled = true
                }
            }.start()
            false
        })

        keyt6.setOnTouchListener(OnTouchListener { v, event ->
            tmp6.start()
            keyt6.setBackgroundColor(R.color.black)
            keyd8.isEnabled= false
            keyd7.isEnabled = false
            object : CountDownTimer(1 * 100, 100) {
                override fun onTick(millisUntilFinished: Long) {
                    (millisUntilFinished / 100).toString()
                }

                @SuppressLint("NewApi")
                override fun onFinish() {
                    keyt6.setBackgroundColor(getColor(R.color.black))
                    keyd8.isEnabled= true
                    keyd7.isEnabled = true
                }
            }.start()
            false
        })

        keyt7.setOnTouchListener(OnTouchListener { v, event ->
            tmp7.start()
            keyt7.setBackgroundColor(R.color.black)
            keyd10.isEnabled= false
            keyd9.isEnabled= false
            object : CountDownTimer(1 * 100, 100) {
                override fun onTick(millisUntilFinished: Long) {
                    (millisUntilFinished / 100).toString()
                }

                @SuppressLint("NewApi")
                override fun onFinish() {
                    keyt7.setBackgroundColor(getColor(R.color.black))
                    keyd10.isEnabled= true
                    keyd9.isEnabled= true
                }
            }.start()
            false
        })

        keyt8.setOnTouchListener(OnTouchListener { v, event ->
            tmp8.start()
            keyt8.setBackgroundColor(R.color.black)
            keyd11.isEnabled = false
            object : CountDownTimer(1 * 100, 100) {
                override fun onTick(millisUntilFinished: Long) {
                    (millisUntilFinished / 100).toString()
                }

                @SuppressLint("NewApi")
                override fun onFinish() {
                    keyt8.setBackgroundColor(getColor(R.color.black))
                    keyd11.isEnabled = true
                }
            }.start()
            false
        })

        keyt9.setOnTouchListener(OnTouchListener { v, event ->
            tmp9.start()
            keyt9.setBackgroundColor(R.color.black)
            keyd12.isEnabled= false
            object : CountDownTimer(1 * 100, 100) {
                override fun onTick(millisUntilFinished: Long) {
                    (millisUntilFinished / 100).toString()
                }

                @SuppressLint("NewApi")
                override fun onFinish() {
                    keyt9.setBackgroundColor(getColor(R.color.black))
                    keyd12.isEnabled= true
                }
            }.start()
            false
        })
    }

    fun startRecording() {
        try {
            mediaRecorder?.prepare()
            mediaRecorder?.start()
            state = true
            Toast.makeText(this, "Recording started!", Toast.LENGTH_SHORT).show()
        } catch (e: IllegalStateException) {
            e.printStackTrace()
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }

    fun stopRecording(){
        if(state){
            mediaRecorder?.stop()
            mediaRecorder?.release()
            state = false
        }else{
            Toast.makeText(this, "You are not recording right now!", Toast.LENGTH_SHORT).show()
        }
    }
    @SuppressLint("RestrictedApi", "SetTextI18n")
    @TargetApi(Build.VERSION_CODES.N)
    private fun resumeRecording() {
        Toast.makeText(this,"Resume!", Toast.LENGTH_SHORT).show()
        mediaRecorder?.resume()
        recordingStopped = false
    }


    @SuppressLint("RestrictedApi", "SetTextI18n")
    @TargetApi(Build.VERSION_CODES.N)
    fun pauseRecording() {
        if(state) {
            if(!recordingStopped){
                Toast.makeText(this,"Stopped!", Toast.LENGTH_SHORT).show()
                mediaRecorder?.pause()
                recordingStopped = true
            }else{
                resumeRecording()
            }
        }
    }
    fun intializeKeys(){
        keyd1 = findViewById(R.id.dkey1)
        keyd2 = findViewById(R.id.dkey2)
        keyd3 = findViewById(R.id.dkey3)
        keyd4 = findViewById(R.id.dkey4)
        keyd5 = findViewById(R.id.dkey5)
        keyd6 = findViewById(R.id.dkey6)
        keyd7 = findViewById(R.id.dkey7)
        keyd8 = findViewById(R.id.dkey8)
        keyd9 = findViewById(R.id.dkey9)
        keyd10 = findViewById(R.id.dkey10)
        keyd11 = findViewById(R.id.dkey11)
        keyd12 = findViewById(R.id.dkey12)
        keyt1 = findViewById(R.id.tkey1)
        keyt2 = findViewById(R.id.tkey2)
        keyt3 = findViewById(R.id.tkey3)
        keyt4 = findViewById(R.id.tkey4)
        keyt5 = findViewById(R.id.tkey5)
        keyt6 = findViewById(R.id.tkey6)
        keyt7 = findViewById(R.id.tkey7)
        keyt8 = findViewById(R.id.tkey8)
        keyt9 = findViewById(R.id.tkey9)

        switch = findViewById(R.id.switch1)
        btnRecord = findViewById(R.id.record)
        btnStop = findViewById(R.id.stop)
        btnPlay = findViewById(R.id.play)
        btnSetting = findViewById(R.id.setting)
        toggle = false
        recordingStopped = false

        dmp4 = MediaPlayer.create(this,R.raw.d4)
        dmp5 = MediaPlayer.create(this,R.raw.d5)
        dmp6 = MediaPlayer.create(this,R.raw.d6)
        dmp7 = MediaPlayer.create(this,R.raw.d7)
        dmp8 = MediaPlayer.create(this,R.raw.d8)
        dmp9 = MediaPlayer.create(this,R.raw.d9)
        dmp10 = MediaPlayer.create(this,R.raw.d10)
        dmp11 = MediaPlayer.create(this,R.raw.d11)
        dmp12 = MediaPlayer.create(this,R.raw.d12)
        tmp1 = MediaPlayer.create(this,R.raw.t1)
        tmp2 = MediaPlayer.create(this,R.raw.t2)
        tmp3 = MediaPlayer.create(this,R.raw.t3)
        tmp4 = MediaPlayer.create(this,R.raw.t4)
        tmp5 = MediaPlayer.create(this,R.raw.t5)
        tmp6 = MediaPlayer.create(this,R.raw.t6)
        tmp7 = MediaPlayer.create(this,R.raw.t7)
        tmp8 = MediaPlayer.create(this,R.raw.t8)
        tmp9 = MediaPlayer.create(this,R.raw.t9)


    }
}
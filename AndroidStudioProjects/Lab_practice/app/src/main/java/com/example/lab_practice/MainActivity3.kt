package com.example.lab_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity3 : AppCompatActivity() {
    var pic1: Int? = null
    var pic2: Int? = null
    var buttonRef1: Button? = null
    var buttonRef2: Button? = null
    var click = -1

    var pics= arrayOf(R.drawable.arms,R.drawable.body,R.drawable.ears)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
    }
    fun img1(view: View){
        var btn1: Button = findViewById(R.id.button2)
        btn1.setBackgroundResource(pics[0])
        btn1.isClickable = false
        click++
        if(pic1==null){
            pic1 = 1
        }else{
            pic2 = 1
        }
        if(buttonRef1 == null){
            buttonRef1 = btn1
        }else{
            buttonRef2 = btn1
        }

        if(click==1){
            if(pic1!=null && pic2!=null && pic1==pic2){
                buttonRef1?.visibility = View.INVISIBLE
                buttonRef2?.visibility = View.INVISIBLE
                click = -1
                pic1 = null
                pic2 = null
                buttonRef1 = null
                buttonRef2 = null
            }else{
                buttonRef1?.setBackgroundResource(R.color.purple_200)
                buttonRef2?.setBackgroundResource(R.color.purple_200)
                click = -1
                pic1 = null
                pic2 = null
                buttonRef2 = null
                buttonRef1 = null
            }
        }
    }
    fun img2(view: View){
        var btn2: Button = findViewById(R.id.button3)
        btn2.setBackgroundResource(pics[1])
        btn2.isClickable = false
        click++
        if(pic1==null){
            pic1 = 2
        }else{
            pic2 = 2
        }
        if(buttonRef1 == null){
            buttonRef1 = btn2
        }else{
            buttonRef2 = btn2
        }

        if(click==1){
            if(pic1!=null && pic2!=null && pic1==pic2){
                buttonRef1?.visibility = View.INVISIBLE
                buttonRef2?.visibility = View.INVISIBLE
                click = -1
                pic1 = null
                pic2 = null
                buttonRef1 = null
                buttonRef2 = null
            }else{
                buttonRef1?.setBackgroundResource(R.color.purple_200)
                buttonRef2?.setBackgroundResource(R.color.purple_200)
                click = -1
                pic1 = null
                pic2 = null
                buttonRef2 = null
                buttonRef1 = null
            }
        }
    }
    fun img3(view: View){
        var btn3: Button = findViewById(R.id.button4)
        btn3.setBackgroundResource(pics[2])
        btn3.isClickable = false
        click++
        if(pic1==null){
            pic1 = 3
        }else{
            pic2 = 3
        }
        if(buttonRef1 == null){
            buttonRef1 = btn3
        }else{
            buttonRef2 = btn3
        }

        if(click==1){
            if(pic1!=null && pic2!=null && pic1==pic2){
                buttonRef1?.visibility = View.INVISIBLE
                buttonRef2?.visibility = View.INVISIBLE
                click = -1
                pic1 = null
                pic2 = null
                buttonRef1 = null
                buttonRef2 = null
            }else{
                buttonRef1?.setBackgroundResource(R.color.purple_200)
                buttonRef2?.setBackgroundResource(R.color.purple_200)
                click = -1
                pic1 = null
                pic2 = null
                buttonRef2 = null
                buttonRef1 = null
            }
        }
    }
    fun img4(view: View){
        var btn5: Button = findViewById(R.id.button5)
        btn5.setBackgroundResource(pics[0])
        btn5.isClickable = false
        click++
        if(pic1==null){
            pic1 = 1
        }else{
            pic2 = 1
        }
        if(buttonRef1 == null){
            buttonRef1 = btn5
        }else{
            buttonRef2 = btn5
        }

        if(click==1){
            if(pic1!=null && pic2!=null && pic1==pic2){
                buttonRef1?.visibility = View.INVISIBLE
                buttonRef2?.visibility = View.INVISIBLE
                click = -1
                pic1 = null
                pic2 = null
                buttonRef1 = null
                buttonRef2 = null
            }else{
                buttonRef1?.setBackgroundResource(R.color.purple_200)
                buttonRef2?.setBackgroundResource(R.color.purple_200)
                click = -1
                pic1 = null
                pic2 = null
                buttonRef2 = null
                buttonRef1 = null
            }
        }
    }
    fun img5(view: View){
        var btn6: Button = findViewById(R.id.button6)
        btn6.setBackgroundResource(pics[1])
        btn6.isClickable = false
        click++
        if(pic1==null){
            pic1 = 2
        }else{
            pic2 = 2
        }
        if(buttonRef1 == null){
            buttonRef1 = btn6
        }else{
            buttonRef2 = btn6
        }

        if(click==1){
            if(pic1!=null && pic2!=null && pic1==pic2){
                buttonRef1?.visibility = View.INVISIBLE
                buttonRef2?.visibility = View.INVISIBLE
                click = -1
                pic1 = null
                pic2 = null
                buttonRef1 = null
                buttonRef2 = null
            }else{
                buttonRef1?.setBackgroundResource(R.color.purple_200)
                buttonRef2?.setBackgroundResource(R.color.purple_200)
                click = -1
                pic1 = null
                pic2 = null
                buttonRef2 = null
                buttonRef1 = null
            }
        }
    }
    fun img6(view: View){
        var btn7: Button = findViewById(R.id.button7)
        btn7.setBackgroundResource(pics[2])
        btn7.isClickable = false
        click++
        if(pic1==null){
            pic1 = 3
        }else{
            pic2 = 3
        }
        if(buttonRef1 == null){
            buttonRef1 = btn7
        }else{
            buttonRef2 = btn7
        }

        if(click==1){
            if(pic1!=null && pic2!=null && pic1==pic2){
                buttonRef1?.visibility = View.INVISIBLE
                buttonRef2?.visibility = View.INVISIBLE
                click = -1
                pic1 = null
                pic2 = null
                buttonRef1 = null
                buttonRef2 = null
            }else{
                buttonRef1?.setBackgroundResource(R.color.purple_200)
                buttonRef2?.setBackgroundResource(R.color.purple_200)
                click = -1
                pic1 = null
                pic2 = null
                buttonRef2 = null
                buttonRef1 = null
            }
        }
    }
}
package com.example.first_application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var btn1 = findViewById<Button>(R.id.btn1)
        var btn2 = findViewById<Button>(R.id.btn2)
        var btn3 = findViewById<Button>(R.id.btn3)
        var btn4 = findViewById<Button>(R.id.btn4)
        var btn5 = findViewById<Button>(R.id.btn5)
        var btn6 = findViewById<Button>(R.id.btn6)
        var btn7 = findViewById<Button>(R.id.btn7)
        var btn8 = findViewById<Button>(R.id.btn8)
        var btn9 = findViewById<Button>(R.id.btn9)
        var btn10 = findViewById<Button>(R.id.btn10)
        var btn11 = findViewById<Button>(R.id.btn11)
        var btn12 = findViewById<Button>(R.id.btn12)
        var btn13 = findViewById<Button>(R.id.btn13)
        var btn14 = findViewById<Button>(R.id.btn14)
        var btn15 = findViewById<Button>(R.id.btn15)
        var btn16 = findViewById<Button>(R.id.btn16)

        var pics = arrayOf(
            R.drawable.arms,
            R.drawable.body,
            R.drawable.ears,
            R.drawable.eyebrows,
            R.drawable.eyes,
            R.drawable.glasses,
            R.drawable.hat,
            R.drawable.moustache,
            R.drawable.mouth,
            R.drawable.nose,
            R.drawable.shoes,
        )
        var pic1: Int? = null
        var pic2: Int? = null
        var imgref1: Button? = null
        var imgref2: Button? = null
        var click = -1

        btn1.setOnClickListener(View.OnClickListener {
            btn1.setBackgroundResource(pics[0])
            click++
            if (pic1 == null) {
                pic1 = 0
            } else {
                pic2 = 0
            }
            if(imgref1==null){
                imgref1 = btn1
            }
            else{
                imgref2 = btn1
            }
            if(click==1){
                if(pic1!=null&&pic2!=null&&pic1==pic2)
                {
                    imgref1?.visibility=View.INVISIBLE
                    imgref2?.visibility=View.INVISIBLE
                    imgref1 = null
                    imgref2 = null
                    click=-1
                    pic1 = null
                    pic2 = null
                }else{
                    imgref1?.setBackgroundResource(R.color.purple_200)
                    imgref2?.setBackgroundResource(R.color.purple_200)
                    imgref1 = null
                    imgref2 = null
                    click=-1
                    pic1 = null
                    pic2 = null
                }
            }

        })
        btn2.setOnClickListener(View.OnClickListener {
            btn2.setBackgroundResource(pics[1])
            click++
            if (pic1 == null) {
                pic1 = 1
            } else {
                pic2 = 1
            }
            if(imgref1==null){
                imgref1 = btn2
            }
            else{
                imgref2 = btn2
            }
            if(click==1){
                if(pic1!=null&&pic2!=null&&pic1==pic2)
                {
                    imgref1?.visibility=View.INVISIBLE
                    imgref2?.visibility=View.INVISIBLE
                    imgref1 = null
                    imgref2 = null
                    click=-1
                    pic1 = null
                    pic2 = null
                }else{
                    imgref1?.setBackgroundResource(R.color.purple_200)
                    imgref2?.setBackgroundResource(R.color.purple_200)
                    imgref1 = null
                    imgref2 = null
                    click=-1
                    pic1 = null
                    pic2 = null
                }
            }
        })
        btn3.setOnClickListener(View.OnClickListener {
            btn3.setBackgroundResource(pics[2])
            click++
            if (pic1 == null) {
                pic1 = 2
            } else {
                pic2 = 2
            }
            if(imgref1==null){
                imgref1 = btn3
            }
            else{
                imgref2 = btn3
            }
            if(click==1){
                if(pic1!=null&&pic2!=null&&pic1==pic2)
                {
                    imgref1?.visibility=View.INVISIBLE
                    imgref2?.visibility=View.INVISIBLE
                    imgref1 = null
                    imgref2 = null
                    click=-1
                    pic1 = null
                    pic2 = null
                }else{
                    imgref1?.setBackgroundResource(R.color.purple_200)
                    imgref2?.setBackgroundResource(R.color.purple_200)
                    imgref1 = null
                    imgref2 = null
                    click=-1
                    pic1 = null
                    pic2 = null
                }
            }
        })
        btn4.setOnClickListener(View.OnClickListener {
            btn4.setBackgroundResource(pics[3])
            click++
            if (pic1 == null) {
                pic1 = 3
            } else {
                pic2 = 3
            }
            if(imgref1==null){
                imgref1 = btn4
            }
            else{
                imgref2 = btn4
            }
            if(click==1){
                if(pic1!=null&&pic2!=null&&pic1==pic2)
                {
                    imgref1?.visibility=View.INVISIBLE
                    imgref2?.visibility=View.INVISIBLE
                    imgref1 = null
                    imgref2 = null
                    click=-1
                    pic1 = null
                    pic2 = null
                }else{
                    imgref1?.setBackgroundResource(R.color.purple_200)
                    imgref2?.setBackgroundResource(R.color.purple_200)
                    imgref1 = null
                    imgref2 = null
                    click=-1
                    pic1 = null
                    pic2 = null
                }
            }
        })
        btn5.setOnClickListener(View.OnClickListener {
            btn5.setBackgroundResource(pics[4])
            click++
            if (pic1 == null) {
                pic1 = 4
            } else {
                pic2 = 4
            }
            if(imgref1==null){
                imgref1 = btn5
            }
            else{
                imgref2 = btn5
            }
            if(click==1){
                if(pic1!=null&&pic2!=null&&pic1==pic2)
                {
                    imgref1?.visibility=View.INVISIBLE
                    imgref2?.visibility=View.INVISIBLE
                    imgref1 = null
                    imgref2 = null
                    click=-1
                    pic1 = null
                    pic2 = null
                }else{
                    imgref1?.setBackgroundResource(R.color.purple_200)
                    imgref2?.setBackgroundResource(R.color.purple_200)
                    imgref1 = null
                    imgref2 = null
                    click=-1
                    pic1 = null
                    pic2 = null
                }
            }
        })
        btn6.setOnClickListener(View.OnClickListener {
            btn6.setBackgroundResource(pics[5])
            click++
            if (pic1 == null) {
                pic1 = 5
            } else {
                pic2 = 5
            }
            if(imgref1==null){
                imgref1 = btn6
            }
            else{
                imgref2 = btn6
            }
            if(click==1){
                if(pic1!=null&&pic2!=null&&pic1==pic2)
                {
                    imgref1?.visibility=View.INVISIBLE
                    imgref2?.visibility=View.INVISIBLE
                    imgref1 = null
                    imgref2 = null
                    click=-1
                    pic1 = null
                    pic2 = null
                }else{
                    imgref1?.setBackgroundResource(R.color.purple_200)
                    imgref2?.setBackgroundResource(R.color.purple_200)
                    imgref1 = null
                    imgref2 = null
                    click=-1
                    pic1 = null
                    pic2 = null
                }
            }
        })
        btn7.setOnClickListener(View.OnClickListener {
            btn7.setBackgroundResource(pics[6])
            click++
            if (pic1 == null) {
                pic1 = 6
            } else {
                pic2 = 6
            }
            if(imgref1==null){
                imgref1 = btn7
            }
            else{
                imgref2 = btn7
            }
            if(click==1){
                if(pic1!=null&&pic2!=null&&pic1==pic2)
                {
                    imgref1?.visibility=View.INVISIBLE
                    imgref2?.visibility=View.INVISIBLE
                    imgref1 = null
                    imgref2 = null
                    click=-1
                    pic1 = null
                    pic2 = null
                }else{
                    imgref1?.setBackgroundResource(R.color.purple_200)
                    imgref2?.setBackgroundResource(R.color.purple_200)
                    imgref1 = null
                    imgref2 = null
                    click=-1
                    pic1 = null
                    pic2 = null
                }
            }
        })
        btn8.setOnClickListener(View.OnClickListener {
            btn8.setBackgroundResource(pics[7])
            click++
            if (pic1 == null) {
                pic1 = 7
            } else {
                pic2 = 7
            }
            if(imgref1==null){
                imgref1 = btn8
            }
            else{
                imgref2 = btn8
            }
            if(click==1){
                if(pic1!=null&&pic2!=null&&pic1==pic2)
                {
                    imgref1?.visibility=View.INVISIBLE
                    imgref2?.visibility=View.INVISIBLE
                    imgref1 = null
                    imgref2 = null
                    click=-1
                    pic1 = null
                    pic2 = null
                }else{
                    imgref1?.setBackgroundResource(R.color.purple_200)
                    imgref2?.setBackgroundResource(R.color.purple_200)
                    imgref1 = null
                    imgref2 = null
                    click=-1
                    pic1 = null
                    pic2 = null
                }
            }
        })
        btn9.setOnClickListener(View.OnClickListener {
            btn9.setBackgroundResource(pics[7])
            click++
            if (pic1 == null) {
                pic1 = 7
            } else {
                pic2 = 7
            }
            if(imgref1==null){
                imgref1 = btn9
            }
            else{
                imgref2 = btn9
            }
            if(click==1){
                if(pic1!=null&&pic2!=null&&pic1==pic2)
                {
                    imgref1?.visibility=View.INVISIBLE
                    imgref2?.visibility=View.INVISIBLE
                    imgref1 = null
                    imgref2 = null
                    click=-1
                    pic1 = null
                    pic2 = null
                }else{
                    imgref1?.setBackgroundResource(R.color.purple_200)
                    imgref2?.setBackgroundResource(R.color.purple_200)
                    imgref1 = null
                    imgref2 = null
                    click=-1
                    pic1 = null
                    pic2 = null
                }
            }
        })
        btn10.setOnClickListener(View.OnClickListener {
            btn10.setBackgroundResource(pics[6])
            click++
            if (pic1 == null) {
                pic1 = 6
            } else {
                pic2 = 6
            }
            if(imgref1==null){
                imgref1 = btn10
            }
            else{
                imgref2 = btn10
            }
            if(click==1){
                if(pic1!=null&&pic2!=null&&pic1==pic2)
                {
                    imgref1?.visibility=View.INVISIBLE
                    imgref2?.visibility=View.INVISIBLE
                    imgref1 = null
                    imgref2 = null
                    click=-1
                    pic1 = null
                    pic2 = null
                }else{
                    imgref1?.setBackgroundResource(R.color.purple_200)
                    imgref2?.setBackgroundResource(R.color.purple_200)
                    imgref1 = null
                    imgref2 = null
                    click=-1
                    pic1 = null
                    pic2 = null
                }
            }
        })
        btn11.setOnClickListener(View.OnClickListener {
            btn11.setBackgroundResource(pics[5])
            click++
            if (pic1 == null) {
                pic1 = 5
            } else {
                pic2 = 5
            }
            if(imgref1==null){
                imgref1 = btn11
            }
            else{
                imgref2 = btn11
            }
            if(click==1){
                if(pic1!=null&&pic2!=null&&pic1==pic2)
                {
                    imgref1?.visibility=View.INVISIBLE
                    imgref2?.visibility=View.INVISIBLE
                    imgref1 = null
                    imgref2 = null
                    click=-1
                    pic1 = null
                    pic2 = null
                }else{
                    imgref1?.setBackgroundResource(R.color.purple_200)
                    imgref2?.setBackgroundResource(R.color.purple_200)
                    imgref1 = null
                    imgref2 = null
                    click=-1
                    pic1 = null
                    pic2 = null
                }
            }
        })
        btn12.setOnClickListener(View.OnClickListener {
            btn12.setBackgroundResource(pics[4])
            click++
            if (pic1 == null) {
                pic1 = 4
            } else {
                pic2 = 4
            }
            if(imgref1==null){
                imgref1 = btn12
            }
            else{
                imgref2 = btn12
            }
            if(click==1){
                if(pic1!=null&&pic2!=null&&pic1==pic2)
                {
                    imgref1?.visibility=View.INVISIBLE
                    imgref2?.visibility=View.INVISIBLE
                    imgref1 = null
                    imgref2 = null
                    click=-1
                    pic1 = null
                    pic2 = null
                }else{
                    imgref1?.setBackgroundResource(R.color.purple_200)
                    imgref2?.setBackgroundResource(R.color.purple_200)
                    imgref1 = null
                    imgref2 = null
                    click=-1
                    pic1 = null
                    pic2 = null
                }
            }
        })
        btn13.setOnClickListener(View.OnClickListener {
            btn13.setBackgroundResource(pics[3])
            click++
            if (pic1 == null) {
                pic1 = 3
            } else {
                pic2 = 3
            }
            if(imgref1==null){
                imgref1 = btn13
            }
            else{
                imgref2 = btn13
            }
            if(click==1){
                if(pic1!=null&&pic2!=null&&pic1==pic2)
                {
                    imgref1?.visibility=View.INVISIBLE
                    imgref2?.visibility=View.INVISIBLE
                    imgref1 = null
                    imgref2 = null
                    click=-1
                    pic1 = null
                    pic2 = null
                }else{
                    imgref1?.setBackgroundResource(R.color.purple_200)
                    imgref2?.setBackgroundResource(R.color.purple_200)
                    imgref1 = null
                    imgref2 = null
                    click=-1
                    pic1 = null
                    pic2 = null
                }
            }
        })
        btn14.setOnClickListener(View.OnClickListener {
            btn14.setBackgroundResource(pics[2])
            click++
            if (pic1 == null) {
                pic1 = 2
            } else {
                pic2 = 2
            }
            if(imgref1==null){
                imgref1 = btn14
            }
            else{
                imgref2 = btn14
            }
            if(click==1){
                if(pic1!=null&&pic2!=null&&pic1==pic2)
                {
                    imgref1?.visibility=View.INVISIBLE
                    imgref2?.visibility=View.INVISIBLE
                    imgref1 = null
                    imgref2 = null
                    click=-1
                    pic1 = null
                    pic2 = null
                }else{
                    imgref1?.setBackgroundResource(R.color.purple_200)
                    imgref2?.setBackgroundResource(R.color.purple_200)
                    imgref1 = null
                    imgref2 = null
                    click=-1
                    pic1 = null
                    pic2 = null
                }
            }
        })
        btn15.setOnClickListener(View.OnClickListener {
            btn15.setBackgroundResource(pics[1])
            click++
            if (pic1 == null) {
                pic1 = 1
            } else {
                pic2 = 1
            }
            if(imgref1==null){
                imgref1 = btn15
            }
            else{
                imgref2 = btn15
            }
            if(click==1){
                if(pic1!=null&&pic2!=null&&pic1==pic2)
                {
                    imgref1?.visibility=View.INVISIBLE
                    imgref2?.visibility=View.INVISIBLE
                    imgref1 = null
                    imgref2 = null
                    click=-1
                    pic1 = null
                    pic2 = null
                }else{
                    imgref1?.setBackgroundResource(R.color.purple_200)
                    imgref2?.setBackgroundResource(R.color.purple_200)
                    imgref1 = null
                    imgref2 = null
                    click=-1
                    pic1 = null
                    pic2 = null
                }
            }
        })
        btn16.setOnClickListener(View.OnClickListener {
            btn16.setBackgroundResource(pics[0])
            click++
            if (pic1 == null) {
                pic1 = 0
            } else {
                pic2 = 0
            }
            if(imgref1==null){
                imgref1 = btn16
            }
            else{
                imgref2 = btn16
            }
            if(click==1){
                if(pic1!=null&&pic2!=null&&pic1==pic2)
                {
                    imgref1?.visibility=View.INVISIBLE
                    imgref2?.visibility=View.INVISIBLE
                    imgref1 = null
                    imgref2 = null
                    click=-1
                    pic1 = null
                    pic2 = null
                }else{
                    imgref1?.setBackgroundResource(R.color.purple_200)
                    imgref2?.setBackgroundResource(R.color.purple_200)
                    imgref1 = null
                    imgref2 = null
                    click=-1
                    pic1 = null
                    pic2 = null
                }
            }
        })

    }
}
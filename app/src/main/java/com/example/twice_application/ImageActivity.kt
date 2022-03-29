package com.example.twice_application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class ImageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image)

        val getdata =intent.getStringExtra("data")//data라는별명의 내용 받아옴

        val memberimage = findViewById<ImageView>(R.id.memberImageArea) //

       // Toast.makeText(this,getdata,Toast.LENGTH_SHORT).show()
        if(getdata=="1"){
            memberimage.setImageResource(R.drawable.member_1) //받아온 데이터로 이미지 세팅하기
        }
        if(getdata=="2"){
            memberimage.setImageResource(R.drawable.member_2)
        }
        if(getdata=="3"){
            memberimage.setImageResource(R.drawable.member_3)
        }
        if(getdata=="4"){
            memberimage.setImageResource(R.drawable.member_4)
        }
        if(getdata=="5"){
            memberimage.setImageResource(R.drawable.member_5)
        }
        if(getdata=="6"){
            memberimage.setImageResource(R.drawable.member_6)
        }
        if(getdata=="7"){
            memberimage.setImageResource(R.drawable.member_7)
        }
        if(getdata=="8"){
            memberimage.setImageResource(R.drawable.member_8)
        }
        if(getdata=="9"){
            memberimage.setImageResource(R.drawable.member_9)
        }
    }
}
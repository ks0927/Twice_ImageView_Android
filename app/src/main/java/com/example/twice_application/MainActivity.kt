package com.example.twice_application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val image1 = findViewById<ImageView>(R.id.IV_twice1)
        val image2 = findViewById<ImageView>(R.id.IV_twice2)
        val image3 = findViewById<ImageView>(R.id.IV_twice3)
        val image4 = findViewById<ImageView>(R.id.IV_twice4)
        val image5 = findViewById<ImageView>(R.id.IV_twice5)
        val image6 = findViewById<ImageView>(R.id.IV_twice6)
        val image7 = findViewById<ImageView>(R.id.IV_twice7)
        val image8 = findViewById<ImageView>(R.id.IV_twice8)
        val image9 = findViewById<ImageView>(R.id.IV_twice9)

        image1.setOnClickListener {
            val intent = Intent(this, ImageActivity::class.java)
            intent.putExtra("data","1") //activity가 이동할때 데이터 보내기
            startActivity(intent)
        }
        image2.setOnClickListener {
            val intent = Intent(this, ImageActivity::class.java)
            intent.putExtra("data","2") //activity가 이동할때 데이터 보내기
            startActivity(intent)
        }
        image3.setOnClickListener {
            val intent = Intent(this, ImageActivity::class.java)
            intent.putExtra("data","3") //activity가 이동할때 데이터 보내기
            startActivity(intent)
        }
        image4.setOnClickListener {
            val intent = Intent(this, ImageActivity::class.java)
            intent.putExtra("data","4") //activity가 이동할때 데이터 보내기
            startActivity(intent)
        }
        image5.setOnClickListener {
            val intent = Intent(this, ImageActivity::class.java)
            intent.putExtra("data","5") //activity가 이동할때 데이터 보내기
            startActivity(intent)
        }
        image6.setOnClickListener {
            val intent = Intent(this, ImageActivity::class.java)
            intent.putExtra("data","6") //activity가 이동할때 데이터 보내기
            startActivity(intent)
        }
        image7.setOnClickListener {
            val intent = Intent(this, ImageActivity::class.java)
            intent.putExtra("data","7") //activity가 이동할때 데이터 보내기
            startActivity(intent)
        }
        image8.setOnClickListener {
            val intent = Intent(this, ImageActivity::class.java)
            intent.putExtra("data","8") //activity가 이동할때 데이터 보내기
            startActivity(intent)
        }
        image9.setOnClickListener {
            val intent = Intent(this, ImageActivity::class.java)
            intent.putExtra("data","9") //activity가 이동할때 데이터 보내기
            startActivity(intent)
        }

    }
}
package com.example.twice_application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
@Suppress("DEPRECATION")  //Suppress로 표현식에대한 진단을 억제할수도있다.
class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({//Deprecated된거 생성자로 Looper.getMainLooper()를 넣어줘서 없앨수도있고
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        },3000) //3초뒤에 넘어간다
    }
}
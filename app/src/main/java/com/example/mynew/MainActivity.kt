package com.example.mynew

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var loginBtn: Button
    lateinit var sampleBtn:Button
    lateinit var startBtn:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginBtn = findViewById(R.id.loginBtn)
        startBtn=findViewById(R.id.startBtn)
        sampleBtn=findViewById(R.id.sampleBtn)

        loginBtn.setOnClickListener {
            hideSystemUI()
        }
        startBtn.setOnClickListener {
            topics()
        }
        sampleBtn.setOnClickListener {
            sample()
        }




    }

    private fun sample() {
        val intent= Intent(this,Question::class.java)
        startActivity(intent)
    }

    private fun topics() {
        val intent= Intent(this,Category::class.java)
        startActivity(intent)
    }

    private fun hideSystemUI() {
        val intent= Intent(this,Login::class.java)
        startActivity(intent)

    }


}
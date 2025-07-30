package com.example.androidproject

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnLogin).setOnClickListener {
            startActivity(Intent(this, MapsActivity::class.java))
        }

        findViewById<Button>(R.id.btnRegister).setOnClickListener {
            startActivity(Intent(this, CameraActivity::class.java))
        }
    }
}

package com.example.appfitnnes_androidexpress

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    private lateinit var btnImc: LinearLayout;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnImc = findViewById(R.id.btn_imc);
        btnImc.setOnClickListener{
        val intent = Intent(this, ImcActivity::class.java);
            startActivity(intent);
        }
    }
}
package com.example.basicui2

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var textf : TextView = findViewById(R.id.button3)
        var bt1:Button = findViewById(R.id.button)
        var bt2:Button = findViewById(R.id.button2)
        var bt3:Button = findViewById(R.id.button4)

        bt1.setOnClickListener({textf.setTextColor(Color.parseColor("#FFFFFF"));})
        bt2.setOnClickListener({textf.setTextSize(2,10.0f)})
        bt3.setOnClickListener({textf.setBackgroundColor(Color.parseColor("#000000"));})

    }
}
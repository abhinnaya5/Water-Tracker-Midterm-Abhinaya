package com.example.watertracker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var num = 0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clickme = findViewById<Button>(R.id.button);
        val inc = findViewById<TextView>(R.id.inc);
        val dec = findViewById<TextView>(R.id.dec);

        clickme.setOnClickListener{
           num+250;
            inc.text = num.toString();
        }
        clickme.setOnClickListener{
            num-250;
            dec.text = num.toString();
        }
    }
}
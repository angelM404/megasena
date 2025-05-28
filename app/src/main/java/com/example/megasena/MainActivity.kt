package com.example.megasena

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random

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
    }

    fun sorteio1(view: View){
        val resultado1 = findViewById<TextView>(R.id.textView2)
        val resultado2 = findViewById<TextView>(R.id.textView3)
        val resultado3 = findViewById<TextView>(R.id.textView4)
        val resultado4 = findViewById<TextView>(R.id.textView5)
        val resultado5 = findViewById<TextView>(R.id.textView6)
        val resultado6 = findViewById<TextView>(R.id.textView7)
        val numero = Random.nextInt(61)
        resultado1.setText("$numero")

        val numero2 = Random.nextInt(61)
        resultado2.setText("$numero2")

        val numero3 = Random.nextInt(61)
        resultado3.setText("$numero3")

        val numero4 = Random.nextInt(61)
        resultado4.setText("$numero4")

        val numero5 = Random.nextInt(61)
        resultado5.setText("$numero5")

        val numero6 = Random.nextInt(61)
        resultado6.setText("$numero6")
    }

}
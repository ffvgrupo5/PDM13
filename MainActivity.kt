package com.example.pdm13

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {
    private lateinit var btn_fat:Button
    private lateinit var btn_quad:Button
    private lateinit var btn_vol:Button
    private lateinit var btn_sair:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_fat = findViewById(R.id.btn_fatorial)
        btn_quad = findViewById(R.id.btn_quadrado)
        btn_vol = findViewById(R.id.btn_volume)
        btn_sair = findViewById(R.id.btn_sair)

        btn_fat.setOnClickListener {
            val intent = Intent(this, FatorialAct::class.java)
            startActivity(intent)
        }

        btn_quad.setOnClickListener {
            val intent = Intent(this, QuadradoAct::class.java)
            startActivity(intent)
        }

        btn_vol.setOnClickListener {
            val intent = Intent(this, VolumeAct::class.java)
            startActivity(intent)
        }

        btn_sair.setOnClickListener {
            finish()
            exitProcess(0)
        }
    }
}
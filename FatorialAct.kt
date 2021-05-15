package com.example.pdm13

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class FatorialAct : AppCompatActivity() {
    private lateinit var txt_valor: EditText
    private lateinit var txt_result: TextView
    private lateinit var btn_calcular: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.act_fatorial)

        txt_valor = findViewById(R.id.txt_fat_valor)
        txt_result = findViewById(R.id.txt_fat_result)
        btn_calcular = findViewById(R.id.btn_fat_calc)

        btn_calcular.setOnClickListener {
            val num = txt_valor.text.toString()
        txt_result.text = "O fatorial de $num é ${fatorial(num.toInt())}"

            txt_valor.setText("")
        }
    }

    fun fatorial(A: Int): Int {
        return if (A >= 1) {
            A * fatorial(A - 1)
        } else {
            1
        }
    }
}
package com.example.pdm13

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class QuadradoAct : AppCompatActivity() {
    private lateinit var txt_valor: EditText
    private lateinit var txt_result: TextView
    private lateinit var btn_calcular: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.act_quadrado)

        txt_valor = findViewById(R.id.txt_quad_valor)
        txt_result = findViewById(R.id.txt_quad_result)
        btn_calcular = findViewById(R.id.btn_quad_calc)

        btn_calcular.setOnClickListener {
            val num = txt_valor.text.toString()
            txt_result.text = "O quadrado de $num é ${quadrado(num.toInt())}"

            txt_valor.setText("")
        }
    }

    fun quadrado(A: Int): Int {
        return Math.pow(A.toDouble(), 2.0).toInt()
    }
}
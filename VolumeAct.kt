package com.example.pdm13

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.text.DecimalFormat
import kotlin.math.pow

class VolumeAct : AppCompatActivity() {
    private lateinit var txt_altura: EditText
    private lateinit var txt_raio: EditText
    private lateinit var txt_result: TextView
    private lateinit var btn_calcular: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.act_volume)
        val df = DecimalFormat("#.00")

        txt_altura = findViewById(R.id.txt_vol_altura)
        txt_raio = findViewById(R.id.txt_vol_raio)
        txt_result = findViewById(R.id.txt_vol_result)
        btn_calcular = findViewById(R.id.btn_vol_calc)

        btn_calcular.setOnClickListener {
            val altura = txt_altura.text.toString()
            val raio = txt_raio.text.toString()
            txt_result.text = "O volume da lata é de aproximadamente " +
                    "${df.format(volume(altura.toDouble(), raio.toDouble()))} cm³"

            txt_altura.setText("")
            txt_raio.setText("")
        }
    }

    fun volume(altura: Double, raio: Double): Double {
        return 3.14159 * raio.pow(2.0) * altura
    }
}
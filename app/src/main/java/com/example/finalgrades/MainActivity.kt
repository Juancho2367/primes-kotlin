package com.example.finalgrades

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nota1 = findViewById<EditText>(R.id.nota1)
        val nota2 = findViewById<EditText>(R.id.nota2)
        val nota3 = findViewById<EditText>(R.id.nota3)
        val btnCalcular = findViewById<Button>(R.id.Calcular)
        val txtResultado = findViewById<TextView>(R.id.txtResultado)
        val btnlimpiar = findViewById<Button>(R.id.Limpiar)

        btnCalcular.setOnClickListener {

            val n1 = nota1.text.toString().toDoubleOrNull() ?: 0.0
            val n2 = nota2.text.toString().toDoubleOrNull() ?: 0.0
            val n3 = nota3.text.toString().toDoubleOrNull() ?: 0.0

            val promedio = (n1 + n2 + n3) / 3
            val mensaje = if (promedio >= 3.0) {
                "promedio: %.2f Aprobo".format(promedio)

            } else {
                "promedio: %2f Reprobo".format(promedio)
            }
            txtResultado.text = mensaje

        }

        btnlimpiar.setOnClickListener {
            nota1.text.clear()
            nota2.text.clear()
            nota3.text.clear()
            txtResultado.text = "Calcula tus otras notas"
        }

        }


    }


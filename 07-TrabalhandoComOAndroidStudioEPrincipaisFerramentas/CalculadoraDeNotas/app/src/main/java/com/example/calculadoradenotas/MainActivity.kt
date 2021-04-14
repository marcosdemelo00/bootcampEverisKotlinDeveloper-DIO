package com.example.calculadoradenotas

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btCalcular = calcular
        val resultado = resposta

        btCalcular.setOnClickListener {
            val nota1 = Integer.parseInt("0" + nota1.text.toString())  // com o "0" mesmo que o campo esteja vazio a val terá um valor
            val nota2 = Integer.parseInt("0" + nota2.text.toString())
            val media = (nota1 + nota2) / 2
            val faltas = Integer.parseInt("0" + faltas.text.toString())

            if (media > 6 && faltas <= 10){
                resultado.setText("Aluno(a) foi aprovado(a)" + "\nNota Final: " + media + "\nFaltas: " + faltas)
                resultado.setTextColor(Color.WHITE)
                resultado.setBackgroundColor(Color.GREEN)
            } else {
                resultado.setText("Aluno(a) foi reprovado(a)" + "\nNota Final: " + media + "\nFaltas: " + faltas)
                resultado.setTextColor(Color.WHITE)
                resultado.setBackgroundColor(Color.RED)
            }
        }
    }
}
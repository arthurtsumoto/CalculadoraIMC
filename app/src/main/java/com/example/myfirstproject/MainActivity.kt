package com.example.myfirstproject

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // setcontentview TEM A FUNÇÃO DE COLOCAR O LAYOUT JUNTO COM OS CÓDIGOS



        val btnCalcular: Button = findViewById (R.id.btnCalcular)
        val edtPeso: EditText = findViewById (R.id.edtMsg_Peso)
        val edtAltura: EditText = findViewById(R.id.edtMsg_Altura)

            btnCalcular.setOnClickListener  {

            val alturaStr = edtAltura.text.toString()
            val pesoStr = edtPeso.text.toString()
                if(alturaStr.isNotEmpty() && pesoStr.isNotEmpty()){

            val Altura = alturaStr.toDouble()
            val Peso = pesoStr.toDouble()


            val AlturaFinal: Double = Altura * Altura
            val Resultado: Double = Peso / AlturaFinal


            val intent = Intent(this, ResultActivity::class.java)
                .apply {
                    putExtra("EXTRA_RESULTADO", Resultado)
            }
            startActivity(intent)
                } else {
                Toast.makeText( this, "Preencher todos os campos", Toast.LENGTH_LONG).show()
                }
    }   }}
package com.example.myfirstproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        //ativar o botão para voltar: a primeira linha ativa o botão no layout e a segunda mostra.
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)


        val tvResult: TextView = findViewById(R.id.textview_result)
        val tvClassificacao: TextView = findViewById(R.id.textview_classificacao)
        val result = intent.getDoubleExtra("EXTRA_RESULTADO", 0.1 )

        tvResult.text = result.toString()


        val classificacao = if (result < 18.5){
              "Magreza"
        }else if (result  in 18.5..24.9) {
              "Peso normal"
        }else if (result in 25.0..29.9) {
              "Sobrepeso"
        }else if (result  in 30.0..39.9) {
             "Obesidade"
        }else {
              "Obesidade severa"
        }
            tvClassificacao.text = getString(R.string.message_classificação, classificacao)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        finish()
        return super.onOptionsItemSelected(item)
    }
}
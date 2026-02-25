package com.rafaelsouza.appblank

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.widget.LinearLayout
import android.util.Log


class MainActivity : AppCompatActivity() {

    private val TAG ="MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "-> onCreate chamado")
        setContentView(R.layout.activity_main)

        val tvMensagem: TextView = findViewById(R.id.tvMensagem)
        val btnMudar: Button = findViewById(R.id.btnMudar)
        Log.d(TAG, "-> Views encontradas com sucesso")

        val cores = arrayOf(
            Color.parseColor("#FFFFFF"),
            Color.parseColor("#E3F2FD"),
            Color.parseColor("#FFF9C4"),
            Color.parseColor("#F1F8E9"),
            Color.parseColor("#FCE4EC")
        )

        var indice = 0
        var cliques = 0

        btnMudar.setOnClickListener {
            Log.i(TAG,"Botão clicado!")
            cliques++
            tvMensagem.text = "Você clicou $cliques vez(es)!"

            indice = (indice + 1) % cores.size
            findViewById<LinearLayout>(R.id.main)
                .setBackgroundColor(cores[indice])
        }
    }

    override fun onStart(){
        super.onStart()
        Log.d(TAG, "-> onStart: Tela visivel")
    }

    override fun onResume(){
        super.onResume()
        Log.d(TAG, "-> onResume: App em foco")
    }

    override fun onPause(){
        super.onPause()
        Log.d(TAG, "-> onPause: Perdeu o foco")
    }
}
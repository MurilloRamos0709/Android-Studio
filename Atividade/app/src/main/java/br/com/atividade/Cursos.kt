package br.com.atividade

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Cursos : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cursos)
        var txtInscricao = findViewById<TextView>(R.id.textInscricaoFinal)

        txtInscricao.setOnClickListener {
            var inscricao = Intent(this, Inscricao::class.java)
            startActivity(inscricao)
        }

    }
}

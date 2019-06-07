package br.com.atividade

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var txtInscricao = findViewById<TextView>(R.id.txtInscricao)

        txtInscricao.setOnClickListener {
            var inscricao = Intent(this, Cursos::class.java)
            startActivity(inscricao)
        }
        }
}

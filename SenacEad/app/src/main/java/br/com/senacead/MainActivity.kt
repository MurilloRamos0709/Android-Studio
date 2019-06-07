package br.com.senacead

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var txtLink = findViewById<TextView>(R.id.txtLink);

        txtLink.setOnClickListener {
            var  curso = Intent(this,Cursos::class.java)
            startActivity(curso)
        }
    }
}

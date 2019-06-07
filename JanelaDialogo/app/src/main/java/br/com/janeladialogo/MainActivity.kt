package br.com.janeladialogo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnDialog = findViewById<Button>(R.id.btnDialogo)

        btnDialog.setOnClickListener {
            val msg = AlertDialog.Builder(this)
            msg.setTitle("Alerta de Falha")
            msg.setMessage(
                "Olá Verifique a conexão do seu carregador, pois o aparelho apresenta super aquecimento." +
                        " Isso é perigoso! 퓰"
            )
            msg.setPositiveButton("avançar") { dialog, which ->
                Toast.makeText(this, "você avançou", Toast.LENGTH_LONG).show()
            }
            msg.setNegativeButton( "Cancelar") {dialog, which ->
                Toast. makeText( this, "você clicou em cancelar", Toast.LENGTH_LONG).show()
        }
        var  dialog:AlertDialog = msg.create()
        dialog.show()
        }
    }
}

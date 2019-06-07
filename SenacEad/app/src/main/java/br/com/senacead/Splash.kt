package br.com.senacead

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class  Splash : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        /*
        O comando Handler (Manipulador de eventos) chama o método post?Delayer(post ->Enviar| Executar ; Delayed
         -> ATrasado|Atraso), ou seja, será executada uma função com um atraso que será determinado por milisegundos
         (1000->1segundo).
         Dentro da execução do postDelayer foi criada uma variável que representará a tela e foi tipada como intent
          (troca de tela)
          SeuConteúdo é pedido a tela em que você está ee tela para onde irá. Estamos usando aqui this e
          MainActivity, pois iremos sair da tela atual(splash) e vamos ao MainActivity.
          O comando startActivity faz a execução da troca de tela.
         */


        Handler().postDelayed({
            var tela = Intent(this, MainActivity::class.java)
            startActivity(tela)
        },2000)

    }
}

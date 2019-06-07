package br.com.snack

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    btnSnack.setOnClickListener {
        val snack = Snackbar.make(it, "this is a simple Snackbar", Snackbar.LENGTH_LONG)
        snack.show()
     }
    }
}s

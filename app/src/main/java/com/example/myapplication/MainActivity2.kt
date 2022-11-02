package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.EditText
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {

    private var edtsusario:EditText? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)




    }



    override fun onCreateOptionsMenu(menu:Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_bar,menu)
        return super.onCreateOptionsMenu(menu)

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean= when(item.itemId) {
        R.id.itm_buscar -> {
            Toast.makeText(this, "Entró al item buscar", Toast.LENGTH_LONG).show()
            true
        }
        R.id.itm_ayuda -> {
            Toast.makeText(this, "Entró al item ayuda", Toast.LENGTH_LONG).show()
            true
        }
        R.id.itm_borrar -> {
            Toast.makeText(this, "Entró al item borrar", Toast.LENGTH_LONG).show()
            true
        }
        R.id.itm_enviar -> {
            Toast.makeText(this, "Entró al item enviar", Toast.LENGTH_LONG).show()
            true
        }
        R.id.itm_contactar -> {
            Toast.makeText(this, "Entró al item contactar", Toast.LENGTH_LONG).show()
            true
        }

        R.id.itm_versión -> {
            val intento = Intent(this, MainActivity::class.java)
            startActivity(intento)
            true
        }



        else -> {super.onOptionsItemSelected(item)}
    }


}
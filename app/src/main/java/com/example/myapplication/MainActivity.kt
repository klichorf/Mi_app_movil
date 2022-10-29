package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var editTxtUSR:EditText?= null // declaración de variables para recibir usuario
    private var editTextPassword:EditText?= null // declaración de variables para recibir contraseña

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        editTxtUSR=findViewById(R.id.editTxtUSR) // concatenación parte grafica con lógica
        editTextPassword=findViewById(R.id.editTextPassword)
    }


    fun regist(btnnewuser: View){
        val objeto = Intent(this,Formulario::class.java)
        startActivity(objeto)
    }


    fun pantalla(btnmenu: View){
        val objeto1 = Intent(this,menu::class.java)
        startActivity(objeto1)
    }





}
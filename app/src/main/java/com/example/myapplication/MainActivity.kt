package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var editTxtUSR: EditText? = null // declaración de variables para recibir usuario
    private var editTextPassword: EditText? = null // declaración de variables para recibir contraseña

    private lateinit var binding: ActivityMainBinding
    //la utilizacion del Binding para referencias de vistas o actividades//




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)




        binding.buttonREGIST.setOnClickListener { toast() }
        binding.editTxtUSR.setOnClickListener { usuario_toast() }





        editTxtUSR = findViewById(R.id.editTxtUSR) // concatenación parte grafica con lógica
        editTextPassword = findViewById(R.id.editTextPassword)


    }



    fun regist(btnnewuser: View) {
        val objeto = Intent(this, Formulario::class.java)
        startActivity(objeto)
    }





    private fun toast() {

        Toast.makeText(this, "hello word", Toast.LENGTH_SHORT).show()
    }


    private fun usuario_toast() {

        Toast.makeText(this, "ingrese usuario", Toast.LENGTH_SHORT).show()
    }


}
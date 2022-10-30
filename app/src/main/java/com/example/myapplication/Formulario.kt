package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_formulario.*
import kotlinx.android.synthetic.main.activity_formulario.buttonREGIST
import kotlinx.android.synthetic.main.activity_main.*

class Formulario : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulario)
        btnBack.setOnClickListener { checkValue() }


//        TERMS.setOnClickListener { checkagree() }



    }

    fun checkValue(){
        if (editTxtNAMES.text.isNotEmpty() && editTxtLASTNAMES.text.isNotEmpty() && editTxtMAIL.text.isNotEmpty() && editTxtNEWPASSWORD.text.isNotEmpty()
            && editTxtCONFIRMPASSW.text.isNotEmpty()  && editTxtPHONE.text.isNotEmpty())

        // vamos a una nueva pantalla
        else{
            showErrorName()
        }
    }


    fun showErrorName(){
        Toast.makeText(this," field empty",Toast.LENGTH_SHORT).show()
    }





/*    fun checkagree(){
        if (TERMS.text.isNotEmpty() )

        // vamos a una nueva pantalla
        else{
            showErrorcheckagree()
        }
    }

    fun showErrorcheckagree(){
        Toast.makeText(this," Accept the terms and conditions",Toast.LENGTH_SHORT).show()}
*/    }























package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.reciclerview.adapter.SuperHeroAdapter


class MainActivity3 : AppCompatActivity() {

    /// val primersuperhero=SuperHero("batman","dec comincs","bruno dias","http://clipart-library.com/images/6ir5kn5KT.jpg")
/*
    val primersuperhero= listOf<SuperHero>(
        SuperHero("batman","dec comincs","bruno dias","http://clipart-library.com/images/6ir5kn5KT.jpg"),
        SuperHero("batman","dec comincs","bruno dias","http://clipart-library.com/images/rcLojEKKi.jpg"),
        SuperHero("batman","dec comincs","bruno dias","http://clipart-library.com/images/rTLojEazc.jpg"),
        SuperHero("batman","dec comincs","bruno dias","http://clipart-library.com/images/kTMKjEqjc.jpg"),
        SuperHero("batman","dec comincs","bruno dias","http://clipart-library.com/images/BiarpepAT.jpg"),
        SuperHero("batman","dec comincs","bruno dias","http://clipart-library.com/images/di9rk6kxT.jpg"),
        SuperHero("batman","dec comincs","bruno dias","http://clipart-library.com/images/kcKojE65i.jpg"),
        SuperHero("batman","dec comincs","bruno dias","http://clipart-library.com/images/8izrpXdBT.jpg"),
        SuperHero("batman","dec comincs","bruno dias","http://clipart-library.com/images/Bigrped8T.jpg"),
        SuperHero("batman","dec comincs","bruno dias","http://clipart-library.com/images/Lcd5pX7ni.jpg"),
        SuperHero("batman","dec comincs","bruno dias","http://clipart-library.com/images/pcqrkjE9i.jpg"),

    )
*/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //SuperHeroProver.superherolist// Tengo Acceso a toda la listo
        setContentView(R.layout.activity_main)
        inicireciclerview()  //12- llamamos al iniciar recicler con todos los parametros
    }

    fun inicireciclerview(){
        val recyclerview=findViewById<RecyclerView>(R.id.recyclerSuperhero)
        recyclerview.layoutManager=LinearLayoutManager(this) // codigo necesario para configurar el contenido de cada item
        recyclerview.adapter= SuperHeroAdapter(SuperHeroProver.superherolist)

    }




}
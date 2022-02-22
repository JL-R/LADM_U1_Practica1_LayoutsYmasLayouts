package mx.tecnm.tepic.ladm_u1_practica1_layoutsymaslayouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import kotlinx.android.synthetic.main.activity_main.*




class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        inicioSesion.setOnClickListener {
            llamarsegundaventana()
        }
        registrarse.setOnClickListener {
            llamarterceraventana()
        }
    }

    private fun llamarterceraventana() {
        val otraVentana = Intent(this, MainActivity2::class.java)
        startActivity(otraVentana)
    }

    private fun llamarsegundaventana() {
        val otraVentana = Intent(this, MainActivity3::class.java)
        startActivity(otraVentana)
    }

}
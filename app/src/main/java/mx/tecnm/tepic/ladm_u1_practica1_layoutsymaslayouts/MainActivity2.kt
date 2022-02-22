package mx.tecnm.tepic.ladm_u1_practica1_layoutsymaslayouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import kotlinx.android.synthetic.main.activity_main2.*


class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        regresar.setOnClickListener {
            llamarprimeractivity()
        }
    }

    private fun llamarprimeractivity() {
        val otraVentana = Intent(this, MainActivity::class.java)
        startActivity(otraVentana)
    }

}
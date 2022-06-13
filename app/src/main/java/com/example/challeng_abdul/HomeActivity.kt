package com.example.challeng_abdul
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar
import com.example.challeng_abdul.Game

class HomeActivity : AppCompatActivity() {

    lateinit var ivSingle : ImageView
    lateinit var ivcpu : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.actvity_home)

        ivSingle = findViewById(R.id.iv_single)
        ivcpu   = findViewById(R.id.iv_cpu)



        ivSingle.setOnClickListener {
            startActivity(Intent(this, Game::class.java))
        }
        ivcpu.setOnClickListener {
            startActivity(Intent(this, Game::class.java))
        }


        val layoutRoot = findViewById<ConstraintLayout>(R.id.layout_root)

        val namaUser = intent.getStringExtra("DATA_USER_NAME")




        Snackbar.make(layoutRoot, "Selamat Datang  $namaUser", Snackbar.LENGTH_LONG)
            .setAction("Tutup", ){
                    Toast.makeText(this,"Toast Dari Action",
        Toast.LENGTH_LONG).show()
            }.show()



    }
}
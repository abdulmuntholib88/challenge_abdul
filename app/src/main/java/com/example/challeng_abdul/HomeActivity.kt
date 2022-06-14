package com.example.challeng_abdul
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar
import com.example.challeng_abdul.Game

class HomeActivity : AppCompatActivity() {

    lateinit var ivSingle : ImageView
    lateinit var ivcpu : ImageView
    lateinit var tv_single : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.actvity_home)

        ivSingle = findViewById(R.id.iv_single)
        ivcpu   = findViewById(R.id.iv_cpu)
        tv_single =findViewById(R.id.tv_single)
       tv_single =findViewById(R.id.tv_cpu)


        ivSingle.setOnClickListener {
            startActivity(Intent(this, Game::class.java))
        }
        ivcpu.setOnClickListener {
            startActivity(Intent(this, Game::class.java))
        }

        val txtWelcome1 = findViewById<TextView>(R.id.tv_single)
        val txtWelcome2 = findViewById<TextView>(R.id.tv_cpu)

        val layoutRoot = findViewById<ConstraintLayout>(R.id.layout_root)

        val namaUser = intent.getStringExtra("DATA_USER_NAME")

         txtWelcome1.text= " $namaUser Vs Pemain"
         txtWelcome2.text= " $namaUser Vs Computer"


        Snackbar.make(layoutRoot, "Selamat Datang  $namaUser", Snackbar.LENGTH_LONG)
            .setAction("Tutup", ){
                    Toast.makeText(this,"Toast Dari Action",
        Toast.LENGTH_LONG).show()
            }.show()


    }
}
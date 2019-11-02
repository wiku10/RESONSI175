package com.example.responsi175

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        intent = Intent(this, Biodata::class.java)
        intent.putExtra("nama", nama.text)
        intent.putExtra("alamat", alamat.text)
        intent.putExtra("umur", usia.text)

        register.setOnClickListener{

            Toast.makeText(getApplicationContext(), "Anda Telah memasukan Data", Toast.LENGTH_LONG).show()
            intent = Intent(this, LOGIN::class.java)

            startActivity(intent)

        }






    }
}

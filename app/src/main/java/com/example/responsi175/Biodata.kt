package com.example.responsi175

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_biodata.*
class Biodata : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_biodata)

        val bundle = intent.extras
        val nama = bundle?.get("nama")
        val alamat = bundle?.get("alamat")
        val umur = bundle?.get("umur")

        NAMA.text=nama.toString()
        ALAMAT.text=alamat.toString()
        UMUR.text=umur.toString()
    }
}

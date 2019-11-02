package com.example.responsi175

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*
import android.content.Intent

class LOGIN : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        login.setOnClickListener {
            if (email.text.toString() == "wiku@gmail.com" || password.text.toString() == "1010") {
                intent = Intent(this, HOME::class.java)
            }
            else {
                Toast.makeText(getApplicationContext(), "Email anda salah", Toast.LENGTH_LONG).show()
            }
            startActivity(intent)

        }
    }
}

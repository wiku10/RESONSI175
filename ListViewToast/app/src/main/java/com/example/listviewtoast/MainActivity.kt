package com.example.listviewtoast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var listView : ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listView = findViewById(R.id.listView)
        var list = mutableListOf<Model>()

        list.add(Model("Ir. Soekarno",   "Wakil : Mohammad Hatta",   R.drawable.soekarno  ))
        list.add(Model("Soeharto",   "Wakil : Adam Malik ",   R.drawable.soeharto  ))
        list.add(Model("Bacharuddin Jusuf Habibie", "Wakil : -", R.drawable.habibi  ))
        list.add(Model("Abdurrahman Wahid",  "Wakil : Megawati Soekarnoputri",  R.drawable.wahid ))
        list.add(Model("Megawati Soekarnoputri",  "Wakil : Hamzah Haz",  R.drawable.mega  ))
        list.add(Model("Susilo Bambang yudhoyono",  "Muhammad Jusuf Kalla",  R.drawable.susilo  ))
        list.add(Model("Joko Widodo",  "Muhammad Jusuf Kalla",  R.drawable.jokowi  ))

        listView.adapter = MyListAdapter(this,R.layout.row,list)

        listView.setOnItemClickListener{parent, view, position, id ->

            if (position==0){
                Toast.makeText(this@MainActivity, "Presiden Pertama",   Toast.LENGTH_LONG).show()
            }
            if (position==1){
                Toast.makeText(this@MainActivity, "Presiden Kedua",   Toast.LENGTH_LONG).show()
            }
            if (position==2){
                Toast.makeText(this@MainActivity, "Presiden Ketiga", Toast.LENGTH_LONG).show()
            }
            if (position==3){
                Toast.makeText(this@MainActivity, "Presiden Keempat",  Toast.LENGTH_LONG).show()
            }
            if (position==4){
                Toast.makeText(this@MainActivity, "Presiden Kelima",  Toast.LENGTH_LONG).show()
            }
            if (position==5){
                Toast.makeText(this@MainActivity, "Presiden Keenam",  Toast.LENGTH_LONG).show()
            }
            if (position==6){
                Toast.makeText(this@MainActivity, "Presiden Ketujuh",  Toast.LENGTH_LONG).show()
            }
        }
    }
}

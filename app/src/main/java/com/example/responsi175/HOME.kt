package com.example.responsi175


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_main.*

class HOME : AppCompatActivity() {
    lateinit var listView : ListView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        listView = findViewById(R.id.listView)
        var list = mutableListOf<bentuk>()
        Akun.setOnClickListener {
            intent = Intent(this, Biodata::class.java)
            startActivity(intent)
        }

        list.add(bentuk("Sony Xperia5", "Sony meluncurkan Sony Xperia 5 yang performanya tidak kalah gahar", R.drawable.lima))
        list.add(bentuk("Sony Xperia1", "Sony Xperia 1 adalah HP terbaru dari vendor raksasa", R.drawable.sx))
        list.add(bentuk("Sony Xperia Plus", "HP ini mengusung layar dengan ukuran sedikit lebih besar", R.drawable.sxp))
        list.add(bentuk("Sony Xperia L3", "HP terbaru lainnya dari Sony yang mengusung layar sebesar 5.7 inci dengan resolusi yang masih HD+", R.drawable.ltri))
        list.add(bentuk("Sony Xperia XZ2", "Sony Xperia XZ2 Compact adalah HP flagship yang memiliki spesifikasi hampir mirip dengan Sony Xperia XZ2", R.drawable.xstu))
        list.add(bentuk("Sony Xperia 3", "HP ini mengusung chipset Snapdragon 845 yang menjadikan Sony Xperia XZ3 punya performa kencang", R.drawable.xztri))


        listView.adapter = ADAPTER(this,R.layout.raw,list)

        listView.setOnItemClickListener{parent, view, position, id ->


            if (position==1){
                Toast.makeText(this@HOME, "Sony Xperia5",   Toast.LENGTH_LONG).show()
            }
            if (position==2){
                Toast.makeText(this@HOME, "Sony Xperia1", Toast.LENGTH_LONG).show()
            }
            if (position==3){
                Toast.makeText(this@HOME, "Sony Xperia p",  Toast.LENGTH_LONG).show()
            }
            if (position==4){
                Toast.makeText(this@HOME, "Sony Xperia l",  Toast.LENGTH_LONG).show()
            }
            if (position==5){
                Toast.makeText(this@HOME, "XZ2",  Toast.LENGTH_LONG).show()
            }
            if (position==6){
                Toast.makeText(this@HOME, "XPERIA3",  Toast.LENGTH_LONG).show()
            }


        }
    }
}

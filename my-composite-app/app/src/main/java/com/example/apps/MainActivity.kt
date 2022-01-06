package com.example.apps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.libs.MyData

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val aaa = MyData("aaaa")
    }
}

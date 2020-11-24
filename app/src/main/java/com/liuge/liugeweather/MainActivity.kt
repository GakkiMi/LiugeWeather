package com.liuge.liugeweather

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("MainActivity", "----你好,我是dev.bro")
        Toast.makeText(this,"我是在dev分支上开发的",Toast.LENGTH_SHORT).show()
        Log.i("MainActivity", "----dev.bro新加了一行代码")

    }
}
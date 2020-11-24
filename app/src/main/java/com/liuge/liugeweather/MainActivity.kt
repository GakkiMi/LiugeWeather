package com.liuge.liugeweather

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("MainActivity", "----你好dev")
        Toast.makeText(this,"我是在新分支上开发的",Toast.LENGTH_SHORT).show()
        Log.i("MainActivity", "----哈哈哈")
        Log.i("MainActivity", "----master分支上改动了代码")

        Log.i("MainActivity", "----dev分支上改动了代码")

    }
}
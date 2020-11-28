package com.liuge.liugeweather

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("MainActivity", "--branchA--11111")
        Log.i("MainActivity", "--branchA--22222")
        Log.i("MainActivity", "--branchA--33333")
        Log.i("MainActivity", "--branchA--44444")
        Log.i("MainActivity", "--branchA--55555")
        Log.i("MainActivity", "--branchA--66666")
        Log.i("MainActivity", "--branchA--aaa")
    }
}
package com.liuge.liugeweather

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("MainActivity", "--branchA--窗前明月光")
        Log.i("MainActivity", "--branchB--疑是地上霜")
        Log.i("MainActivity", "--branchA--举头望明月")
        Log.i("MainActivity", "--branchB--低头思故乡")
        Log.i("MainActivity", "--branchA--《静夜思》")
    }
}
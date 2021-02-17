package com.liuge.liugeweather

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("MainActivity", "--branchA--axiba")
        val val_c: Int=0
//        val_c = 1
// val_c += 1 //因为c是常量，所以这句代码是会报错的
        println("val_c => $val_c")

    }


}

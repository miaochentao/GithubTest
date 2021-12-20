package com.example.githubtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        println("1234")
        super.onCreate(savedInstanceState)
        print("MainActivity abc")
        print("cbd")
        var ui = Utils()
        ui.aa()

        setContentView(R.layout.activity_main)
    }
}

package com.example.githubtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        print("MainActivity project")
        var ui = Utils()
        ui.aa()

        setContentView(R.layout.activity_main)
    }
}
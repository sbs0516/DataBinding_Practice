package com.example.databinding_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = setContentView(R.layout.activity_main)

        var model = SampleModel("Android Databinding", "간단한 예제")
    }
}

class SampleModel(val title: String, val subTitle: String)
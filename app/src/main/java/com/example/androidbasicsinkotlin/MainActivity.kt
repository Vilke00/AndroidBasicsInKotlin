package com.example.androidbasicsinkotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.androidbasicsinkotlin.adapter.WorkoutAdapter
import com.example.androidbasicsinkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerView.adapter = WorkoutAdapter(this)
    }
}
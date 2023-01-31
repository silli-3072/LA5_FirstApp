package com.haruta.harutyan.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.haruta.harutyan.firstapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).apply { setContentView(this.root) }

        binding.changeTextButton.setOnClickListener {
            binding.textView.text = "クリックされました！"
        }

    }
}
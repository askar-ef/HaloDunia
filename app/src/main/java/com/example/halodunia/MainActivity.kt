package com.example.halodunia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.halodunia.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            btnTest1.setOnClickListener{
                Toast.makeText(this@MainActivity, "bisa ga nih", Toast.LENGTH_LONG).show()
            }
            btnTest2.setOnClickListener{
                Toast.makeText(this@MainActivity, "wuih bisa nih", Toast.LENGTH_LONG).show()
            }
        }
    }
}
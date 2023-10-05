package com.sunday.myapps1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sunday.myapps1.app1balotario1.App1Activity
import com.sunday.myapps1.app2balotario1compose.QuizActivity
import com.sunday.myapps1.app3Prueba1Compose.Prueba1Activity
import com.sunday.myapps1.app4RadioButton1Compose.RadioButton1Activity
import com.sunday.myapps1.app5Dialog1Compose.Dialog1Activity
import com.sunday.myapps1.app6Navigation1Compose.Navigation1Activity
import com.sunday.myapps1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnApp1Quiz1.setOnClickListener {
            goToApp1Quiz1()
        }
        binding.btnApp2Quiz1Compose.setOnClickListener {
            goToApp2Quiz1Compose()
        }
        binding.btnApp3Prueba1Compose.setOnClickListener {
            goToApp3Prueba1Compose()
        }
        binding.btnApp4RadioButton1Compose.setOnClickListener {
            goToApp4RadioButton1Compose()
        }
        binding.btnApp5Dialog1Compose.setOnClickListener {
            goToApp5Dialog1Compose()
        }
        binding.btnApp6Navigation1Compose.setOnClickListener {
            goToApp6Navigation1Compose()
        }

    }

    private fun goToApp1Quiz1() {
        Intent(this, App1Activity::class.java)
            .also { startActivity(it) }
    }
    private fun goToApp2Quiz1Compose() {
        Intent(this, QuizActivity::class.java)
            .also { startActivity(it) }
    }
    private fun goToApp3Prueba1Compose() {
        Intent(this, Prueba1Activity::class.java)
            .also { startActivity(it) }
    }
    private fun goToApp4RadioButton1Compose() {
        Intent(this, RadioButton1Activity::class.java)
            .also { startActivity(it) }
    }
    private fun goToApp5Dialog1Compose() {
        Intent(this, Dialog1Activity::class.java)
            .also { startActivity(it) }
    }
    private fun goToApp6Navigation1Compose() {
        Intent(this, Navigation1Activity::class.java)
            .also { startActivity(it) }
    }
}
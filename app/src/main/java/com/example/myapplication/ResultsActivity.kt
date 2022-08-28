package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityResultsBinding


class ResultsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val finalScore = intent.getIntExtra("currentScore", 0 )

        if (finalScore >= 2) {
            binding.tvResult.text = "$finalScore/3"
        }


        binding.btnHome.setOnClickListener {
            val intent = Intent(this, QuestionActivity::class.java)

            startActivity(intent)
            finish()
        }

        binding.btnRetry.setOnClickListener {
            val intent = Intent(this, QuestionActivity::class.java)

            startActivity(intent)
            finish()
        }
    }
    }

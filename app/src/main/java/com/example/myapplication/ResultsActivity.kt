package com.example.myapplication

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityResultsBinding
import com.example.myapplication.models.Constants
import kotlinx.android.synthetic.main.activity_main.*


class ResultsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val finalScore = intent.getIntExtra("currentScore", 0 )
        val username = intent.getStringExtra("username")
        binding.tvResult.text = "$finalScore/5"



        binding.btnHome.setOnClickListener {
            val intent = Intent(this, QuestionActivity::class.java)
            saveLastRes(username.toString(), finalScore)
            startActivity(intent)
            finish()
        }

        binding.btnRetry.setOnClickListener {
            val intent = Intent(this, QuestionActivity::class.java)
            saveLastRes(username.toString(), finalScore)
            intent.putExtra("username", username)
            startActivity(intent)
            finish()
        }


    }
    fun saveLastRes (username: String, result: Int) {
        val sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)
        val editor = sharedPref.edit()
        editor.apply{
            putString(Constants.LAST_USER, username)
            putInt(Constants.LAST_RESULT, result)
            apply()
        }
    }
    }

package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.myapplication.databinding.ActivityQuestionBinding
import com.example.myapplication.models.Constants.getAllQuestions

class QuestionActivity : AppCompatActivity() {

    // define the binding view
    private lateinit var binding: ActivityQuestionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)

        // inflates the activities binding into our content
        binding = ActivityQuestionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val username = intent.getStringExtra("Username")

        // call for qll my questions
        val questions = getAllQuestions()


        Log.i("Question count: ", "${ questions.size }")

        // updating view values
        binding.tvGreeting.text = "Welcome $username!, Choose a category"

        binding.materialCardView.setOnClickListener{
            val intent = Intent(this, SportsActivity:: class.java )


            startActivity(intent)
            finish()
        }
    }
}
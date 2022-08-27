package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.myapplication.databinding.ActivitySportsBinding
import com.example.myapplication.databinding.ActivityTvBinding
import com.example.myapplication.models.Constants
import com.example.myapplication.models.Question

class TvActivity : AppCompatActivity() {

    private lateinit var binding:ActivityTvBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tv)

        binding = ActivityTvBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val questions = Constants.getTvQuestions()

        // getting the current question

        var questionNumber = intent.getIntExtra("questionNumber", 0)


        val currentQuestion = questions[questionNumber]


        updateUI(currentQuestion)


        // handle next question
        binding.btnNext2.setOnClickListener {
            // capturing the answered text


            // check
            if (questionNumber + 1 == questions.count() ) {
                // todo navigate to results
                val intent = Intent(this, ResultsActivity::class.java)
                Log.i("Add last question", "Yes!");
                startActivity(intent)
                finish()

            } else {
                // nav to next q
                val intent = Intent(this, TvActivity:: class.java)

                // pass username and next question
                intent.putExtra("questionNumber", questionNumber + 1)


                Log.i("next question", "Yes!");
                startActivity(intent)
                finish()
            }

            Log.i("on click completed", "Yes!");


        }

    }
    fun updateUI(currentQuestion: Question) {
        if (currentQuestion.id === 1) {
            binding.tvQuestion.text = "Question 1: ${currentQuestion.questionText}"
        } else {
            binding.tvQuestion.text = "Your next question is: ${currentQuestion.questionText}"
        }

        binding.rbFirstAnswer.text = currentQuestion.optionOne
        binding.rbSecondAnswer.text = currentQuestion.optionTwo
        binding.rbThirdAnswer.text = currentQuestion.optionThree
    }
}
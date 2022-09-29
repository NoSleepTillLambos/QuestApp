package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.RadioButton
import android.widget.Toast
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

        var currentScore = intent.getIntExtra("currentScore", 0)
        val currentQuestion = questions[questionNumber]


        updateUI(currentQuestion)


        // handle next question
        binding.btnNext2.setOnClickListener {
            // capturing the answered text

            var selectedAnswer = binding.rgTvAnswer.checkedRadioButtonId

            if (selectedAnswer == -1 ) { // user has not selected a value

                val toast = Toast.makeText(this, "Please choose an answer", Toast.LENGTH_SHORT)
                toast.show()
            } else { // user has selected the answer
                var userAnswer = findViewById<RadioButton>(selectedAnswer)

                if(userAnswer.text.toString() == currentQuestion.optionOne) {
                    currentScore += 1
                }
                // check
                if (questionNumber + 1 == questions.count()) {
                    
                    val intent = Intent(this, ResultsActivity::class.java)
                    intent.putExtra("currentScore", currentScore)
                    startActivity(intent)
                    finish()

                } else {
                    // nav to next q
                    val intent = Intent(this, TvActivity::class.java)

                    // pass username and next question
                    intent.putExtra("questionNumber", questionNumber + 1)

                    // passing the score to next question
                    intent.putExtra("currentScore", currentScore)

                    startActivity(intent)
                    finish()
                }
            }
        }

    }
    private fun updateUI(currentQuestion: Question) {
        if (currentQuestion.id === 1) {
            binding.tvQuestion.text = "Question 1: ${currentQuestion.questionText}"
        } else {
            binding.tvQuestion.text = "Your next question is: ${currentQuestion.questionText}"
        }

        binding.rbFirstAnswer.text = currentQuestion.optionOne
        binding.rbSecondAnswer.text = currentQuestion.optionTwo
        binding.rbThirdAnswer.text = currentQuestion.optionThree

        // updating the progress bar
        binding.progressLine.progress = currentQuestion.id

        binding.progressText.text = currentQuestion.id.toString() + "/5"
    }
}
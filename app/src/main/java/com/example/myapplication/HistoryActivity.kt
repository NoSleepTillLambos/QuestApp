package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.Toast
import com.example.myapplication.models.Constants
import com.example.myapplication.databinding.ActivityHistoryBinding
import com.example.myapplication.models.Question


class HistoryActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHistoryBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHistoryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val questions = Constants.getHistoryQuestions()
        var questionNumber = intent.getIntExtra("questionNumber", 0)
        val username = intent.getStringExtra("username").toString()
        var currentScore = intent.getIntExtra("currentScore", 0)
        val currentQuestion = questions[questionNumber]


        updateUI(currentQuestion)


        // handle next question
        binding.btnNext1.setOnClickListener {
            // capturing the answered text
            var selectedAnswer = binding.rgAnswer.checkedRadioButtonId

            if (selectedAnswer == -1 ) { // user has not selected a value

                val toast = Toast.makeText(this, "Please choose an answer", Toast.LENGTH_SHORT)
                toast.show()
            } else { // user has selected the answer
                var userAnswer = findViewById<RadioButton>(selectedAnswer)

                if(userAnswer.text.toString() == currentQuestion.optionOne) {
                    currentScore += 1
                }
                if (questionNumber + 1 == questions.count() ) {

                    val intent = Intent(this, ResultsActivity::class.java)

                    intent.putExtra("currentScore", currentScore)

                    startActivity(intent)
                    finish()

                } else {
                    // nav to next q
                    val intent = Intent(this, SportsActivity:: class.java)

                    // pass username and next question
                    intent.putExtra("questionNumber", questionNumber + 1)
                    intent.putExtra("username", username)
                    // passing score to next question
                    intent.putExtra("currentScore", currentScore)

                    startActivity(intent)
                    finish()
                }
            }




        }


    }
    private fun updateUI(currentQuestion: Question) {
        if (currentQuestion.id === 1) {
            binding.historyQuestion.text = "Question 1: ${currentQuestion.questionText}"
        } else {
            binding.historyQuestion.text = "Your next question is: ${currentQuestion.questionText}"
        }

        binding.rbHistoryOne.text = currentQuestion.optionOne
        binding.rbHistoryTwo.text = currentQuestion.optionTwo
        binding.rbHistoryThree.text = currentQuestion.optionThree

        // updating the progress bar
        binding.progressLine.progress = currentQuestion.id
        binding.progressText.text = currentQuestion.id.toString() + "/5"
    }
}
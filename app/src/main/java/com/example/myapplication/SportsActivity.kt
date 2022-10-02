package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.RadioButton
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import com.example.myapplication.databinding.ActivitySportsBinding
import com.example.myapplication.models.Constants.getAllQuestions
import com.example.myapplication.models.Question

class SportsActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySportsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sports)

        binding = ActivitySportsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val questions = getAllQuestions()

        // getting the current question

        var questionNumber = intent.getIntExtra("questionNumber", 0)

        // get current score from previous question
        var currentScore = intent.getIntExtra("currentScore", 0)

        val currentQuestion = questions[questionNumber]


        updateUI(currentQuestion)


        // handle next question
        binding.btnNext.setOnClickListener {
            // capturing the answered text
            var selectedAnswer = binding.rgAnswers.checkedRadioButtonId

            if (selectedAnswer == -1 ) { // user has not selected a value

                val toast = Toast.makeText(this, "Please choose an answer", LENGTH_SHORT)
                toast.show()
            } else { // user has selected the answer
                var userAnswer = findViewById<RadioButton>(selectedAnswer)

                // check correct answer
                if (userAnswer.text.toString() == currentQuestion.optionOne) {
                    currentScore += 1
                }
                // check
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

                    // pass score to next Q
                    intent.putExtra("currentScore", currentScore)

                    startActivity(intent)
                    finish()
                }
            }



            Log.i("on click completed", "Yes!")


        }
    }

    private fun updateUI(currentQuestion: Question) {
        if (currentQuestion.id == 1) {
            binding.tvQuestion.text = "Question 1: ${currentQuestion.questionText}"
        } else {
            binding.tvQuestion.text = "Your next question is: ${currentQuestion.questionText}"
        }

        binding.rbAnswerOne.text = currentQuestion.optionOne
        binding.rbAnswerTwo.text = currentQuestion.optionTwo
        binding.rbAnswerThree.text = currentQuestion.optionThree


        // updating the progress bar
        binding.progressLine.progress = currentQuestion.id
        binding.progressText.text = currentQuestion.id.toString() + "/5"

    }


}
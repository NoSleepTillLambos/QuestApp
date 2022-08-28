package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.RadioButton
import android.widget.Toast
import com.example.myapplication.databinding.ActivityHistoryBinding
import com.example.myapplication.models.Constants.getHistoryQuestions
import com.example.myapplication.models.Question


class HistoryActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHistoryBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history)

        binding = ActivityHistoryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val questions = getHistoryQuestions()

        var questionNumber = intent.getIntExtra("questionNumber", 0)


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

                if (questionNumber + 1 == questions.count() ) {
                    // todo navigate to results
                    val intent = Intent(this, ResultsActivity::class.java)
                    Log.i("Add last question", "Yes!");
                    startActivity(intent)
                    finish()

                } else {
                    // nav to next q
                    val intent = Intent(this, SportsActivity:: class.java)

                    // pass username and next question
                    intent.putExtra("questionNumber", questionNumber + 1)


                    Log.i("next question", "Yes!");
                    startActivity(intent)
                    finish()
                }
            }




        }


    }
    fun updateUI(currentQuestion: Question) {
        if (currentQuestion.id === 1) {
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
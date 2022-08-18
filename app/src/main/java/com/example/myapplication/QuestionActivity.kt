package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.myapplication.models.Constants.getAllQuestions

class QuestionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)

        // call for qll my questions
        var questions = getAllQuestions()
        Log.i("Question count: ", "${ questions.size }")
    }
}
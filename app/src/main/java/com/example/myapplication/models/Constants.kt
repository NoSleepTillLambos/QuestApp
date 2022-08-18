package com.example.myapplication.models

import com.example.myapplication.R

object Constants {

    // function returns all required questions
    fun getAllQuestions() : ArrayList<Question> {
        // create empty array list
        var allQuestions = ArrayList<Question>()

        // todo: Create data
        val que1 = Question(
            1,
            "Who was the first president of america",
            R.drawable.ic_help,
            "Kennedy",
            "Washington"

        )

        val que2 = Question (
            2,
            "Who discovered America?",
            R.drawable.download,
            "Trump",
            "Christopher Columbus"
        )


        // adding questions to array
        allQuestions.add(que1)

        // return data
        return allQuestions



    }
}
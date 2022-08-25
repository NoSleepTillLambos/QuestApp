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
            "Who won the 1968 soccer world cup",
            R.drawable.ic_help,
            "Germany",
            "South Africa",
            "Zimbabwe"
        )

        val que2 = Question (
            2,
            "Which football club is the wealthiest in the world",
            R.drawable.download,
            "Newcastle",
            "Manchester United",
            "Fulham"
        )

        val que3 = Question (
            2,
            "Who has the most Champions league titles",
            R.drawable.download,
            "Liverpool",
            "Crystal Palace",
            "Real Madrid"

        )

//        val que3 = Question (
//            2,
//            "Who has the most Champions league titles",
//            R.drawable.download,
//            "Liverpool",
//            "Crystal Palace",
//            "Real Madrid"
//
//        )

//        val que3 = Question (
//            2,
//            "Who has the most Champions league titles",
//            R.drawable.download,
//            "Liverpool",
//            "Crystal Palace",
//            "Real Madrid"
//
//        )

        // adding questions to array
        allQuestions.add(que1)
        allQuestions.add(que2)
        allQuestions.add(que3)

        // return data
        return allQuestions



    }
}
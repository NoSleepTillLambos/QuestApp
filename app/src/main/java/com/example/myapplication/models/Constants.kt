package com.example.myapplication.models

import com.example.myapplication.R

object Constants {

    // function returns all required questions
    fun getAllQuestions(): ArrayList<Question> {
        // create empty array list
        val allQuestions = ArrayList<Question>()

        // todo: Create data
        val que1 = Question(
            1,
            "Who won the 1968 soccer world cup",
            R.drawable.ic_help,
            "Germany",
            "South Africa",
            "Zimbabwe"
        )

        val que2 = Question(
            2,
            "Which football club is the wealthiest in the world",
            R.drawable.download,
            "Newcastle",
            "Manchester United",
            "Fulham"
        )

        val que3 = Question(
            2,
            "Who has the most Champions league titles",
            R.drawable.download,
            "Liverpool",
            "Crystal Palace",
            "Real Madrid"

        )

//        val que4 = Question (
//            2,
//            "Which club does Mohammed Salah play for",
//            R.drawable.download,
//            "Liverpool",
//            "Manchester city",
//            "Sporting Lisbon"
//
//        )

//        val que5 = Question (
//            2,
//            "Who is the manager of Manchester city",
//            R.drawable.download,
//            "Sir Alex Ferguson",
//            "Patrice Evra",
//            "Pep Guardiola"
//
//        )

        // adding questions to array
        allQuestions.add(que1)
        allQuestions.add(que2)
        allQuestions.add(que3)

        // return data
        return allQuestions


    }


    fun getHistoryQuestions(): ArrayList<Question> {
        // function returns all required questions

        // create empty array list
        var historyQuestions = ArrayList<Question>()

        // todo: Create data
        val historyQue1 = Question(
            1,
            "What year did the second world war end",
            R.drawable.ic_help,
            "1988",
            "1945",
            "2021"
        )

        val historyQue2 = Question(
            2,
            "Who assassinated John F kennedy",
            R.drawable.download,
            "Lee Harvey Oswald",
            "Peter Pan",
            "Fulham"
        )

        val historyQue3 = Question(
            2,
            "Who was America's first president",
            R.drawable.download,
            "Liverpool",
            "Crystal Palace",
            "Real Madrid"

        )

//        val historyQue4 = Question (
//            2,
//            "Which club does Mohammed Salah play for",
//            R.drawable.download,
//            "Liverpool",
//            "Manchester city",
//            "Sporting Lisbon"
//
//        )

//        val historyQue5 = Question (
//            2,
//            "Who is the manager of Manchester city",
//            R.drawable.download,
//            "Sir Alex Ferguson",
//            "Patrice Evra",
//            "Pep Guardiola"
//
//        )

        // adding questions to array
        historyQuestions.add(historyQue1)
        historyQuestions.add(historyQue2)
        historyQuestions.add(historyQue3)

        // return data
        return historyQuestions

    }
        fun getTvQuestions(): ArrayList<Question> {
            // function returns all required questions

            // create empty array list
            var tvQuestions = ArrayList<Question>()

            // todo: Create data
            val tvQue1 = Question(
                1,
                "What is Jim's surname",
                R.drawable.ic_help,
                "1988",
                "1945",
                "2021"
            )

            val tvQue2 = Question(
                2,
                "What does Michael Scott eat for lunch that makes him fall asleep?",
                R.drawable.download,
                "A Chicken Pie",
                "Noodles",
                "Cake"
            )

            val tvQue3 = Question(
                2,
                "What is Homer Simpsons sons name",
                R.drawable.download,
                "Bart",
                "Kate",
                "Peter"

            )

//        val tvQue4 = Question (
//            2,
//            "Which club does Mohammed Salah play for",
//            R.drawable.download,
//            "Liverpool",
//            "Manchester city",
//            "Sporting Lisbon"
//
//        )

//        val tvQue5 = Question (
//            2,
//            "Who is the manager of Manchester city",
//            R.drawable.download,
//            "Sir Alex Ferguson",
//            "Patrice Evra",
//            "Pep Guardiola"
//
//        )

            // adding questions to array
            tvQuestions.add(tvQue1)
            tvQuestions.add(tvQue2)
            tvQuestions.add(tvQue3)

            // return data
            return tvQuestions
        }
    }

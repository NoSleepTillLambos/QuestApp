package com.example.myapplication.models

import com.example.myapplication.R

object Constants {

    val USER_NAME: String = "username"
    val LAST_USER: String = "lastUser"
    val LAST_RESULT: String = "lastResult"


    // function returns all required questions
    fun getAllQuestions(): ArrayList<Question> {
        // create empty array list
        val allQuestions = ArrayList<Question>()

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
            3,
            "Who has the most Champions league titles",
            R.drawable.download,
            "Liverpool",
            "Crystal Palace",
            "Real Madrid"

        )

        val que4 = Question (
            4,
            "Which club does Mohammed Salah play for",
            R.drawable.download,
            "Liverpool",
            "Manchester city",
            "Sporting Lisbon"

        )

        val que5 = Question (
            5,
            "Who is the manager of Manchester city",
            R.drawable.download,
            "Sir Alex Ferguson",
            "Patrice Evra",
            "Pep Guardiola"

        )

        // adding questions to array
        allQuestions.add(que1)
        allQuestions.add(que2)
        allQuestions.add(que3)
        allQuestions.add(que4)
        allQuestions.add(que5)

        // return data
        return allQuestions


    }


    fun getHistoryQuestions(): ArrayList<Question> {
        // function returns all required questions

        // create empty array list
        var historyQuestions = ArrayList<Question>()

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
            "John Wilkes Booth"
        )

        val historyQue3 = Question(
            3,
            "Who was America's first president",
            R.drawable.download,
            "Abraham Lincoln",
            "George Washington",
            "John F Kennedy"

        )

        val historyQue4 = Question (
            4,
            "When was the first iPhone released",
            R.drawable.download,
            "2007",
            "2022",
            "1999"

        )

        val historyQue5 = Question (
            5,
            "Which country did America buy Alaska from",
            R.drawable.download,
            "Russia",
            "China",
            "South Africa"

        )

        // adding questions to array
        historyQuestions.add(historyQue1)
        historyQuestions.add(historyQue2)
        historyQuestions.add(historyQue3)
        historyQuestions.add(historyQue4)
        historyQuestions.add(historyQue5)
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
                "Halpert",
                "Beesly",
                "Scott"
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
                3,
                "What is Homer Simpsons sons name",
                R.drawable.download,
                "Bart",
                "Kate",
                "Peter"

            )

            val tvQue4 = Question (
            4,
            "Which state does South Park take place in",
            R.drawable.download,
            "Colorado",
            "California",
            "Texas"

        )

            val tvQue5 = Question (
            5,
            "Who played Benjamin Gates in the movie National Treasure",
            R.drawable.download,
            "Nicholas Cage",
            "Steve Carell",
            "Donald Trump"

        )

            // adding questions to array
            tvQuestions.add(tvQue1)
            tvQuestions.add(tvQue2)
            tvQuestions.add(tvQue3)
            tvQuestions.add(tvQue4)
            tvQuestions.add(tvQue5)

            // return data
            return tvQuestions
        }
    }

package com.example.myapplication.models

data class Question (
    val id: Int,
    val questionText: String,
    val icon: Int,
    val optionOne: String,
    val optionTwo: String
    // val answer: Int
    )
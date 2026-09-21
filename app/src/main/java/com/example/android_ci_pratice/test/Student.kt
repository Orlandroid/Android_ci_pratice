package com.example.android_ci_pratice.test

class Student(
    val id: Int,
    val myName: String,
    val myEmail: String,
    val age: Int
) {
    fun getName(): String = myName

    fun getEmail(): String = myEmail

    fun isAdult(): Boolean = age >= 18
}
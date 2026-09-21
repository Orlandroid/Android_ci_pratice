package com.example.android_ci_pratice.test


import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class StudentTest {

    private val student = Student(1, "John", "john@mail.com", 20)


    @Test
    fun `get name returns correct name`() {
        assertEquals("John", student.getName())
    }

    @Test
    fun `get email returns correct email`() {
        assertEquals("john@mail.com", student.getEmail())
    }

    @Test
    fun `student is adult`() {
        assertTrue(student.isAdult())
    }


    @Test
    fun `get name fails`() {
        assertEquals("JohnFail", student.getName())
    }

    @Test
    fun `get email fails`() {
        assertEquals("john@mail.com", student.getEmail())
    }
}
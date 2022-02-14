package com.example.testjunit

import org.junit.Assert
import org.junit.Assert.*
import org.junit.Test

class FizzBuzzTest {
    private val fizzBuzz = FizzBuzzClass()
    @Test
    fun test1(){
        val answer = fizzBuzz.FizzBuzz(1)
        Assert.assertEquals(answer,"1")
    }
    @Test
    fun test2(){
        val answer = fizzBuzz.FizzBuzz(3)
        Assert.assertEquals(answer,"Fizz")
    }
    @Test
    fun testBuzz(){
        val answer = fizzBuzz.FizzBuzz(5)
        Assert.assertEquals(answer,"Buzz")
    }
}
package com.example.testjunit

class FizzBuzzClass {
    fun FizzBuzz(n: Int): String {
        //ただ数字をStringで返すだけ
        if (n % 3 == 0) {
            return "Fizz"
        }
        return n.toString()
    }
}
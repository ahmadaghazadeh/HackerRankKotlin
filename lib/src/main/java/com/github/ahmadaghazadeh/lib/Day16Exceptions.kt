package com.github.ahmadaghazadeh.lib

import java.lang.Exception

// Solution 1 :
// To find max and mix number in array and Abs(max-min)

// Solution 2 :
// Sort the array then last element - first element
fun main() {
    callDay16();
}
fun callDay16(){
    checkNumber("123")
    checkNumber("ABC")
}
fun checkNumber(s:String){
    try {
        val x=s.toInt()
        println(x)
    }catch (ex:Exception){
        println("Bad String")
    }
}




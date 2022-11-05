package com.github.ahmadaghazadeh.lib

import java.lang.Exception

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




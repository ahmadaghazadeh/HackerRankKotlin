package com.github.ahmadaghazadeh.lib

import java.lang.Exception


fun main() {
    callDay17();
}
fun callDay17(){
    val inputs = arrayOf(
        arrayOf(3, 5),
        arrayOf(3, 4),
        arrayOf(-1, -2),
        arrayOf(-1, 3),
    )
    val calculator=Calculator()
    for (i in inputs.indices){
        try {
            println(calculator.power(inputs[i][0],inputs[i][1]))
        }catch (ex:Exception){
            println(ex.message)
        }
    }

}
class Calculator{
    fun power(n:Int,p:Int):Int{
        if(n<0 || p<0){
            throw Exception("n and p should be non-negative.")
        }
        var result=1;
        for(i in 0 until p){
            result *= n;
        }
        return result;
    }
}




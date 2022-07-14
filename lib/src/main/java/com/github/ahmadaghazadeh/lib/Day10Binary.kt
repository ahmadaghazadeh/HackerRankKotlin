package com.github.ahmadaghazadeh.lib

import kotlin.math.pow

fun main() {
    val number=maxConsecutiveOneBinary(5)
    println(number)
}

fun maxConsecutiveOneBinary(inputNumber : Int): Int {
    var decimalNumber=inputNumber
    var binaryNumber = 0
    var count = 0
    var oneCounter=0
    var maxConsecutiveOne=0
    while (decimalNumber != 0) {
        val remain = decimalNumber % 2
        if(remain==1){
            oneCounter++
        }else{
            oneCounter=0
        }
        if(oneCounter>maxConsecutiveOne){
            maxConsecutiveOne=oneCounter
        }
        val c = 10.toDouble().pow(count)
        binaryNumber += (remain * c).toInt()

        decimalNumber /= 2
        count++
    }
    return maxConsecutiveOne
}
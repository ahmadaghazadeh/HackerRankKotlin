package com.github.ahmadaghazadeh.lib


fun main() {
    //val n = readLine()!!.trim().toInt()

    //val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val inputString= "1 4 3 2"
    val arr = inputString.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    callDay07(arr)
}

fun callDay07(arr: Array<Int>) {
    arr.reverse()
    for (item in arr){
        print("$item ")
    }
}




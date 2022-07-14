package com.github.ahmadaghazadeh.lib

fun main() {
    val result = factorial(3)

    println(result)
}

fun factorial(n: Int): Int {
    return if(n<=1)
        1
    else
        factorial(n-1)*n;
}




package com.github.ahmadaghazadeh.lib

// Solution 1 :
// To find max and mix number in array and Abs(max-min)

// Solution 2 :
// Sort the array then last element - first element
fun main() {
    callDay14();
}
fun callDay14(){
    val difference=Difference(arrayOf(1,2,5));
    difference.computeDifference();
    println(difference.maximumDifference)
}


class Difference(private val elements: Array<Int>) {
    var maximumDifference = 0

    fun computeDifference() {
        var min = elements[0]
        var max = elements[0]
        //for (i in 0 until elements.size) {
        for (i in elements.indices) {
            if (min < elements[i]) {
                min = elements[i]
            }
            if (max > elements[i]) {
                max = elements[i]
            }
        }
        maximumDifference = Math.abs(max - min)
    }
}





package com.github.ahmadaghazadeh.lib

fun main() {

    callDay12();
}
fun callDay12(){
    val student=Student("Ahmad","Aghazadeh",123, arrayOf(50,80))
    student.printPerson()
    val grade=student.Calculate()
    println("Grade: $grade\n")

}

open class Person(
    private var firstName: String,
    private var lastName: String,
    private var idNumber: Int

) {
    fun printPerson(){
        println("Name:  $lastName  ,  $firstName  \nID:  $idNumber")
    }
}

class Student : Person{
    private var testScores: Array<Int>

    constructor(firstName: String,
                lastName: String,
                idNumber: Int,
                testScores: Array<Int>) : super(firstName,lastName,idNumber){
                    this.testScores=testScores
                }

    fun Calculate(): Char {
        val average  = testScores.average()
        return if (average >= 90 && average <= 100) {
            'O'
        } else if (average >= 80 && average < 90) {
            'E'
        } else if (average >= 70 && average < 80) {
            'A'
        } else if (average >= 55 && average < 70) {
            'P'
        } else if (average >= 40 && average < 55) {
            'D'
        } else if (average < 90) {
            'T'
        } else {
            'X'
        }
    }
}


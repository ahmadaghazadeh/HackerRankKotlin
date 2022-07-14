package com.github.ahmadaghazadeh.lib

import java.time.DayOfWeek

val contacts = mutableMapOf<String, Long>()
fun main() {
//    val n = readLine()!!.trim().toInt()
//
//    for(i in 1..n){
//        val arr = readLine()!!.trimEnd().split(" ")
//        addToContact(arr[0],arr[1].toInt())
//    }
//
//    for(i in 1..n){
//        val searchName = readLine().toString()
//        searchContact(searchName)
//    }
    addToContact("sam",99912222)
    addToContact("tom",11122222)
    addToContact("krger",80787433)

    searchContact("sam")
    searchContact("edward")
    searchContact("harry")
}

fun addToContact(name:String, phoneNumber: Long) {
    contacts[name] = phoneNumber;
}

fun searchContact(name:String) {
    if(contacts.containsKey(name)){
        val phoneNumber=contacts[name]
        println("$name=$phoneNumber")
    }else{
        println("Not found")
    }
}



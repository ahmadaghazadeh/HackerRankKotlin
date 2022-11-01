package com.github.ahmadaghazadeh.lib

fun main() {

    callDay13();
}
fun callDay13(){
    val newNovel=MyBook("The Alchemist","Paulo Coelho",248);
    newNovel.display();
}

abstract class Book(val title:String,val author:String){
    abstract fun display()
}

class MyBook(title: String, author: String, private var price: Int) : Book(title, author) {
    override fun display() {
       println("Title: $title")
       println("Author: $author")
       println("Price: $price")
    }
}





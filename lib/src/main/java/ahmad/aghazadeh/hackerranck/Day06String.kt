package ahmad.aghazadeh.hackerranck


fun main(args: Array<String>) {
    callDay06("Hacker")
    callDay06("Rank")
}

fun callDay06(text:String){
    var evenIndexed=""
    var oddIndexed=""
    for (i in text.indices){//i in 0 until text.length
        if(i%2==0){
            evenIndexed += text[i]
        }else{
            oddIndexed += text[i]
        }
    }
    println("$evenIndexed $oddIndexed")
}


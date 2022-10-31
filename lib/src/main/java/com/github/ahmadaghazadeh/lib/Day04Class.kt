package ahmad.aghazadeh.hackerranck


fun main(args: Array<String>) {
    callDay04(-1)
    callDay04(10)
    callDay04(16)
    callDay04(18)

}

fun callDay04(age:Int){
    val person=Person(age)
    person.amIOld()
    for (textCase in 1..3){
        person.yearPasses()
    }
    person.amIOld();
    println()
}


class Person {
    private var age:Int
    constructor(initialAge: Int) {
        if (initialAge<0){
            age=0
              println("Age is not valid, setting age to 0.")
        } else{
            age=initialAge
        }
    }
    fun amIOld(){
        if(age<13){
            println("You are young.")
        }else if(age in 13..17){
            println("You are a teenager.")
        }else{
            println("You are old.")
        }
    }

    fun yearPasses() {
       age++
    }
}
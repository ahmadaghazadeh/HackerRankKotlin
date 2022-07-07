
fun main() {
   val number = readLine()!!.trim().toInt()
   if(1>=number && number<=100){
       if(number%2==1){
           println("Weird")    
       }else {
           if(2>=number && number<=5){
               println("Not Weird")    
           }else if(6>=number && number<=20){
                println("Weird")   
           }else if (number>20){
               println("Not Weird")   
           }
       }
              
   }else{
      println("Not Weird")    
   }
}
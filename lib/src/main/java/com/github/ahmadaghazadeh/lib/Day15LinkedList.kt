package com.github.ahmadaghazadeh.lib

// Solution 1 :
// To find max and mix number in array and Abs(max-min)

// Solution 2 :
// Sort the array then last element - first element
fun main() {
    callDay15();
}
fun callDay15(){
    var head:Node?=null
    head= insert(head,2)
    head= insert(head,3)
    head= insert(head,4)
    head= insert(head,1)
    display(head)

}
fun display(head: Node?) {
    var start = head
    while (start != null) {
        println(start.data.toString() + " ")
        start = start.next
    }
}
fun insert(head:Node?,data: Int):Node{
    if(head==null){
        return Node(data);
    }
    else{
        var start=head
        while (start?.next!=null){
            start= start.next!!
        }
        start?.next=Node(data)
        return head
    }
}


class Node(var data: Int) {
    var next: Node?=null
}





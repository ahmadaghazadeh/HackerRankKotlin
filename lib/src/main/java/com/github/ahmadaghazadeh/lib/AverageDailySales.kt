package com.github.ahmadaghazadeh.lib

import java.time.DayOfWeek
import java.time.LocalDateTime

fun main(args: Array<String>) {
    var order=listOf(
        Order(554,
            LocalDateTime.parse("2017-03-25T10:35:20")  , listOf(
                OrderLine(9872,"Pencel",3,3.00)
            )),
        Order(555,   LocalDateTime.parse("2017-03-25T11:24:20")  , listOf(
            OrderLine(5723,"Pencel",1,3.00),
            OrderLine(9872,"Pencel",1,1.00),
        )),
        Order(453,   LocalDateTime.parse("2017-03-27T14:53:12")  , listOf(
            OrderLine(5723,"Pencel",4,4.22),
            OrderLine(9872,"Pencel",3,3.12),
            OrderLine(3433,"Pencel",1,6.15),
        )),
        Order(431,   LocalDateTime.parse("2017-03-20T12:15:02")   , listOf(
            OrderLine(5723,"Pencel",7,4.22),
            OrderLine(3433,"Pencel",2,6.15),
        )),
        Order(431,  LocalDateTime.parse("2017-03-26T11:14:00")  , listOf(
            OrderLine(9872,"Pencel",4,3.12),
            OrderLine(4098,"Pencel",5,4.50),
        ))
    )
    var result= averageDailySales(order);
    println(result.toString());
}
data class Order(val orderId: Int, val creationDate: LocalDateTime, val orderLines: List<OrderLine>)

data class OrderLine(val productId: Int, val name: String, val quantity: Int, val unitPrice: Double)

fun averageDailySales(orders: List<Order>): Map<DayOfWeek, Int> {
    val result = mutableMapOf<DayOfWeek, Int>()
    val dayGrouping=orders.groupBy { it.creationDate.dayOfWeek }
    for (item in DayOfWeek.values()) {
        if (dayGrouping.containsKey(item)){
            result[item]=((dayGrouping.getValue(item).fold(0.0){ acc, order ->
                acc+order.orderLines.fold(0.0){acc1,orderLine->
                    acc1+(orderLine.quantity*orderLine.unitPrice)
                }
            })/dayGrouping.getValue(item).size).toInt()
        }else{
            result[item]=0;
        }
    }
    return result.toMap()
}

package com.allaboutscala.chapter.three.higherorderfuction_callbyname14

object ExampleOfCallByValue extends App {

  // we will see the difference between call-by-name and call-by-value function parameters

  println("Step 1: How to define a List with Tuple3 elements")
  val listOrders = List(("Glazed Donut", 5, 2.5),("Vanilla Donut", 3, 3.5))

  //  Step 1 above which had a call-by-value function parameter for exchange rate. This meant that any exchange rate passed through would be evaluated only once.

  println("\nStep 2: How to define a function to loop through each Tuple3 of the List and calculate total cost")
  def placeOrder(orders: List[(String, Int, Double)])(exchangeRate: Double): Double = {
    var totalCost = 0.0
    orders.foreach { order =>
      val costOfItem: Double = order._2 * order._3 * exchangeRate
      println(s"Total cost of ${order._2} ${order._1} = $costOfItem")
      totalCost += costOfItem
    }
    totalCost
  }

  println(s"Total cost of the order is ${placeOrder(listOrders)(0.5)}")

}

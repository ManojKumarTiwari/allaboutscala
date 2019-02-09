package com.allaboutscala.chapter.three.higherorderfuction_callbyname14

object ExampleOfCallByName extends App {

  import scala.util.Random

  val listOrders = List(("Glazed Donut", 5, 2.5),("Vanilla Donut", 3, 3.5))

  println("\nStep 4: How to define a call-by-name function")
  def placeOrderWithByNameParameter(orders: List[(String, Int, Double)])(exchangeRate: => Double): Double = {
    var totalCost = 0.0
    orders.foreach { order =>
      val costOfItem: Double = order._2 * order._3 * exchangeRate
      println(s"Total cost of ${order._2} ${order._1} = £$costOfItem")
      totalCost += costOfItem
    }
    totalCost
  }

  // The call-by-name function parameter exchangeRate: => Double will evaluate any exchangeRate function each time it is called.

  println("\nStep 5: How to define a simple USD to GBP function")
  val randomExchangeRate = new Random(10)

  def usdToGbp: Double = {
    val rate = randomExchangeRate.nextDouble()
    println(s"Fetching USD to GBP exchange rate = $rate")
    rate
  }

  println("\nStep 6: How to call function with call-by-name parameter")
  println(s"Total cost of order = £${placeOrderWithByNameParameter(listOrders)(usdToGbp)}")

}

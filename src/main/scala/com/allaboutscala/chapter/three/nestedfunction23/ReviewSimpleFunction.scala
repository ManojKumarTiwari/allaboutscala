package com.allaboutscala.chapter.three.nestedfunction23

object ReviewSimpleFunction extends App {


  println("Step 1: How to define a function")
  def checkDonutAvailability(donutName: String): Boolean = {
    // retrieve donut list that is currently in stock
    val listDonutsFromStock: List[String] = List("Vanilla Donut", "Strawberry Donut", "Plain Donut", "Glazed Donut")

    val iDonutInStock = (donutName.nonEmpty && donutName.length > 0) && (listDonutsFromStock contains donutName)

    iDonutInStock
  }

  println("\nStep 2: How to call a function")
  println(s"Calling checkDonutAvailability with Vanilla Donut = ${checkDonutAvailability("Vanilla Donut")}")

}

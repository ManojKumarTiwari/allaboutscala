package com.allaboutscala.chapter.three.functionswithparameters3

object DefaultValuesForFunctionParameters extends App {

  println("How to add default values to function parameters")
  def calculateDonutCost2(donutName: String, quantity: Int, couponCode: String = "NO CODE"): Double = {
    println(s"the price of $quantity $donutName after applying $couponCode is ")
    2.50 * quantity
  }

  println("How to call a function with parameters that has default values")
  val totalCostWithDiscount = calculateDonutCost2("Glazed donut", 5, "Coupon_25")
  print(totalCostWithDiscount)

  val totalCostWithoutDiscount = calculateDonutCost2("Glazed donut", 5)
  print(totalCostWithoutDiscount)

  // If you were using Java, you would have had to use method overloading to achieve the same desired effect.
  // However, the ability to provide a default value to function parameters in Scala is a much more elegant solution!

}

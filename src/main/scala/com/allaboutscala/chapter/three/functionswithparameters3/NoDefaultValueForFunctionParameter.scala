package com.allaboutscala.chapter.three.functionswithparameters3

object NoDefaultValueForFunctionParameter extends App {

  println("How to define function with parameters")
  def calculateDonutCost(donutName: String, quantity: Int): Double = {
    print(s"the price of $quantity $donutName is ")
    2.50 * quantity
  }

  println("How to call a function with parameters")
  val totalCost = calculateDonutCost("Glazed donut",5)
  print(totalCost)

}

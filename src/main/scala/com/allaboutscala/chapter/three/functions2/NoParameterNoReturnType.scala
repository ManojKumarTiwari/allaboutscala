package com.allaboutscala.chapter.three.functions2

object NoParameterNoReturnType extends App {

  println("function with no return type")
  def donutSalesReport(): Unit = {
    println("printing sales report of donuts...")
  }

  donutSalesReport()

  // If you have used other mainstream languages such as Java or .NET, Unit is similar to
  // using the void keyword in a method.

}

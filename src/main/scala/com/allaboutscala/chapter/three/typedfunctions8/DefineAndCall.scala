package com.allaboutscala.chapter.three.typedfunctions8

object DefineAndCall extends App {

  println("Step 1: How to define a function which takes a String parameter")
  def applyDiscount(couponCode: String) {
    println(s"Lookup percentage discount in database for $couponCode")
  }

  println("\nStep 2: How to define a function which takes a parameter of type Double")
  def applyDiscount(percentageDiscount: Double) {
    println(s"$percentageDiscount discount will be applied")
  }

  println("\nStep 3: Calling applyDiscount function with String or Double parameter types")
  applyDiscount("COUPON_1234")
  applyDiscount(10)

}

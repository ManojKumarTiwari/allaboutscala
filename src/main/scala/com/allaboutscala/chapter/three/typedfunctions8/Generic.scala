package com.allaboutscala.chapter.three.typedfunctions8

object Generic extends App {

  println("\nStep 4: How to define a generic typed function which will specify the type of its parameter")
  def applyDiscount[T](discount: T) {
    discount match {
      case d: String =>
        println(s"Lookup percentage discount in database for $d")

      case d: Double =>
        println(s"$d discount will be applied")

      case _ =>
        println("Unsupported discount type")
    }
  }

  println("\nStep 5: How to call a function which has typed parameters")
  applyDiscount[String]("COUPON_123")
  applyDiscount[Double](10)

}

package com.allaboutscala.chapter.three.functionswithimplicitparameters6

object WithSingleImplicitParameter extends App {

  // The use of implicit parameters is just one example of how dependency injection can be achieved in Scala.
  // As a matter of fact, dependency injection is built-into the Scala language such that you do not have
  // to import another third party library

  println(s"Step 1: How to define a function with an implicit parameter")
  def totalCost(donutType: String, quantity: Int)(implicit discount: Double): Double = {
    println(s"Calculating the price for $quantity $donutType")
    val totalCost = 2.50 * quantity * (1 - discount)
    totalCost
  }

  // The totalCost() function you've defined in Step 1 expects an implicit value of type Double to be in scope whenever the totalCost() function is called.

  println("\nStep 2: How to define an implicit value")
  implicit val discount: Double = 0.1
  println(s"All customer will receive a ${discount * 100}% discount")

  // Calling the totalCost() function is similar to calling any other function, except that you will not have to provide the implicit discount parameter.

  println("\nStep 3: How to call a function which has an implicit parameter")
  println(s"""Total cost with discount of 5 Glazed Donuts = ${totalCost("Glazed Donut", 5)}""")

  /* You did not have to manually pass-through the discount value when calling the totalCost() function.
  The Scala compiler will look for an implicit value of type Double for the discount implicit parameter which you've defined in Step 2.
  If there are no implicit values in scope, you will get a compiler error. */

}

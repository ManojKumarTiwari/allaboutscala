package com.allaboutscala.chapter.three.functionusingvalkeyword16

object UsingVal extends App {

  println("\nStep 1: How to define a higher order function which takes another function as parameter")
  def totalCostWithDiscountFunctionParameter(donutType: String)(quantity: Int)(f: Double => Double): Double = {
    println(s"Calculating total cost for $quantity $donutType")
    val totalCost = 2.50 * quantity
    f(totalCost)
  }

  println("\nStep 3: How to define and pass a val function to a higher order function")
  val applyDiscountValueFunction = (totalCost: Double) => {
    val discount = 2 // assume you fetch discount from database
    totalCost - discount
  }
  println(s"Total cost of 5 Glazed Donuts with discount val function = ${totalCostWithDiscountFunctionParameter("Glazed Donut")(5)(applyDiscountValueFunction)}")

  /*

  The syntax for defining value function is slightly different to functions defined with def keyword.

  In val applyDiscountValueFunction = (totalCost: Double) => { ... } we did not specify the return type of
   the function and are making use of Scala Type Inference.

  If you want to add the return type, the syntax for the value function would look as
  follows: val applyDiscountValueFunction: Double => Double = totalCost => { ... }

  When passing the value function to the Higher Order Function, you no longer need to explicitly make
  use of the wildcard operator _

  val functions are instances of FunctionN classes and if you look at the Scala documentation for
   say Function1 class, you will notice that val function will inherit other methods such as andThen
   or compose which allow for function composition.

   */
}

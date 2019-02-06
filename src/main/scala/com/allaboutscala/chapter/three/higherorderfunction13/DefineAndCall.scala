package com.allaboutscala.chapter.three.higherorderfunction13

object DefineAndCall extends App {

  // A Higher Order Function is a function which takes another function as its parameters.

  // Let's define a parameter which is a function that has an input parameter of type Double and will also
  // return a type of Double using the syntax (f: Double => Double)

  def totalCostWithDiscountFunctionParameter(name: String)(quantity: Int)(f: Double => Double): Double = {
    println(s"Total cost of $quantity $name is ")
    val totalCost = 2.5 * quantity
    f(totalCost)
  }

  // In the totalCostWithDiscountFunctionParameter() function, you call the function f by passing it the
  // totalCost value f(totalCost)

  // This function f will be provided at the time when you call thetotalCostWithDiscountFunctionParameter() function.

  // we will pass through an anonymous function which will apply the discount logic to the totalCost value as
  // shown below

  println("\nStep 3: How to call higher order function and pass an anonymous function as parameter")
  val totalCostOf5GlazedDonuts = totalCostWithDiscountFunctionParameter("Glazed Donut")(5){totalCost =>
    val discount = 2 // assume you fetch discount from database
    totalCost - discount
  }

  println(s"Total cost of 5 Glazed Donuts with anonymous discount function = $totalCostOf5GlazedDonuts")

  // A better approach to Step 3 is to pass-through a common discount function which would encapsulate the
  // discount logic instead of providing an anonymous function.

  println("\nStep 4: How to define and pass a function to a higher order function")
  def applyDiscount(totalCost: Double): Double = {
    val discount = 2 // assume you fetch discount from database
    totalCost - discount
  }

  println(s"Total cost of 5 Glazed Donuts with discount function = ${totalCostWithDiscountFunctionParameter("Glazed Donut")(5)(applyDiscount(_))}")

}

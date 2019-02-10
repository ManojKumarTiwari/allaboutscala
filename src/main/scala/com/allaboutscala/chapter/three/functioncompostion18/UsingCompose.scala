package com.allaboutscala.chapter.three.functioncompostion18

// Val functions inherit the compose function and we will show how to use the compose function to compose two
// functions together.

// Mathematically speaking, f(x) compose g(x) = f(g(x)). The second function g(x) is ran first and its
// result is passed along to the function f(x)

object UsingCompose extends App {

  println("Step 1: Assume a pre-calculated total cost amount")
  val totalCost: Double = 10

  println("\nStep 2: How to define a val function to apply discount to total cost")
  val applyDiscountValFunction = (amount: Double) => {
    println("Apply discount function")
    val discount = 2 // fetch discount from database
    amount - discount
  }

  println("\nStep 3: How to call a val function")
  println(s"Total cost of 5 donuts with discount = ${applyDiscountValFunction(totalCost)}")

  println("\nStep 4: How to define a val function to apply tax to total cost")
  val applyTaxValFunction = (amount: Double) => {
    println("Apply tax function")
    val tax = 1 // fetch tax from database
    amount + tax
  }

  println("\nStep 5: How to call andThen on a val function")
  println(s"Total cost of 5 Glazed donut with discount and included tax is ${(applyDiscountValFunction compose applyTaxValFunction)(totalCost)}")

  // The apply tax function was called first following which the apply discount function was called.
  // The output from the apply tax function was also passed through as input parameter to the apply discount function

  // Although in this example, the result is similar to using andThen as shown in the previous tutorial,
  // bear in mind the difference in ordering between andThen and compose.

  //Ordering using andThen: f(x) andThen g(x) = g(f(x))

  //Ordering using compose: f(x) compose g(x) = f(g(x))

}

package com.allaboutscala.chapter.three.curringfunctionwithparametergroups12

object CurriedFunctionAndPartialAppliedFunction extends App {

  println("Step 1: How to define function with curried parameter groups")
  def totalCost(name: String)(quantity: Int)(discount: Double): Double = {
    println(s"Total cost of $quantity $name with ${discount * 100}% discount is")
    val totalCost = 2.5 * quantity
    totalCost - (totalCost * discount)
  }

  // Functions defined with parameter groups are also commonly referred to as curried functions.
  // how to create functions whose parameters are organized into parameter groups - also known as Function Currying.


  println("\nStep 2: How to call a function with curried parameter groups")
  println(s"Total cost = ${totalCost("Glazed Donut")(10)(0.1)}")

  println("\nStep 3: How to create a partially applied function from a function with curried parameter groups")
  val totalCostForGlazedDonuts = totalCost("Glazed Donut")_

  // totalCostForGlazedDonuts function was defined as a value function using the val keyword as opposed to the def
  // function. In upcoming tutorials, we will show additional examples of value functions.

  //totalCostForGlazedDonuts is a partially applied function because it only fills in the first parameter
  // Glazed Donut. It uses the wildcard _ as a placeholder for the other parameters.

  //Note that the return type of the partially applied function totalCostForGlazedDonuts is
  // Int => Double => Double. The first Int is for our quantity parameter, the Double is for discount parameter
  // and the last Double the return type of the function. In short, the partially applied function creates a
  // chain of functions.

  println("\nStep 4: How to call a partially applied function")
  println(s"\nTotal cost for Glazed Donuts ${totalCostForGlazedDonuts(10)(0.2)}")

}

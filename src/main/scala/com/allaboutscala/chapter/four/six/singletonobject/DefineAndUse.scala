package com.allaboutscala.chapter.four.six.singletonobject

/*
Scala classes cannot have static variables or methods. Instead a Scala class can have what is called
a singleton object, or sometime a companion object.

A singleton object is declared using the object keyword

When a singleton object is named the same as a class, it is called a companion object. A companion
object must be defined inside the same source file as the class.

 */

object DefineAndUse extends App {

  println("Step 1: How to declare a Singleton Object")
  object DonutShoppingCartCalculator {

    println("\nStep 2: How to define a global field")
    val discount: Double = 0.01

    println("\nStep 3: How to define utility function called calculateTotalCost")
    def calculateTotalCost(donuts: List[String]): Double = {
      // calculate the cost of donuts
      return 1
    }
  }

  /*

  Scala does not exposed a static keyword. But you can encapsulate functions and methods inside a
  Singleton Object if you would like to expose some globally accessible utility function or method.

   */

  println("\nStep 4: How to call global discount field from Step 2")
  println(s"Global discount = ${DonutShoppingCartCalculator.discount}")

  println("\nStep 5: How to call the utility function calculateTotalCost from Step 3")
  println(s"Call to calculateTotalCost function = ${DonutShoppingCartCalculator.calculateTotalCost(List())}")

}

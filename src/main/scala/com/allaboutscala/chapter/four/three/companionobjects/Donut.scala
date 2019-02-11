package com.allaboutscala.chapter.four.three.companionobjects

// we will learn how to create Companion Object for a given class

// you will use the companion object to create instances for that particular class without
// having to make use of the new keyword.

class Donut(name: String, productCode: Int) {
  println("Step 1: How to define a simple class to represent a Donut object")
  def print = println(s"Donut name = $name, productCode = $productCode")

}

// A Companion Object is defined using the object keyword and the name of the object should
// be identical to the class name.

// In addition, the companion object should define an apply() method which will be responsible for
// instantiating an instance of the given class.

object Donut {
  println("\nStep 2: How to declare a companion object for the Donut class")
  def apply(name: String, productCode: Int): Donut = new Donut(name, productCode)
}

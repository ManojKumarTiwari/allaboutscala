package com.allaboutscala.chapter.four.five.valuesandfieldsincompanionobjects

// we will learn how to declare values and fields in Companion Object which will be accessed only
// by the class of the Companion Object.

object DeclaringValuesAndFields extends App {

  println("Step 1: How to define a simple class to represent a Donut object")
  class Donut(name: String, productCode: Option[Long] = None){

    def print = println(s"Donut name = $name, productCode = ${productCode.getOrElse(0)}, uuid = ${Donut.uuid}")

  }

  println("\nStep 2: How to declare fields and values in companion object")
  object Donut {

    private val uuid = 1

    def apply(name: String, productCode: Option[Long]): Donut = {
      new Donut(name, productCode)
    }

    def apply(name: String): Donut = {
      new Donut(name)
    }
  }

  // Notice that within the Donut Companion Object, we've defined a value named uuid but also marked it as private.

  // But, given that a Companion Object works along side the class to which the Companion Object refers to, even
  // though the uuid field is not visible to the outside world, it is still accessible within the Donut class

  println("\nStep 3: How to create instances of the Donut class using the companion object")
  val glazedDonut = Donut("Glazed Donut", Some(1111))
  val vanillaDonut = Donut("Vanilla Donut")

  println("\nStep 4: How to call function on each Donut object")
  glazedDonut.print
  vanillaDonut.print

}

package com.allaboutscala.chapter.four.nine.implicitclass

object ImplicitClassExample extends App {

  // we will learn how use Implicit Class to add methods to an object without modifying the source code
  // of the object - also commonly known as extension methods.

  println("Step 1: How to define a case class to represent a Donut object")
  case class Donut(name: String, price: Double, productCode: Option[Long] = None)

  println("\nStep 2: How to create instances or objects for the Donut case class")
  val vanillaDonut: Donut = Donut("Vanilla", 1.50)
  println(s"Vanilla donut name = ${vanillaDonut.name}")
  println(s"Vanilla donut price = ${vanillaDonut.price}")
  println(s"Vanilla donut produceCode = ${vanillaDonut.productCode}")

  // Assume that you were given a Donut type in a library or dependency and as such do not have access to
  // modify the Donut source code. In addition, say you are given a requirement to create a unique identifier
  // for the Donut type. With Implicit Class, you can easily extend the functionality of the Donut type.

  println("\nStep 3: How to define an implicit class to augment or extend the Donut object with a uuid field")
  object DonutImplicits {
    implicit class AugmentedDonut(donut: Donut) {
      def uuid: String = s"${donut.name} - ${donut.productCode.getOrElse(12345)}"
    }
  }

  /*

  It's a good practice to encapsulate Implicit Classes into an object which can later be injected or referenced.

  In real life you probably would not hardcode the uuid value using donut.productCode.getOrElse(12345) but this
  is just an example of how to add a default value if the productCode field is None.

   */

  println("\nStep 4: How to import and use the implicit class AugmentedDonut from Step 3")
  import DonutImplicits._
  println(s"Vanilla donut uuid = ${vanillaDonut.uuid}")

  // The vanilla donut object now has access the uuid method - also known as the extension method.

}

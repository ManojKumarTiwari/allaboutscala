package com.allaboutscala.chapter.four.four.usingapplyofcompanionobjects

// we will learn how to use the Companion Object's apply() method as a factory to return different class type hierarchies.

object ApplyMethodAsFactoryMethod extends App {

  println("Step 1: How to define a simple class to represent a Donut object")
  class Donut(name: String, productCode: Option[Long] = None){

    def print = println(s"Donut name = $name, productCode = ${productCode.getOrElse(0)}")

  }

  println("\nStep 2: How to declare class hierarchy through inheritance using extends keyword")
  class GlazedDonut(name: String) extends Donut(name)

  class VanillaDonut(name: String) extends Donut(name)

  println("\nStep 3: How to declare apply method of companion object as a factory")
  object Donut {

    def apply(name: String): Donut = {
      name match {
        case "Glazed Donut" => new GlazedDonut(name)
        case "Vanilla Donut" => new VanillaDonut(name)
        case _ => new Donut(name)
      }
    }

  }

  println("\nStep 4: How to call apply method of companion object which is a factory")
  val glazedDonut = Donut("Glazed Donut")
  println(s"The class type of glazedDonut = ${glazedDonut.getClass}")
  glazedDonut.print

  val vanillaDonut = Donut("Vanilla Donut")
  println(s"The class type of vanillaDonut = ${vanillaDonut.getClass}")
  vanillaDonut.print

  val plainDonut = Donut("Plain Donut")
  println(s"The class type of vanillaDonut = ${plainDonut.getClass}")
  plainDonut.print

}

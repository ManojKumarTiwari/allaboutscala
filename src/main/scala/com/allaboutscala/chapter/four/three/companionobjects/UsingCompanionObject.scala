package com.allaboutscala.chapter.four.three.companionobjects

object UsingCompanionObject extends App {

  println("\nStep 3: How to create instances of the Donut class using the companion object")
  val glazedDonut = Donut("Glazed Donut",111)
  val vanillaDonut = Donut("Vanilla Donut",222)

  println("\nStep 4: How to call function on each Donut object")
  glazedDonut.print
  vanillaDonut.print

  // println(s"${glazedDonut.name}")

}

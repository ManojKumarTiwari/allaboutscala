package com.allaboutscala.chapter.four.two.classesandobjects

object DonutMain extends App {

  val glazedDonut = new Donut("Glazed Donut", 1111)
  val vanillaDonut = new Donut("Vanilla Donut", 2222)

  glazedDonut.print
  vanillaDonut.print

  // You will get a compiler error if you try to access either the name or productCode properties
  // from the donut objects.

  // println(s"${glazedDonut.name}")

}

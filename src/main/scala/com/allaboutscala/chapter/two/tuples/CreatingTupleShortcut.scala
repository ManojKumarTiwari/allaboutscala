package com.allaboutscala.chapter.two.tuples

object CreatingTupleShortcut extends App {

  println("Shortcut for creating Tuples")
  val chocolateDonut = ("Chocolate Donut", "Very Tasty", 3.0)
  println(s"Chocolate donut taste level = ${chocolateDonut._2}, price = ${chocolateDonut._3}")

}

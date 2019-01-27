package com.allaboutscala.chapter.two.option

object OptionAndSome extends App {

  //By making use of Option, Some and None, Scala encourages you to write functions with no side effects as we've
  // described in the Scala Features tutorial. As a result, all your headaches with NullPointerException should go away :)

  println("How to use Option and Some")
  val donutName: Option[String] = Some("Glazed Donut")
  println(s"donut name is ${donutName.get}")

  //get function can still throw Null pointer exception so we go for None or Pattern Matching

}

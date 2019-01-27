package com.allaboutscala.chapter.two.tuples

object UsingTupleN extends App {

  println("Using TupleN class to store more than 2 data points")
  val donut = Tuple3("Plain Donut","Tasty",2.5)
  println(s"${donut._1} is ${donut._2} and is priced at ${donut._3}")

}

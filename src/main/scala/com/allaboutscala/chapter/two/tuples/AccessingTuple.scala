package com.allaboutscala.chapter.two.tuples

object AccessingTuple extends App {

  println("Access each element in a tuple")
  val donut = Tuple2("Glazed Donut","Very Tasty")
  val donutType = donut._1
  val donutTasteLevel = donut._2
  println(s"$donutType taste level is $donutTasteLevel")

}

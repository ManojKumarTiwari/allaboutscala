package com.allaboutscala.chapter.two.pattern

object PatternMatchingBasic extends App {
  println("Pattern matching basic")
  val donutType = "Glazed Donut"
  donutType match {
    case "Glazed Donut" => println("Very Tasty")
    case "Strawberry Donut" => println("Okay")
  }

}

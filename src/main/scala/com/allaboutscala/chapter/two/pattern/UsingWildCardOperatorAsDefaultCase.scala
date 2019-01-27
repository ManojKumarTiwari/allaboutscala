package com.allaboutscala.chapter.two.pattern

object UsingWildCardOperatorAsDefaultCase extends App {

  println("Using Wild Card Operator (_) in Pattern matching, usually used to define default case")
  val donutType = "Strawberry Donut"

  val tasteLevel = donutType match {
    case "Glazed Donut" => "Very Tasty"
    case "Plain Donut" => "Tasty"
    case _ => "Good"
  }

  println(s"taste level of $donutType is $tasteLevel")

}

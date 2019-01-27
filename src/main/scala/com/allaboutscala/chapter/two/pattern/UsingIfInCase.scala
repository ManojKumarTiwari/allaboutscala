package com.allaboutscala.chapter.two.pattern

object UsingIfInCase extends App {

  println("Using if clause in case")
  val donutType = "Strawberry Donut"

  val tasteLevel = donutType match {
    case donut if(donut.contains("Glazed") | donut.contains("Strawberry")) => "Very Tasty"
    case "Plain Donut" => "Tasty"
    case _ => "Good"
  }

  println(s"taste level of $donutType is $tasteLevel")

}

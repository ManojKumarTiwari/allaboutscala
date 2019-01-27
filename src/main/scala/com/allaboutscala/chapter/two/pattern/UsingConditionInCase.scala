package com.allaboutscala.chapter.two.pattern

object UsingConditionInCase extends App {

  println("Using conditions like OR in case")
  val donutType = "Strawberry Donut"

  val tasteLevel = donutType match {
    case "Glazed Donut" | "Strawberry Donut" => "Very Tasty"
    case "Plain Donut" => "Tasty"
    case _ => "Good"
  }

  println(s"taste level of $donutType is $tasteLevel")

}

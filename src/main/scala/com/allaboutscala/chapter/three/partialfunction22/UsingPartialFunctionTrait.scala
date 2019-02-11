package com.allaboutscala.chapter.three.partialfunction22

object UsingPartialFunctionTrait extends App {

  println("\nStep 2: How to define a Partial Function named isVeryTasty")
  val isVeryTasty: PartialFunction[String, String] = {
    case "Glazed Donut" | "Strawberry Donut" => "Very Tasty"
  }

  // Note that we are using the PartialFunction trait

  //In this example isVeryTasty takes an input of type String which is the donut and produces a String
  // for the taste level. This is specified by PartialFunction[String, String]

  println("\nStep 3: How to call the Partial Function named isVeryTasty")
  println(s"Calling partial function isVeryTasty = ${isVeryTasty("Glazed Donut")}")

  // You will get scala.MatchError if the partial function does not have a case which matches the provided input.
  //println(s"Taste level of Glazed donut is ${isVeryTasty("Plain Donut")}")

  println("\nStep 4: How to define PartialFunction named isTasty and unknownTaste")
  val isTasty: PartialFunction[String, String] = {
    case "Plain Donut" => "Tasty"
  }

  val unknownTaste: PartialFunction[String, String] = {
    case donut @ _ => s"Unknown taste for donut = $donut"
  }

  println("\nStep 5: How to compose PartialFunction using orElse")
  val donutTaste = isVeryTasty orElse isTasty orElse unknownTaste
  println(donutTaste("Glazed Donut"))
  println(donutTaste("Plain Donut"))
  println(donutTaste("Chocolate Donut"))

}

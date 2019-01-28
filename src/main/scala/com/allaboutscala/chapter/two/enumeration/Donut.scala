package com.allaboutscala.chapter.two.enumeration

object Donut extends Enumeration with App {

  println("How to create an enumeration")

  type Donut = Value

  val Glazed = Value("Glazed")
  val Strawberry = Value("Strawberry")
  val Plain = Value("Plain")
  val Vanilla = Value("Vanilla")

  println("How to print the value of enumeration")
  println(s"My fav donut is ${Donut.Vanilla}")

  println("How to print the id of the enumeration")
  println(s"Vanilla Donut's id = ${Donut.Vanilla.id}")

  println("How to print all the values listed in Enumeration")
  println(s"Donut types = ${Donut.values}")

  println("How to pattern match on enumeration values")
  Donut.values.foreach {
    case d if (d == Donut.Strawberry || d == Donut.Glazed) => println(s"Found favourite donut = $d")
    case _ => None
  }

}

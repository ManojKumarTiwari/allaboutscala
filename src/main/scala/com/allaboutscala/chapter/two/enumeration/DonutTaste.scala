package com.allaboutscala.chapter.two.enumeration

object DonutTaste extends Enumeration with App {

  println("Step 6: How to change the default ordering of enumeration values")

  type DonutTaste = Value

  val Tasty       = Value(0, "Tasty")
  val VeryTasty   = Value(1, "Very Tasty")
  val Ok          = Value(-1, "Ok")

  println(s"Donut taste values = ${DonutTaste.values}")
  println(s"Donut taste of OK id = ${DonutTaste.Ok.id}")

}

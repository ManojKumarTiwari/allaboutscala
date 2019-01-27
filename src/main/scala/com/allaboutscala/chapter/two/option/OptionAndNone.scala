package com.allaboutscala.chapter.two.option

object OptionAndNone extends App {

  println("How to use Option and None")
  val donutTaste: Option[String] = None
  println(s"donut taste is ${donutTaste.getOrElse("Very Tasty")}")

}

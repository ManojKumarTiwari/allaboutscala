package com.allaboutscala.chapter.two.option

object PatternMatchingWithOption extends App {

  println("How to use pattern matching with Option")
  val donutTaste: Option[String] = None
  donutTaste match{
    case Some("tasteLevel") => println(s"donut is Very Tasty")
    case None => println(s"donut taste is Tasty")
  }

}

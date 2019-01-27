package com.allaboutscala.chapter.one.tutorial_06

object HelloWorldWithArguments extends App {

  println("Hello World from Scala using Arguments")
  println("Command line arguments are: ")
  //println(args(0))
  println(args.mkString(", "))
}

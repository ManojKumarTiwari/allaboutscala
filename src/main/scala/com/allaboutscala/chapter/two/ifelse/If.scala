package com.allaboutscala.chapter.two.ifelse

object If extends App {

  println("Using if clause as statement")
  val numberOfPeople = 20
  val numberOfDonutsPerPerson = 2
  val defaultNumberOfDonuts = 8

  if(numberOfPeople > 10)
    println(s"number of donuts required = ${numberOfPeople * numberOfDonutsPerPerson}")

}

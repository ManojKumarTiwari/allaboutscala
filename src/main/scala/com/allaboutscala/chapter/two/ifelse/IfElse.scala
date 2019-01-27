package com.allaboutscala.chapter.two.ifelse

object IfElse extends App {

  println("Using if clause as statement")
  val numberOfPeople = 20
  val numberOfDonutsPerPerson = 2
  val defaultNumberOfDonuts = 8

  if(numberOfPeople > 30)
    println(s"number of donuts required = ${numberOfPeople * numberOfDonutsPerPerson}")
  else
    println(s"number of donuts to buy = $defaultNumberOfDonuts")

}

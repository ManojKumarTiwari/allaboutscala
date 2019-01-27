package com.allaboutscala.chapter.two.ifelse

object IfElseifElse extends App {

  println("Using if clause as statement")
  val numberOfPeople = 0
  val numberOfDonutsPerPerson = 2
  val defaultNumberOfDonuts = 8

  if(numberOfPeople > 30)
    println(s"number of donuts required = ${numberOfPeople * numberOfDonutsPerPerson}")
  else if(numberOfPeople == 0){
    println(s"number of people are $numberOfPeople")
    println("so no donuts needed")
  }
  else
    println(s"number of donuts to buy = $defaultNumberOfDonuts")

}

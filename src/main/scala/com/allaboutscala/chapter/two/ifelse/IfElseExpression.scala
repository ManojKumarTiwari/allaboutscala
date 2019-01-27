package com.allaboutscala.chapter.two.ifelse

object IfElseExpression extends App {

  println("Using if else clause as expression")
  val numberOfPeople = 0
  val numberOfDonutsPerPerson = 2
  val defaultNumberOfDonutsPerPerson = 8
  val numberOfDonuts = if(numberOfPeople >10)(numberOfPeople * numberOfDonutsPerPerson) else if(numberOfPeople == 0)(numberOfPeople * numberOfDonutsPerPerson) else defaultNumberOfDonutsPerPerson
  println(s"$numberOfDonuts")
}

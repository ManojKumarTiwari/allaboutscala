package com.allaboutscala.chapter.two.typeinference

object TypeInference extends App {

  println("Scala Types")
  val donutsBoughtToday = 5
  val bigNumberOfDonuts = 100000000L
  val smallNumberOfDonuts = 1
  val priceOfDonut = 2.50
  val donutPrice = 2.50f
  val donutStoreName = "Allaboutscala Donut Store"
  val donutByte = 0xa
  val donutFirstLetter = 'D'
  val nothing = ()
  val really = false

  println(donutsBoughtToday)
  println(bigNumberOfDonuts)
  println(smallNumberOfDonuts);println(priceOfDonut);println(donutPrice)
  println(donutStoreName)
  println(donutByte)
  println(donutFirstLetter)
  println(nothing)
  println(really)

  println("Using Scala compiler to convert from one data type to another")
  val numberOfDonuts: Short = 1
  val minimumDonutsToBuy: Int = numberOfDonuts

  println("User driven conversion from one data type to another ")
  val minimumDonutsToSell: String = numberOfDonuts.toString()
}

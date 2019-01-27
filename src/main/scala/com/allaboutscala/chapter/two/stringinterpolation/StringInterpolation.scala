package com.allaboutscala.chapter.two.stringinterpolation

object StringInterpolation extends App {

  println("Using string interpolation to print a variable")
  val favCar = "Bugati"
  println(s"My fav car is $favCar")

  println()
  println()

  println("Using string interpolation to print on object properties")
  case class Car(name: String,carType: String)
  val favCar2 = Car("BMW","Sports")
  println(s"My fav car is ${favCar2.name} and it is a ${favCar2.carType} car")

  println()
  println()

  println("Using string interpolation to evaluate expression")
  val numberOfCars = 5
  println(s"Do i have 5 cars = ${numberOfCars == 5}")

  println()
  println()

  println("Using string interpolation for formatting text")
  val car = "Audi"
  val carType = "Classic"
  println(f"$car%20s $carType")

  println()
  println()

  println("Using string f interpolation to format numbers")
  val price = 2222.5
  println(s"price = $price")
  println(f"price = $price%3.5f")

  println()
  println()

  println("Using raw interpolation to print any symbols in string")
  println("max\npayne")
  println(raw"max \n payne")

}

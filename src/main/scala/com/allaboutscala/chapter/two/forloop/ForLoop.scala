package com.allaboutscala.chapter.two.forloop

object ForLoop extends App {

  println("A simple for loop from 1 to 5 inclusive")
  for(numberOfDonuts <- 1 to 5)
    println(s"number of Donuts = $numberOfDonuts")

  println("A simple for loop from 1 to 5, where 5 is NOT inclusive")
  for(numberOfDonuts <- 1 until 5)
    println(s"number of Donuts = $numberOfDonuts")

  println("using by keyword")
  for(x <- 1 to 10 by 2)
    println(x)

  println("using by keyword")
  for(y <- 10 to 0 by -3)
    println(y)

  //Guarded for loop
  println("using if inside for loop")
  for(z <- 1 to 10 if z > 7)
    println(z)

  println("creating 2D for loop in scala")
  for(x <- 1 to 10; y <- 5 until 1 by -1)
    println(x,y)

  println("creating for loop using {} instead of (),We use it when conditions are specified in multiple lines")
  for{x <- 1 to 10
      y <- 5 until 1 by -1}
    println(x,y)

  println("creating for loop using {} instead of () with if statement ,We use it when conditions are specified in multiple lines")
  for{x <- 1 to 10
      y <- 5 until 1 by -1
      if y > 3 && x < 4}
    println(x,y)

}

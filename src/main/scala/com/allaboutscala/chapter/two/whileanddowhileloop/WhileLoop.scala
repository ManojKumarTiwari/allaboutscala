package com.allaboutscala.chapter.two.whileanddowhileloop

object WhileLoop extends App {

  println("How to use while loop in scala")
  var numberOfDonutstoBake = 10
  while(numberOfDonutstoBake > 0){
    println(s"number of donuts remaining to be baked = $numberOfDonutstoBake")
    numberOfDonutstoBake-=1
  }

}

package com.allaboutscala.chapter.two.whileanddowhileloop

object DoWhileLoop extends App {

  println("How to use do while loop in scala")
  var numberOfDonutsBaked = 0
  do{
    numberOfDonutsBaked+=1
    println(s"number of donuts baked = $numberOfDonutsBaked")
  }while(numberOfDonutsBaked < 5)

  //there are better functional ways of achieving the same looping semantics using fold or recursive techniques.

}

package com.allaboutscala.chapter.three.functions2

object NoParameterWithReturnType extends App {

  println("Step 1: How to define and use a function which has no parameters and has a return type")
  def favDonut(): String = {
    "Glazed Donut"
  }

  val myFavDonut = favDonut()
  println(s"my fav donut is $myFavDonut")

  // We did not use any return keyword in favoriteDonut() as you would in say Java or .NET.
  // The last line within the body of the function is the one that will be returned back to the caller.

}

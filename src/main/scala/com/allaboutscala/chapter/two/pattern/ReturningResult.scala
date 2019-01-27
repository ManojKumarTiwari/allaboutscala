package com.allaboutscala.chapter.two.pattern

object ReturningResult extends App {

  println("Returning the result from a pattern matching")
  val donutType = "Plain Donut"

  val tasteLevel = donutType match {
    case "Glazed Donut" => "Very Tasty"
    case "Plain Donut" => "Tasty"
  }

  println(s"taste level of $donutType is $tasteLevel")

  //Notice that you did not have to use the return keyword as you would in say Java or .NET.

  //Instead, the last expression will be the one returned back to the caller. We will see more return types
  // as we get to tutorials on functions.

  //You should have noticed that unlike in Java or in .NET, there are no break statements!

  //I'm pretty sure that you must have seen your share of bugs which come from the fact that someone forgot
  // to use the break clause. In Java or .NET, this would allow the logic to fall-through to the next case statement.

  //Another big thanks to Scala as the compiler is smart enough to prevent fall-through and hence there is no need
  // to use a break clause with pattern matching.

}

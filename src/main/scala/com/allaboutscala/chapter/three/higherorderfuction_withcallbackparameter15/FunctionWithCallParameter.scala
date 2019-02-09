package com.allaboutscala.chapter.three.higherorderfuction_withcallbackparameter15

object FunctionWithCallParameter extends App {

  // we will see how to define a function which has a callback or Option callback parameter.

  println("Step 1: How to define a function with a callback parameter")
  def printReport(sendEmailCallback: () => Unit) = {
    println("printing report... started")
    // look up some data in database and create a report
    println("printing report... finished")
    sendEmailCallback()
  }

  println("\nStep 2: How to call a function which has a callback parameter")
  printReport(() => println("sending email... finished"))

  // What if you wanted to print the report but not send any email?

  println("\nStep 3: How to call a function without providing its callback parameter")
  // printReport() // You get compile time error

  // You can instead pass in an empty anonymous function as shown below, although the syntax does not look that elegant:
  printReport(() => {}) // Not that elegant.

}

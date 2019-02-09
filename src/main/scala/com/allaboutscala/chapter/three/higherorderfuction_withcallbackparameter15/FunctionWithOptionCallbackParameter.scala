package com.allaboutscala.chapter.three.higherorderfuction_withcallbackparameter15

object FunctionWithOptionCallbackParameter extends App {

  println("\nStep 4: How to define a function Function with an Option callback")
  def printReportWithOptionCallback(sendEmailCallback: Option[() => Unit] = None) {
    println("Printing report ... started")
    // look up some data in database and create a report
    println("Printing report ... finished")
    sendEmailCallback.map(callback => callback())
  }

  // We are using the map() function to filter out any None callback function

  println("\nStep 5: How to call a function without providing its callback parameter")
  printReportWithOptionCallback() // more elegant

  println("\nStep 6: How to call a function with Option callback parameter")
  printReportWithOptionCallback(Some(() =>
    println("Sending email wrapped in Some() ... finished")
  ))

}

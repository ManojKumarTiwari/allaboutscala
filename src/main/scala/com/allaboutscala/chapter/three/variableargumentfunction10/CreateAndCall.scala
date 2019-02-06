package com.allaboutscala.chapter.three.variableargumentfunction10

object CreateAndCall extends App {

  println("\n How to create a function with variable number of arguments")
  def printReport(names: String*){
    println(s"""Donut Reports = ${names.mkString(" - ")}""")
  }

  //The names argument is of type String, but it is also a variable argument as we've defined it using the * syntax.
  //As a variable argument, you will be allowed to call the printReport() function by passing zero or many
  // parameters of type String as shown in Step 2 below.

  println("\n How to call a function having variable number of arguments")
  printReport("Glazed Donut","Strawberry Donut","Plain Donut")
  printReport("Vanilla Donut")
  printReport()

  // you are allowed to call the function with zero or many String values.

  println("\nStep 3: How to pass a List to a function with variable number of arguments")
  val listDonuts: List[String] = List("Glazed Donut", "Strawberry Donut", "Vanilla Donut")

  // Calling printReport() function by passing it the listDonuts value which is a List of type String will
  // give you a compiler error!

  // printReport(listDonuts)

  // Instead, you will need to use a special syntax called type ascription as follows:
  printReport(listDonuts: _*)

  println("\nStep 4: How to pass a Sequence to a function with variable number of arguments")
  val seqDonuts: Seq[String] = Seq("Chocolate Donut", "Plain Donut")

  // Calling printReport() function by passing it the seqDonuts value which is a Sequence of type String will give you a compiler error!
  // printReport(listDonuts)

  // Instead, you will need to use a special syntax called type ascription as follows:
  printReport(seqDonuts: _*)

  println("\nStep 5: How to pass an Array to a function with variable number of arguments")
  val arrDonuts: Array[String] = Array("Coconut Donut")

  // Calling printReport() function by passing it the arrDonuts value which is a Array of type String will give you a compiler error!
  // printReport(arrDonuts)

  //Instead, you will need to use a special syntax called type ascription as follows:
  printReport(arrDonuts: _*)

}

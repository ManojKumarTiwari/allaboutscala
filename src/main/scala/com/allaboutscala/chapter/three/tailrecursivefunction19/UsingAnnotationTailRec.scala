package com.allaboutscala.chapter.three.tailrecursivefunction19

// we will learn how to create tail recursive function and also make use of the annotation
// @annotation.tailrec which will instruct the compiler to apply any further optimisation.

// Tail recursive function will help prevent overflow in your call stack because the
// evaluation of your looping construct happens at each step.

object UsingAnnotationTailRec extends App {

  println("Step 1: How to define an Array of type String")
  val arrayDonuts: Array[String] = Array("Vanilla Donut", "Strawberry Donut", "Plain Donut", "Glazed Donut")

  println("\nStep 2: How to define a tail recursive function")
  @annotation.tailrec
  def search(donutName: String, donuts: Array[String], index: Int): Option[Boolean] = {
    if(donuts.length == index) {
      None
    } else if(donuts(index) == donutName) {
      Some(true)
    } else {
      val nextIndex = index + 1
      search(donutName, donuts, nextIndex)
    }
  }

  println("\nStep 3: How to call a tail recursive function")
  val found = search("Glazed Donut", arrayDonuts, 0)
  println(s"Find Glazed Donut = $found")

  val notFound = search("Chocolate Donut", arrayDonuts, 0)
  println(s"Find Chocolate Donut = $notFound")

  // The very first expression if(donuts.length == index) is the exit call for the search function because
  // we have looped through all elements within the Array.

  //The second expression else if(donuts(index) == donutName) will exit the search function as we have
  // found the donut item in the Array.

  // In the third expression shown below
  //we increment the current index by 1 and call the search function itself (this is the recursive bit)
  // but for the next item in the Array.

  //The @annotation.tailrec instructs the compiler to add any optimisations with regards to
  // stack frame management as this function is recursive.

}

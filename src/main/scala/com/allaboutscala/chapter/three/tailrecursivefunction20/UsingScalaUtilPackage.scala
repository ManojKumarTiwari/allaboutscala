package com.allaboutscala.chapter.three.tailrecursivefunction20

import com.allaboutscala.chapter.three.tailrecursivefunction19.UsingAnnotationTailRec.{arrayDonuts, search}

import scala.util.control.TailCalls._

// we will learn how to create tail recursive function by making use of utilities
// that Scala provides for tail recursions in the package scala.util.control.TailCalls._

object UsingScalaUtilPackage extends App {

  println("Step 1: How to define an Array of type String")
  val arrayDonuts: Array[String] = Array("Vanilla Donut", "Strawberry Donut", "Plain Donut", "Glazed Donut")

  println("\nStep 2: How to define a tail recursive function using scala.util.control.TailCalls._")
  def search(donutName: String, donuts: Array[String], index: Int): TailRec[Option[Boolean]] = {
    if(donuts.length == index) {
      done(None)
    } else if(donuts(index) == donutName) {
      done(Some(true))
    } else {
      val nextIndex = index + 1
      tailcall(search(donutName, donuts, nextIndex))
    }
  }

  // We changed the returned type of our function to be TailRec[Option[Boolean]]

  // As a result of using TailRec, we also need to make use of done() in the exit expression
  // if(donuts.length == index) and for the case when we found the donut item else if(donuts(index) == donutName)

  // When recursively calling the function itself, you need to wrap the call to the function inside a
  // tailcall() as follows: tailcall(tailSearch(donutName, donuts, nextIndex))

  println("\nStep 4: How to call tail recursive function using scala.util.control.TailCalls._")
  val found = tailcall(search("Glazed Donut", arrayDonuts, 0))
  println(s"Find Glazed Donut = ${found.result}")

  // NOTE: our returned value is wrapped so we need to get it by calling result

  val notFound = tailcall(search("Chocolate Donut", arrayDonuts, 0))
  println(s"Find Chocolate Donut = ${notFound.result}")
}

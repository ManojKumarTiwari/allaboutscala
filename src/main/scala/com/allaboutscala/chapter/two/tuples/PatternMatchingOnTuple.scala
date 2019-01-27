package com.allaboutscala.chapter.two.tuples

//This is not working logically try again

object PatternMatchingOnTuple extends App {

  println("Using pattern matching on tuples")
  val donut = Tuple3("Glazed Donut","Very Tasty",3.5)
  val donut2 = Tuple3("Plain Donut","Tasty",2.5)
  val donut3 = Tuple3("Strawberry Donut","Tasty",3.25)

  val donutList = List(donut,donut2,donut3)

  val mydonutchoice = donutList.foreach(
    tuple =>{
      tuple match{
        case ("Glazed Donut",tasteLevel,price) => donut
        case d if d._1=="Plain" => donut2
        case _ => null
      }
    })

  println(mydonutchoice)

}

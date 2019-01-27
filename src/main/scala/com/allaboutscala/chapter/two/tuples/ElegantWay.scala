package com.allaboutscala.chapter.two.tuples

object ElegantWay extends App {

  println("A more elegant pattern matching within foreach function")

  val donut = Tuple3("Glazed Donut","Very Tasty",3.5)
  val donut2 = Tuple3("Plain Donut","Tasty",2.5)
  val donut3 = Tuple3("Strawberry Donut","Tasty",3.25)

  val donutList = List(donut,donut2,donut3)

  donutList.foreach {
    case ("Plain Donut", taste, price) => println(s"Donut type = Plain Donut, price = $price")
    case d if d._1 == "Glazed Donut" => println(s"Donut type = ${d._1}, price = ${d._3}")
    case _ => None
  }

}

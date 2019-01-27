package com.allaboutscala.chapter.two.variables

object DataTypes extends App {

  val a: Int = 1
  println(a)

//   a = 25 <- this will throw an error
//   println(a)

  var b: Int = 5
  println(b)
  b = 45
  println(b)

  //  Type inference and Lazy Keyword can only be used for val
  lazy val c = 50;
  println(c)
//  c = 60
//  println(c)

  lazy val d = "Will intialize this variable later"
  lazy val e = 1
  lazy val f: Char = 'G'
  println(d,e,f)

//  Data types supported in Scala
  val g: Int = 3
  val h: Long = 500000000000L
  val i: Short = 32000
  val j: Double = 2.5
  val k: Float = 2.5F
  val l: Char = 'D'
  val m: Byte = 8
  val n: String = "Something is something"
  val o: Unit = ()
  println(g)
  println(h)
  println(i)
  println(j);println(k);println(l);println(m)
  println(n);println(o)
  println("***********************")

// wild card operator _ only applicable to var and data type should be specified
  var g1: Int = _
  var h1: Long = _
  var i1: Short = _
  var j1: Double = _
  var k1: Float = _
  var l1: Char = _
  var m1: Byte = _
  var n1: String = _
  var o1: Unit = _

  println(g1)
  println(h1)
  println(i1)
  println(j1);println(k1);println(l1);println(m1)
  println(n1);println(o1)
}

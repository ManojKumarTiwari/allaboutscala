package com.allaboutscala.chapter.four.ten

// we will learn how use Package Objects to store and encapsulate common Objects and Implicit conversions.

// Objects and Implicit conversions declared inside Package Objects, as the name implies, will be accessible
// to any classes or traits in the given package. In addition, Package Objects make it easy to inject these
// Objects and Implicit conversions into other scopes within your application.

package object packageobject {

  println("Step 2: How to define a case class to represent a Donut object in a package object")
  case class Donut(name: String, price: Double, productCode: Option[Long] = None)

  println("\nStep 3: How to define an implicit class to augment or extend the Donut object with a uuid field")
  implicit class AugmentedDonut(donut: Donut) {
    def uuid: String = s"${donut.name} - ${donut.productCode.getOrElse(12345)}"
  }

  println("\nStep 4: How to alias JodaTime to a DateTime type")
  type DateTime = org.joda.time.DateTime

}

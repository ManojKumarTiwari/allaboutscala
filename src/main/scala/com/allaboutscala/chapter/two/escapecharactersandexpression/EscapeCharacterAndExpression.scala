package com.allaboutscala.chapter.two.escapecharactersandexpression

object EscapeCharacterAndExpression extends App {

  //escaping characters using backslash(\)
  println("How to escape a JSON string")
  val donutJson = "{\"name\":\"glazed donut\",\"tastelevel\":\"high\",\"price\":2.50}"
  println(s"donut is $donutJson")

  //escaping characters using triple quotes (""")
  println("How to escape a JSON string")
  val donutJson1 = """{"name":"glazed donut","tastelevel":"high","price":2.50}"""
  println(s"donut is $donutJson1")

  //creating multi-line string text using stripMargin
  println("How to escape a JSON string")
  val donutJson2 = """
                    |{
                    |"name":"glazed donut",
                    |"tastelevel":"high",
                    |"price":2.50
                    |}
                  """
    .stripMargin
  println(s"donut is $donutJson2")

  //stripMargin function, you will see that it also takes in a parameter to allows you to specify a different character other than the default pipe (|)

  println("\nTip: stripMargin using a different character")
  val donutJson5: String =
    """
#{
#"donut_name":"Glazed Donut",
#"taste_level":"Very Tasty",
#"price":2.50
#}
""" .stripMargin('#')
  println(s"donutJson5 = $donutJson5")

}

package com.zanatech

object HelloWorld extends App {
  val meaningOfLife: String = "Hello Scala World"
  println(meaningOfLife)

  val ifExpress = if (meaningOfLife.length > 10) "long sentence" else "this is short"
  println(ifExpress)

  val chainedIfExpress = if (meaningOfLife.length > 100) "long sentence"
    else if (meaningOfLife.length < 0) "It's negative?"
    else if (meaningOfLife.isEmpty) "there's no sentence"
    else "meaningless"

  println(chainedIfExpress)

  val codeBlock = {
    // definitions
    val aLocalValue = 65
    "Code Block Result is: " + aLocalValue + 35 // last expression, hence the value of this block.
  }

  println(codeBlock)

  //  define a function
  def myFunction (x: Int, y: Int): String = "Result of the function is: " + y + " " +  x
  println(myFunction(3, 5))
}
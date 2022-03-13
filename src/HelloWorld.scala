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
}
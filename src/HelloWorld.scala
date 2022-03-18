package com.zanatech

object HelloWorld extends App {
  // Unit return type:

  // as a type of side-effects

  def unitReturnType(): Unit = {
    println("I am returning nothing...")
  }

  val a: Unit = unitReturnType()
  println(a) // a us undefined. prints `()`

  val r = scala.util.Random
  println(r.nextInt(100))

}

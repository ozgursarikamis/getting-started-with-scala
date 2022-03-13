package com.zanatech

object HelloWorld extends App {
  // Unit return type:

  // as a type of side-effects

  def unitReturnType(): Unit = {
    println("I am returning nothing...")
  }

  val a: Unit = unitReturnType()
  print(a) // a us undefined. prints `()`

}
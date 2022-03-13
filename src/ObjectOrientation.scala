package com.zanatech

class ObjectOrientation extends App {
  // class declaration
  class Animal {

    // class members

    // fields
    val age: Int = 0

    // methods:
    def eat(): Unit = println("Eating...")
  }

  // instance
  val myAnimal = new Animal

  // inheritance
  class Dog() extends Animal
}

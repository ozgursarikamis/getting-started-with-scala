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
  class Dog(name: String ) extends Animal {
    // `name` is constructor-defined
  }

  val dog = new Dog("Lessie")
  // constructor arguments are not fields!
  // dog.name // won't compile

  // sub-type polymorphism:
   val aDeclaredAnimal: Animal = new Dog("Hachi")
   aDeclaredAnimal.eat()
  // the most derived function will be called at runtime

  abstract class WalkingAnimal {
    val hasLegs = true // all fields and methods are by default public.
    def walk(): Unit
  }

  // interfaces = Ultimate abstraction type
  trait Carnivore {
    def eat(a: Animal): Unit
  }
}

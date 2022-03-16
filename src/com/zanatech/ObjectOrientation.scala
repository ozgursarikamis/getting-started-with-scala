//package com.zanatech

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

  trait Philosopher {
    def ?!(thought: String): Unit
  }

  // single-class inheritance, multi-trait mixing...
  class Crocodile extends Animal with Carnivore with Philosopher {
    override def eat(a: Animal): Unit = println("I am eating you")

    // or:
    // override def eat(): Unit = super.eat()

    override def ?!(thought: String): Unit = println(s"I was thinking $thought")
  }

  val aCroc = new Crocodile
  aCroc.eat(dog)
  aCroc eat dog // infix notation for single-parameter methods.
  aCroc ?! "What if we could fly.."

  // anonymous classes:
  var dinosaur = new Carnivore {
    override def eat(a: Animal): Unit = println("I am a dinosaur, I can eat pretty much everything...")
  }

  /*
  class Carnivore_Anonymous_123456 extends Carnivore {
    override def eat(a: Animal): Unit = println("I am a dinosaur, I can eat pretty much everything...")
  }

  val dinosaur = new Carnivore_Anonymous_123456

   */

  // Singleton object
  object MySingleton {
    val mySpecialValue = 53278
    def mySpecialMethod(): Int = 5555
    def apply(x: Int): Int = x + 1
  }

  MySingleton.mySpecialMethod()

  MySingleton.apply(65)
  MySingleton(65) // equivalent to MySingleton.apply(65)



 }

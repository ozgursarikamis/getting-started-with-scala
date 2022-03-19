package com.zanatech

object HelloScala extends App {

  class Employee(firstName: String, lastName: String) {
    override def toString: String = firstName + " " + lastName
  }

  val bob = new Employee("Bob", "Martin")
  println(bob.toString)
}
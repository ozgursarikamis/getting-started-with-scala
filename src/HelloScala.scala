package com.zanatech

object HelloScala extends App {

  class Employee(firstName: String, lastName: String) {
    override def toString: String = firstName + " " + lastName
  }

  val bob = new Employee("Bob", "Martin")
  println(bob.toString)

  //  println(bob.firstName)
  // value firstName is not a member of com.zanatech.HelloScala.Employee
}
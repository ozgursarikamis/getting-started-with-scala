package com.zanatech

object HelloScala extends App {

  class Employee(firstName: String, lastName: String, s: Int) {

    // Fields
    private val first: String = ""
    private val last: String = ""
    private var stocks: Int = s

    def getFirst: String = first
    def getLast: String = last
    def getStocks: Int = stocks

    def awardMoreStocks(numberOfStocks: Int): Unit = stocks += numberOfStocks

    override def toString: String = firstName + " " + lastName + " " + stocks
  }

  val bob = new Employee("Bob", "Martin", 10)
  println(bob.getFirst)
  println(bob.getLast)
  println(bob.getStocks)
  val stockAfterAward: Unit = bob.awardMoreStocks(100)
  println(bob.getStocks, stockAfterAward)
}
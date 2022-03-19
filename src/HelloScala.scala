package com.zanatech

object HelloScala extends App {

  class Employee(firstName: String, lastName: String, s: Int) {

    private val departmentByCode: Map[String, String] = Map(
      "HR" -> "Human Resources",
      "ACT" -> "Accounts",
      "R&D" -> "Research and Development",
      "MKT" -> "Marketing",
      "SLS" -> "Sales",
      "OPS" -> "Operations"
    )

    def getDepartmentName(code: String): String = departmentByCode.getOrElse(code, "No such department")

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

  println(bob.getDepartmentName("HR"))
}
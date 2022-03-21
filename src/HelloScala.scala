object HelloScala extends App {

  abstract class BaseEmployee {
    val first: String
    val last: String
    override def toString: String = first + " " + last // abstract classes can have default definitions
  }

  abstract class DepartmentEmployee extends BaseEmployee {
    private val secret = "This is a scret value"

    val department: String
    val departmentCode: String
    val numberOfStocks: Int

    override def toString: String = s" $first $last ($numberOfStocks)"

  }

  class RnDEmployee(f: String, l: String) extends DepartmentEmployee {
    val first: String = f
    val last: String = l
    val department: String = "Research and Development"
    val departmentCode = "R&D"
    val numberOfStocks: Int = 100
  }

  class MarketingEmployee(f: String, l: String) extends DepartmentEmployee {
    val first: String = f
    val last: String = l
    val department: String = "Marketing"
    val departmentCode = "MKT"
    val numberOfStocks: Int = 85
  }

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

  val rnDEmployee = new RnDEmployee("rndFirst", "RndLast")
  println(rnDEmployee)
  println(rnDEmployee.toString)
}
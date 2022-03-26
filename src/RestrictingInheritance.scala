import java.util.UUID

final // prevent this class from being inherited˚
  class Customer(first: String, last: String, email: String) {
  private val _id: UUID = UUID.randomUUID()
  private val _first = first
  private val _last = last
  private val _email = email

  def getId: UUID = _id
  def getFirst: String = _first
  def getLast: String = last
  def getEmail: String = email
}

class HackCustomer(
                    first: String = "*",
                    last: String = "**",
                    email: String = "***") extends Customer(first, last, email) { }

object RestrictingInheritance extends App {
  val c1: Customer = new Customer("Tony", "Stark", "tony@stark.com")
  println(c1.getId, c1.getFirst, c1.getLast, c1.getEmail)

  val hack1: HackCustomer = new HackCustomer()
  println(hack1.getId, hack1.getFirst, hack1.getLast, hack1.getEmail)
}

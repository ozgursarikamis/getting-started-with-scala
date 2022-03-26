import java.time.LocalDateTime
import java.util.UUID

object AccountRunner extends App {

  abstract class Account(id: UUID, name: String, dateOpened: LocalDateTime) {
    private var _id: UUID = id
    private var _name: String = name
    private var _dateOpened: LocalDateTime = dateOpened
    val _accountType: String

    def this(name: String) {
      this(UUID.randomUUID(), name, LocalDateTime.now())
    }

    def getId: UUID = _id
    def getName: String = _name
    def getDateOpened: LocalDateTime = _dateOpened
    def updateName(newName: String): Unit = _name = newName
    def getAccountType: String = _accountType
  }

  class CreditAccount(name: String) extends Account(name: String) {
    override val _accountType: String = "Credit"
  }

  class DepositAccount(name: String) extends Account(name: String) {
    override val _accountType: String = "Deposit"
  }

  val ca1: Account = new CreditAccount("Travel Mastercard")

  println(ca1.getId)
  println(ca1.getName)
  println(ca1.getAccountType)
  println()

  val da1: Account = new DepositAccount("Super Savings")

  println(da1.getId)
  println(da1.getName)
  println(da1.getAccountType)
}
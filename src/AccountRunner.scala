import java.time.LocalDateTime
import java.util.UUID

object AccountRunner extends App {

  class Account(id: UUID, name: String, dateOpened: LocalDateTime) {
    private var _id: UUID = id
    private var _name: String = name
    private var _dateOpened: LocalDateTime = dateOpened

    def this(name: String) {
      this(UUID.randomUUID(), name, LocalDateTime.now())
    }

    def getId: UUID = _id
    def getName: String = _name
    def getDateOpened: LocalDateTime = _dateOpened
    def updateName(newName: String): Unit = _name = newName
  }

  class CreditAccount(name: String) extends Account(name: String) {
    private val _accountType = "Credit"
    def getAccountType: String = _accountType
  }

  class DepositAccount(name: String) extends Account(name: String) {
    private val _accountType: String = "Deposit"
    def getAccountType: String = _accountType
  }

  val ca1: CreditAccount = new CreditAccount("Travel Mastercard")
  println(ca1.getId, ca1.getName, ca1.getAccountType)

  val da2: DepositAccount = new DepositAccount("Super Savings")
  println(da2.getId, da2.getName, da2.getDateOpened, da2.getAccountType)

}
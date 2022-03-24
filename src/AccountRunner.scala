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
  }

  val a1 = new Account(UUID.randomUUID(), "Account 1", LocalDateTime.now)
  val a2 = new Account(UUID.randomUUID(), "Account 2", LocalDateTime.now.plusHours(6))

  println(a1)
  println(a1.getId)
  println(a1.getName)
  println(a1.getDateOpened)

  val a3 = new Account("Account 0")

  println(a3.getId, a3.getName, a3.getDateOpened)

  //  a1._name = "Updated Name"   // Does not compile, the class member is decorated with val now.
  //  a1._id = UUID.randomUUID()    // Does not compile, the class member is decorated with val now.

  println()
  println(a1.getName, a1.getId)
}
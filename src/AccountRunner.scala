import java.time.LocalDateTime
import java.util.UUID

object AccountRunner extends App {

  class Account(id: UUID, name: String, dateOpened: LocalDateTime) {
    var _id: UUID = id
    var _name: String = name
    var _dateOpened: LocalDateTime = dateOpened

    def this(name: String) {
      this(UUID.randomUUID(), name, LocalDateTime.now())
    }
  }

  val a1 = new Account(UUID.randomUUID(), "Account 1", LocalDateTime.now)
  val a2 = new Account(UUID.randomUUID(), "Account 2", LocalDateTime.now.plusHours(6))

  println(a1)
  println(a1._id)
  println(a1._name)
  println(a1._dateOpened)

  val a3 = new Account("Account 0")

  println(a3._id, a3._name, a3._dateOpened)
}
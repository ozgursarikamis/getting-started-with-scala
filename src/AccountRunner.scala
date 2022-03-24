import java.time.LocalDateTime
import java.util.UUID

object AccountRunner extends App {

  class Account(id: UUID, name: String, dateOpened: LocalDateTime) {
    val _id: UUID = id
    val _name: String = name
    val _dateOpened: LocalDateTime = dateOpened

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

  //  a1._name = "Updated Name"   // Does not compile, the class member is decorated with val now.
  //  a1._id = UUID.randomUUID()  // Does not compile, the class member is decorated with val now.

  println()
  println(a1._name, a1._id)
}
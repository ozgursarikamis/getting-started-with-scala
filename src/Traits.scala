

object Traits extends App {
  // Traits can encapsulates fields & methods.

  trait Db {
    private var contents: Map[String, String] = Map.empty

    def save(key: String, value: String): Unit = {
      contents += (key -> value)
    }

    def get(key: String): Option[String] = contents.get(key)
  }

  class InMemoryDb extends Db
  val repo: Db = new InMemoryDb

  repo.save("a", "apple")
  repo.save("b", "banana")

  val result = repo.get("a")
  println(result)

  class Human

  class Employee extends Human with Db

  val employee: Db = new Employee

  employee.save("e1", "Bob Martin")
  employee.save("e2", "Amy Jones")

  employee.get("e2")
}

object AnotherTraitApp extends App {
  case class Event(id: Int, location: String, dayOfWeek: String, sessionTime: Integer, source: String)

  val event1 = Event(1, "US", "Sun", 10, "Twitter")
  val event2 = Event(2, "China", "Mon", 15, "WeChat")
  val event3 = Event(3, "New Zealand", "Thu", 30, "Linkedin")

  trait EventsInterface {
    def get(eventId: Int): Option[Event]
    def all: List[Event]
  }

  class Events(val events: List[Event]) extends EventsInterface {
    override def get(eventId: Int): Option[Event] = events.find(_.id == eventId)

    override def all: List[Event] = events
  }

  val events = new Events(List(event1, event2, event3))
  println(events.get(1))
  println(events.all)
}
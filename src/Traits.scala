

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

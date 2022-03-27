object CompanionObjects extends App {

  /*
  * A companion object in Scala is an object that’s declared in the same file as a class,
  * and has the same name as the class.
  */
  class Pizza {}
  object Pizza {}

  //  a companion object and its class can access each other’s private members (fields and methods)

  object SomeClass {
    private val HiddenFileName = "/tmp/foo.bar"
  }

  class SomeClass {
    def printFileName(): Unit = {
      println(SomeClass.HiddenFileName)
    }
  }

  class Person {
    var name: Option[String] = None
    var age: Option[Int] = None

    override def toString: String = s"$name, $age"
  }

  object Person {
    def apply(name: Option[String]): Person = {
      val p = new Person
      p.name = name
      p
    }

    def apply(name: Option[String], age: Option[Int]): Person = {
      val p = new Person
      p.name = name
      p.age = age
      p
    }
  }

  val p1 = Person(Some("Fred"))
  val p2 = Person(None)

  val p3 = Person(Some("Wilma"), Some(33))
  val p4 = Person(Some("Wilma"), None)

  println(p1)
  println(p2)
  println(p3)
  println(p4)

}

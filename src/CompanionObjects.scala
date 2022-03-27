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

  class Person(var name: String, var age: Int)

  // Just as adding an apply method in a companion object lets you construct new object instances,
  // adding an unapply lets you de-construct object instances.

  object Person {
    def unapply(p: Person): String = s"${p.name}, ${p.age}"
  }

  val p = new Person("Lori", 29)
  val result = Person.unapply(p)

  println(result)

}

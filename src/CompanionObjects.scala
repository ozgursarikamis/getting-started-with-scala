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

  class Person { var name = "" }
  object Person {
    def apply(name: String): Person = {
      var p = new Person
      p.name = name
      p
    }
  }
  //  Creating new instances without the new keyword
  val zenMasters = List(
    Person("Nansen"),
    Person("NanseJoshu")
  )

  val p = Person("Fred Flinstone")
  // val p = Person.apply("Fred Flinstone") // Behind the scenes

}

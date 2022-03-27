object CaseClasses extends App {
  case class Person(name: String, relation: String)

  // new not needed:
  val christina = Person("Christina", "niece")
  println(christina)

  // Case class constructor parameters are val fields by default,
  // so an accessor method is generated for each parameter:

  println(christina.name)

  //  But, mutator methods are not generated:
  //  christina.name = "Fred" // does not compile.
}

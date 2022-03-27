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


  //  A great thing about a case class is that it automatically generates an unapply
  //  method for your class, so you don’t have to write one.

  trait Person2 { def name: String }

  case class Student(name: String, year: Int) extends Person2
  case class Teacher(name: String, specialize: String) extends Person2

  def getPrintableString(p: Person2): String = p match {
    case Student(name, year) => s"$name is a student in Year $year"
    case Teacher(name, whatTheyTeach) => s"$name teaches $whatTheyTeach"
  }

  val s = Student("A1", 1)
  val t = Teacher("Bob Donnan", "Mathematics")

  println()
  val result = getPrintableString(s)
  println(result)

  val result2 = getPrintableString(t)
  println(result2)

}

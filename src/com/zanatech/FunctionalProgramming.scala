object FunctionalProgramming extends App {
  class Person(name: String) {
    def apply(age: Int): Unit = println(s"My name is $name, I have aged $age years")
  }

  val bob = new Person("Bob")
  bob.apply(43)
  bob(43)

  /*
  Scala runs on the JVM

  Functional programming:
    - compose functions
    - pass functions as args
    - return functions as results

    Conclusion: FunctionX
  */

  val simpleIncrementer = new Function1[Int, Int] {
    override def apply(arg: Int): Int = arg + 1
  }

  simpleIncrementer.apply(23)
  simpleIncrementer(23)
  // defined a function!

  // ALL SCALA FUNCTIONS ARE INSTANCES OF THESE FUNCTION_X TYPES

  val stringConcatenator = new Function2[String, String, String] {
    override def apply(v1: String, v2: String): String = v1 + v2
  }

  println(stringConcatenator.apply("I love ", "Scala"))

  // SYNTAX STRINGS:
  var doubler: Function1[Int, Int] = (x: Int) => x * 2
  /*
  equivalent to the much longer:
  new Function1[Int, Int] {
    override def apply(x: Int) = x * 2
  }
   */
  println(doubler(4)) // 8

  // HIGHER ORDER FUNCTIONS:
  // - take functions as args / return functions as results. or both

  val aMappedList = List(1, 2, 3).map(x => x + 1) // HOF
  println(aMappedList)

  val aFlatMappedList = List(1, 2, 3).flatMap(x => List(x, 2 * x))
  println(aFlatMappedList)

  //  val aFilteredList = List(3, 4, 5, 6).filter(x => x < 5)
  val aFilteredList = List(3, 4, 5, 6).filter(_ < 5)
  println(aFilteredList)

  val allPairs = List(1, 2, 3).flatMap(number => List('a', 'b', 'c').map(letter => s"$number-$letter"))
  println(allPairs)

  // `FOR` COMPREHENSIONS:
  val alternativePairs = for {
    number <- List(1, 2, 3)
    letter <- List('a', 'b', 'c')
  } yield s"$number-$letter"

  println(alternativePairs)

  val aList = List(1, 2, 3)
  var firstElement = aList.head
  val rest = aList.tail

  val aPrependedList = 0 :: aList
  println(aPrependedList)

  val anExtendedList = 0 +: aList :+ 6
  print(anExtendedList)
}

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

  // LISTS:
  val aList = List(1, 2, 3)
  var firstElement = aList.head
  val rest = aList.tail

  val aPrependedList = 0 :: aList
  println(aPrependedList)

  val anExtendedList = 0 +: aList :+ 6
  println(anExtendedList)

  // SEQUENCES:
  val aSequence: Seq[Int] = Seq(1, 2, 3) // Seq.apply(1, 2, 3)
  val accessedElement = aSequence(2)
  println(accessedElement)

  // vectors: fast Seq implementation
  val aVector = Vector(1, 2, 3, 4, 5)
  println(aVector)

  // sets:
  val aSet = Set(1, 2, 3, 4, 4, 5, 5)
  println(aSet) // order is not important in a set collection

  val aSetHas6 = aSet.contains(6)
  println(aSetHas6)

  val anAddedSet = aSet + 6 // `+` is a method name in Scala
  println(anAddedSet)

  val aRemovedSet = aSet - 3
  println(aRemovedSet)

  // Ranges:

  val aRange = 1 to 10
  println(aRange)

  val twoByTwo = aRange.map(x => 2 * x).toList
  println(twoByTwo)

  val twoByTwo_set = aRange.map(x => 2 * x).toSet
  println(twoByTwo_set)

  val twoByTwo_seq = aRange.map(x => 2 * x).toSeq
  println(twoByTwo_seq) // Vector(2, 4, 6, 8, 10, 12, 14, 16, 18, 20)

  // TUPLES
  val aTuple = ("Bon Jovi", "Rock", 1982, false)
  println(aTuple)
  println(aTuple._1)
  println(aTuple._2)
  println(aTuple._3)
  println(aTuple._4)

  println()
  aTuple.productIterator.foreach(x => println(x))
  println()

  // MAPS:
  val aMap: Map[String, Int] = Map(
    ("Daniel", 654321),
    "Jane" -> 4445232
  )

  println(aMap("Daniel"))
  println(aMap("Jane"))
}

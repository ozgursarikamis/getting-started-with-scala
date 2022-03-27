object Traits extends App {
  // Traits are used to share interfaces and fields between classes.
  // They are similar to Java 8’s interfaces. Classes and objects can extend traits,
  // but traits cannot be instantiated and therefore have no parameters.

  trait Iterator[A] {
    def next(): A
    def hasNext: Boolean
  }

  class SomeClass extends Iterator[Int] {
    override def hasNext: Boolean = false
    override def next(): Int = 0
  }
}


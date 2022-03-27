import scala.collection.mutable.ArrayBuffer

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

  class IntIterator(to: Int) extends Iterator[Int] {
    private var current = 0

    override def hasNext: Boolean = current < to

    override def next(): Int = {
      if (hasNext) {
        val t = current
        current += 1
        t
      } else {
        0
      }
    }
  }

  val iterator = new IntIterator(10)

  println(iterator.next())
  println(iterator.next())

  // Where a given trait is required, a subtype of the trait can be used instead.

  trait Pet {
    val name: String
  }

  class Cat(val name: String) extends Pet
  class Dog(val name: String) extends Pet

  val dog = new Dog("Harry")
  val cat = new Cat("Sally")

  val animals = ArrayBuffer.empty[Pet]
  animals.append(dog)
  animals.append(cat)
  animals.foreach(pet => println(pet.name))
}


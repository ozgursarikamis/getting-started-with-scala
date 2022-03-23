object HelloScala extends App {
  println("Hello Scala World")
}

object ParameterizedPair {
  case class Pair[T, U](fst: T, sec: U) {
    override def toString: String = s"==++ $fst, $sec ++=="

    def switch: Pair[U, T] = this.copy(fst=sec, sec = fst)

  }

  def main(args: Array[String]): Unit = {
    val intStringPair: Pair[Int, String] = Pair(1, "First")
    val switched = intStringPair.switch

    println(s"IntStringPair $intStringPair | Switched: $switched")

  }
}
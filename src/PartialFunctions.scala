object PartialFunctions {
  def main(args: Array[String]): Unit = {
    // val divide64By = (x: Int) => 64 / x
    // println(divide64By(8))
    // println(divide64By(0))

    val divide64By = new PartialFunction[Int, Int] {

      def isDefinedAt(x: Int): Boolean = x != 0

      def apply(x: Int): Int = 64 / x

    }

    println("Is Defined At 0: " + divide64By.isDefinedAt(0))
    println("Is Defined At 11: " + divide64By.isDefinedAt(11))
    // println("Defined at 11: " + divide64By(11))
    // println("Defined at 0 : " + divide64By(0))

    println("Divide 64 by 3: " + (if (divide64By.isDefinedAt(3)) divide64By(3)))
  }
}

object PartialFunctionsWithPatternMatching {
  def main(args: Array[String]): Unit = {
    val divide64By: PartialFunction[Int, Int] = {
      case x: Int if x != 0 => 64 / x
    }

    println("Is Defined At 0: " + divide64By.isDefinedAt(0))
    println("Is Defined At 11: " + divide64By.isDefinedAt(11))
    println("Divide 64 by 3: " + (if (divide64By.isDefinedAt(3)) divide64By(3)))
  }
}

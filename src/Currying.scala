object Currying extends App {

  // Function with no currying:
  def multiply(a: Int, b: Int) = {
    a * b
  }

  val a = multiply(3, 5)
  println(a)

  // Function with currying:
  def multiplyC(a:Int)(b: Int) = a * b
  val b = multiplyC(3)(5)
  println(b)

  val c = multiplyC(2) _
  println(b == c(10))
}

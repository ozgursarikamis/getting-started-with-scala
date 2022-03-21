object MethodsAsOperators extends App {
  val i1 = 10
  val i2 = 30

  val sum = i1 + i2
  println(s"sum: $sum")

  val multiply = i1 * i2
  println(s"multiply: $multiply")

  val divide = i2 / i1
  println(s"divide: $divide")

  val s = "Hello World"
  println(s.indexOf('o'))
  println(s.indexOf('o', 5))

  class Text(val string: String) {
    def unary_! = new Text(string + "!!")

    override def toString: String = string
  }

  val text = new Text("wow")
  println(!text)
  print(text.toString)

}

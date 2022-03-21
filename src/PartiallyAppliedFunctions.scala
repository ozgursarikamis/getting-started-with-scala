object PartiallyAppliedFunctions extends App {
  def sum(a: Int, b: Int, c: Int) = a + b + c

  val allSupplied = sum(1, 2, 3)
  println(allSupplied)

  val oneNotSupplied = sum(1, 2, _: Int)
  println("oneNotSupplied", oneNotSupplied)

  val twoNotSupplied = sum(1, _, _)
  println("twoNotSupplied", twoNotSupplied)

  val noneSupplied = sum(_, _, _)
  println(noneSupplied)

  println(oneNotSupplied(2))
  println(twoNotSupplied(2, 3))
  println(noneSupplied(1, 2, 3))
}

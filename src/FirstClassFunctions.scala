object FirstClassFunctions extends App {

  // Function Literals
  var multipleBy = (x: Int) => x * 100

  println(multipleBy(3))
  println(multipleBy(7))

  //  multipleBy = (x: String) => x.toUpperCase() // redefining won't work. parameter types must be the same

  multipleBy =  (x: Int) => x * 1000

  print(multipleBy(33))
}

object FunctionPlaceholders extends App {
  val calculateResult = (x: Int, y: Int) => {
    val sum = x + y
    val diff = x - y
    val product = x + y
    val quotient = x / y

    (sum, diff, product, quotient) // last expression is returned
  }

  println(calculateResult(10, 5))
  println(calculateResult(40, 8))

  val stockPrices = List(1, 3, 5, 7, 9)
  println(stockPrices.filter(_ > 5)) // _ is the placeholder

  val stockTickers = List("goog", "ps", "tsla", "aapl", "msft")
  val upperCaseStockTickers = stockTickers.map(_.toUpperCase())
  println(upperCaseStockTickers)
}

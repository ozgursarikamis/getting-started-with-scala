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

object FunctionsShorthand extends App {
  val sayHello = () => println("Hello Scala Functions World")
  sayHello()
  sayHello.apply()
  println()

  val multiplyBy100 = (x: Int) => x * 100
  println(multiplyBy100(44))
  println(multiplyBy100.apply(44))

  println()
  val addThreeNumbers = (x: Int, y: Int, z: Int) => x + y + z
  println(addThreeNumbers(3, 6, 7))
  println(addThreeNumbers.apply(3, 6, 7))
}

object FunctionLiteralsAndPlaceholdersExample extends App {
  val source = io.Source.fromFile("src/resources/GOOG.csv")

  val d = for {
    line <- source.getLines().drop(1).toVector
    cols = line.split(",").map(_.trim)
  } yield StockRecord(
    cols(0),
    cols(1).toFloat,
    cols(2).toFloat,
    cols(3).toFloat,
    cols(4).toFloat,
    cols(5).toFloat,
    cols(6).toDouble
  )

  println(d.toList)

  println()
  val priceDelta = (_: Double) - (_: Double)

  println(priceDelta(9, 3))
}

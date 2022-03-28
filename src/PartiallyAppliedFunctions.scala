object PartiallyAppliedFunctions extends App {
  val googleStockPrices = List(1367.36, 1360.66, 1394.20, 1393.33, 1404.31, 1419.82, 1429.73)

  def checkPriceGreaterThan1400(price: Double): Boolean = price > 1400

  val googleStackPricesGreaterThan1400 = googleStockPrices.filter(checkPriceGreaterThan1400 _) // placeholder for entire parameters

  println(googleStackPricesGreaterThan1400)
}

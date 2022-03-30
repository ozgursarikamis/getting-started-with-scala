object HigherOrderFunctions extends App {

  // functions that return functions:
  def urlBuilder(ssl: Boolean, domainName: String): (String, String) => String = {
    val schema = if (ssl) "https://" else "http://"
    (endpoint: String, query: String) => s"$schema$domainName/$endpoint?$query"
  }

  println(urlBuilder(ssl = false, "google"))
  println(urlBuilder(ssl = false, "google")("v1", "v2"))

  // HOF: Sample 2
  def format[R](z: R) = "{" + z.toString + "}"
  def apply(x: Double => String, y: Double) = x(y)

  println(apply(format, 32))

  val num = List(7, 8, 9)
  def multiplyValue = (y: Int) => y * 3
  val result = num.map(y => multiplyValue(y))
  println(result)
}

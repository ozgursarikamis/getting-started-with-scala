import ParameterizedPair.HttpUtils.HttpVerb

object HelloScala extends App {
  println("Hello Scala World")
}

object ParameterizedPair {
  case class Pair[T, U](fst: T, sec: U) {
    override def toString: String = s"==++ $fst, $sec ++=="

    def switch: Pair[U, T] = this.copy(fst=sec, sec = fst)

  }

  def main(args: Array[String]): Unit = {

    def toHttpVerb(httpVerb: String): HttpVerb = HttpUtils.asHttpVerb(httpVerb)

    println(toHttpVerb("GET"))

  }

  object HttpUtils {
    sealed trait HttpVerb
    case object GET extends HttpVerb
    case object PUT extends HttpVerb
    case object POST extends  HttpVerb

    def asHttpVerb(httpVerb: String): HttpVerb =
      httpVerb.toLowerCase match {
        case "get" => GET
        case "post" => POST
        case "put" => PUT
        case other => throw new IllegalArgumentException(s"No equivalent HttpVerb found for: $other")
      }
  }
}
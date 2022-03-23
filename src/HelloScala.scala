
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
    import scala.util.Try
    import scala.util.Failure
    import scala.util.Success

      def toHttpVerb(httpVerb: String): Option[HttpVerb] =
        Try {
          HttpUtils.asHttpVerb(httpVerb)
        }.toOption

    println(toHttpVerb("GET")) // returns Success(GET)
    println(toHttpVerb("G3T")) // returns Failure(G3T)

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
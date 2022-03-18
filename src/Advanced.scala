package com.zanatech

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scala.util.{Failure, Success, Try}

object Advanced extends App {
  // lazy evaluation:
  lazy val aLazyValue = 2
  lazy val lazyValueWithSideEffect = {
    println("I am so very lazy...")
    43
  }

  val eagerValue = lazyValueWithSideEffect + 1
  // useful in infinite collections

  // pseudo-collections: Option, Try
  def methodWhichCanReturnNull(): String = "Hello Scala"
  if (methodWhichCanReturnNull() == null) {
    // defensive code against null. In Scala we don't have to do this
  }

  val anOption = Option(methodWhichCanReturnNull())
  // option = collection which contains at most one element: Some(value) or None

  val stringProcessing = anOption match {
    case Some(string) => s"I have obtained a valid string: $string"
    case None => "I obtained nothing"
  } // see, no null-checks!

  def methodThrowsException(): String = throw new RuntimeException

  try {
    methodThrowsException()
  } catch {
    case e: Exception => "defend agains this evil exception"
  }

  val aTry = Try(methodThrowsException())
  // a try = "collection" with either a value if the code went well
  // or an exception if the code threw one

  val anotherStringProcessing = aTry match {
    case Success(validValue) => s"I have obtained a valid string: $validValue"
    case Failure(exception) => s"I have obtained an exception $exception"
  }

  // Asynchronous Programming
  val aFuture = Future {
    println("loading...")
    Thread.sleep(1000)
    println("I have computed a value")
    75
  }

  Thread.sleep(2000)
  println(aFuture) // may print Future(<not completed>)
  //  Normally we should expect to print: Future(Success(75))

  // future is a collection which contains a value when it's evaluated.
  // future is composable with map, flatMap and filter

  // IMPLICITS:

    // #1 IMPLICIT ARGUMENTS:
  def aMethodWithImplicitArgs(implicit arg: Int): Int = arg + 1
  def aMethodWithImplicitArgs2(implicit arg: String): String = arg + 1
  implicit val myImplicitInt: Int = 46
  implicit val myImplicitInt2: String = "46"

  println(aMethodWithImplicitArgs)
  println(aMethodWithImplicitArgs2)

    // #2 IMPLICIT CLASS
  implicit class MyRichInteger(n: Int) {
//      def isEven: Boolean = n % 2 == 0
      def isEven(): Boolean = n % 2 == 0
  }

//  println(23.isEven)
  println(23.isEven()) // compiler does this: new MyRichInteger(23).isEven()
}

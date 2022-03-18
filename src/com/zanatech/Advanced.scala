package com.zanatech

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
}

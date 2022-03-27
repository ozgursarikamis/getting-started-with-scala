package com {
  package zanatech {
    package entities {
      case class AnotherUser(f: String, l:String)
    }
  }
}

package main {

  import com.zanatech.entities.AnotherUser

  class Runner extends App {
    val u: AnotherUser = AnotherUser("Tim", "Cook")
  }
}
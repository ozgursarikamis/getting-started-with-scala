package com {
  package zanatech {
    package entites {
      case class AnotherUser(f: String, l:String)
    }
  }
}

package main {

  import com.zanatech.entites.AnotherUser

  class Runner extends App {
    val u: AnotherUser = AnotherUser("Tim", "Cook")
  }
}
package com.zanatech.entities

import java.util.UUID

case class User(var first: String, last: String) {
  val userId: UUID = UUID.randomUUID()
  
  def getUserId: String = userId.toString
}


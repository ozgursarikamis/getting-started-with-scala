package com.zanatech.entities

case class Transaction(user: User) {
  val userId: String = User("Amy", "Jones").getUserId
  val total: Int = sum(3, 5)
}

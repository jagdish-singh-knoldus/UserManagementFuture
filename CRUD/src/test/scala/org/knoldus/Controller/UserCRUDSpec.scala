package org.knoldus.Controller

import org.knoldus.Modal.User
import org.scalatest.flatspec.AnyFlatSpec

class UserCRUDSpec extends AnyFlatSpec with UserCRUD {
  val user=new User("test user type","test name","test username")

  "insertion" should "be done for user" in{
    val userRes=create(user)
    assert(users(0).getUsername=="test username")
  }

  "all user" should "be printed for user" in{
    val user=listAllUsers
    assert(users(0).getUsername=="test username")
  }

  "username" should "be updated for admin" in{
    val user=updateUsername(0,"admin")
    assert(users(0).getUsername=="admin")
  }
  "deletion" should "be for users" in{
    val user=delete(0)
    assert(users.isEmpty)
  }
}
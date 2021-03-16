package org.knoldus.Modal
import org.scalatest.flatspec.AnyFlatSpec

class UserSpec extends AnyFlatSpec{
  val user=new User("test user type","test name","test username")

  "user type" should "be found for user"in{
    val userType=user.getUserType
    assert(userType=="test user type")
  }
  "name" should "be found for user"in{
    val name=user.getName
    assert(name=="test name")
  }
  "username" should "be found for user"in{
    val username=user.getUsername
    assert(username=="test username")
  }

  "user details" should "be found for user"in{
    val name=user.toString
    assert(name.contains("test user type"))
  }
}
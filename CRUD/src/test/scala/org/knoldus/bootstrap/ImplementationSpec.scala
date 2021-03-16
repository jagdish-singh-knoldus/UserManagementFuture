package org.knoldus.bootstrap
import org.knoldus.Controller.UserCRUD
import org.mockito.Mockito.when
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatestplus.mockito.MockitoSugar.mock

import java.io.ByteArrayInputStream
import scala.io.StdIn
class ImplementationSpec extends AnyFlatSpec with UserCRUD{

 "print" should "success"in{
  val r=Implementation.insert
  assert(users.isEmpty)
}
  "invalid delete" should "not be executed"in{
    val r=Implementation.deleteCustomer(0)
    assert(users.isEmpty)
  }
  "Valid delete" should "be executed"in{
    val r=Implementation.deleteCustomer(1)
    assert(users.isEmpty)
  }

  "input for username" should "be taken from user"in{
    val in = new ByteArrayInputStream(("abc").getBytes)
    Console.withIn(in)  {
      assert(Implementation.inputString=="abc")
    }
  }
  "input for deletion index" should "be taken from user"in{
    val in = new ByteArrayInputStream(("2").getBytes)
    Console.withIn(in)  {
      assert(Implementation.inputInt.toInt==2)
    }
  }
}
package org.knoldus.bootstrap

import org.knoldus.Controller.UserCRUD
import org.knoldus.Modal.User

import scala.concurrent.Await
import scala.concurrent.duration.Duration
import scala.io.StdIn.{readInt, readLine}
import scala.concurrent.ExecutionContext.Implicits._

object Implementation extends UserCRUD {

  def inputString: String = {
    print("Enter username to be updated for the admin : ")
    readLine()
  }

  def inputInt: Int = {
    print("Enter index of customer to be deleted: ")
    readInt()
  }
  
  def insert: Unit ={
    create(new User("admin", "admin name", "username"))
    create(new User("customer", "customer1", "customerUser1"))
    create(new User("customer", "customer2", "customerUser2"))
    create(new User("customer", "customer3", "customerUser3"))
    create(new User("customer", "customer4", "customerUser4"))
    create(new User("customer", "customer5", "customerUser5"))
    Await.result(listAllUsers.map(l => println(l.mkString("\n"))), Duration.Inf)
  }

  def deleteCustomer(deleteIndex:Int): Unit ={
    if (deleteIndex == 0)
      println("selected user is not customer!")
    else {
      delete(deleteIndex)
      Await.result(listAllUsers.map(l => println(l.mkString("\n"))), Duration.Inf)
    }
  }

  def main(args: Array[String]): Unit = {
    insert
    updateUsername(0, inputString)
    deleteCustomer(inputInt)
  }
}

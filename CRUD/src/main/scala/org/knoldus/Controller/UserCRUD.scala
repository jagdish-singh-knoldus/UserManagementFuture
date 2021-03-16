package org.knoldus.Controller

import org.knoldus.Modal.User

import scala.collection.mutable.ListBuffer
import scala.concurrent.Future
import scala.concurrent._, duration._, ExecutionContext.Implicits._
trait UserCRUD {
  /**
   * mutable ListBuffer to store users
   */
  var users: ListBuffer[User] = new ListBuffer[User]

  def listAllUsers: Future[ListBuffer[User]] = Future(users)

  /**
   * function to inserts user in ListBuffer
   * @param user
   * @return Future[ListBuffer[User]]
   */
  def create(user: User): Future[ListBuffer[User]] ={
    users+=user
    Future.successful(users)
  }

  /**
   * function to update username of admin
   * @param index
   * @param userName
   * @return Future[ListBuffer[User]]
   */
  def updateUsername(index: Int, userName: String): Future[ListBuffer[User]] = {
    users.update(index, new User(users(index).getUserType, users(index).getName, userName))
    Await.result(listAllUsers.map(l => println(l.mkString("\n"))), Duration.Inf)
    Future.successful(users)
  }

  /**
   * function to delete customer
   * @param index
   * @return Future[ListBuffer[User]]
   */
  def delete(index: Int): Future[ListBuffer[User]] = {
    users.remove(index)
    Future.successful(users)
  }
}
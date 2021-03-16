package org.knoldus.Modal

class User(private  val userType:String,private  val  name:String,private  val  username: String) {
  /**
   * function to get usertype i.e. admin or customer
   * @return
   */
  def getUserType:String ={
    this.userType
  }

  /**
   * function to get name of user
   * @return
   */
  def getName: String ={
    this.name
  }

  /**
   * function to get username of user
   * @return
   */
  def getUsername: String ={
    this.username
  }

  /**
   * function to print object as user details
   * @return
   */
  override def toString = s"UserType: ${getUserType}, Name: ${getName}, Username: ${getUsername}"
}
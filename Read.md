#User Management System
##Introduction
This project is used to create, get, update, and delete user details in SBT using Scala programming Language.

##Technology
User, UserCRUD and Implementation is implemented in Scala programming language.

##Requirements
Java 11
Scala 2.13.5
sbt 1.4.7
Commands
###clean

This command cleans the sbt project by deleting the target directory. The command output relevant messages.
````
sbt clean
````
###compile This command compiles the scala source classes of the sbt project.
````
sbt compile
````
###Run Enter the project folder and type project module name along with the sbt run command:
````
sbt "project crud" run
````
More details about project (e.g. version etc..) can be found in file build.sbt

### Tests

Code is developed by applying [TDD](https://en.wikipedia.org/wiki/Test-driven_development) and tests are located in
folder **/src/test/scala-2.13**,  For running all tests enter the project folder and type:

 ```
 sbt test
 ```

### Coverage

scoverage plugin is used in the code for checking code coverage. Code coverage is 82.69%


 ```
 sbt clean coverage test coverageReport
 ```


## Library dependencies

* scalatest - test driven development
* scoverage(plugin)

More details about project libraraies (e.g. version etc..) can be found in file **build.sbt**


##Functionality
create user
This functionality stores user details in the ListBuffer

e.g.
````
create(new User("customer", "customer1", "customerUser1"))
````
list users
This functionality prints details of all the users from the ListBuffer

e.g.
````
UserType: customer, Name: customer1, Username: customerUser1 . . ...........
````
update admin username
This functionality updates the username of admin in the ListBuffer

e.g.
````
updateUsername(index, "new username")
````
delete customer
This functionality deletes the customer details from the ListBuffer

e.g.
````
deleteCustomer(index)
````
A number of samples is given in test file are:
* ImplementationSpec
* UserCRUDSpec
* UserSpec

Source files that are implementing this functionality are:

* User
* UserCRUD
* Implementation

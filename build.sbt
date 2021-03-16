name := "UserManagementSystemFuture"

version := "0.1"

scalaVersion := "2.13.5"

lazy val crud = (project in file("CRUD")).settings(
  libraryDependencies ++= Seq("org.scalatest" %% "scalatest-flatspec" % "3.2.2" % "test",
    "org.scalatestplus" %% "mockito-3-4" % "3.2.5.0" % "test"
  )
)

coverageExcludedPackages := "*Implementation.scala"
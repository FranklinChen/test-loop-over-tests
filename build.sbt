name := "test-loop-over-tests"

organization := "com.franklinchen"

organizationHomepage := Some(url("http://franklinchen.com/"))

homepage := Some(url("http://github.com/FranklinChen/test-loop-over-tests"))

startYear := Some(2013)

description := "Demonstrate generating tests in Scala"

version := "1.0.1"

scalaVersion := "2.10.3"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.0.1-SNAP4" % "test",
  "org.specs2" %% "specs2" % "2.3.7" % "test"
)

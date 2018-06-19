name := "test-loop-over-tests"

organization := "com.franklinchen"

organizationHomepage := Some(url("http://franklinchen.com/"))

homepage := Some(url("http://github.com/FranklinChen/test-loop-over-tests"))

startYear := Some(2013)

description := "Demonstrate generating tests in Scala"

version := "1.0.0"

scalaVersion := "2.12.6"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.5" % Test,
  "org.specs2" %% "specs2-core" % "4.3.0" % Test
)

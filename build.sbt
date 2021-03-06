name := "test-loop-over-tests"

organization := "com.franklinchen"

organizationHomepage := Some(url("http://franklinchen.com/"))

homepage := Some(url("http://github.com/FranklinChen/test-loop-over-tests"))

startYear := Some(2013)

description := "Demonstrate generating tests in Scala"

version := "1.0.0"

scalaVersion := "2.13.2"

scalacOptions += "-deprecation"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.1.2" % Test,
  "org.specs2" %% "specs2-core" % "4.9.4" % Test
)

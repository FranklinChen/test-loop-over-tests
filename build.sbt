name := "test-loop-over-tests"

organization := "com.franklinchen"

version := "1.0.0"

scalaVersion := "2.10.1"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.0.M5b" % "test",
  "org.specs2" %% "specs2" % "1.14" % "test"
)

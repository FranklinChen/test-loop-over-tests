ThisBuild / scalaVersion := "3.1.1"
ThisBuild / githubWorkflowPublishTargetBranches := Seq()

lazy val root = (project in file("."))
  .settings(
    name := "test-loop-over-tests",
    organization := "com.franklinchen",
    organizationHomepage := Some(url("https://franklinchen.com/")),
    homepage := Some(url("https://github.com/FranklinChen/test-loop-over-tests")),
    startYear := Some(2013),
    description := "Demonstrate generating tests in Scala",
    version := "1.0.0",
    crossScalaVersions := List("2.12.15", "2.13.8", "3.1.1"),
    scalacOptions ++= Seq(
      "-deprecation",
      "-feature"
    ),
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.2.11" % Test,
      "org.specs2" %% "specs2-core" % "5.0.0" % Test
    )
  )

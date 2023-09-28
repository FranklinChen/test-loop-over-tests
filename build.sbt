ThisBuild / scalaVersion := "3.3.1"
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
    crossScalaVersions := List("3.3.1"),
    scalacOptions ++= Seq(
      "-deprecation",
      "-feature"
    ),
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.2.17" % Test,
      "org.specs2" %% "specs2-core" % "5.3.2" % Test
    )
  )

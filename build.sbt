course := "reactive"
assignment := "protocols"

testFrameworks += new TestFramework("munit.Framework")
Test / parallelExecution := false

val akkaVersion = "2.6.9"

scalaVersion := "2.13.5"
scalacOptions ++= Seq(
  "-feature",
  "-deprecation",
  "-encoding", "UTF-8",
  "-unchecked",
  "-Xlint",
)

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor-typed" % akkaVersion,
  "com.typesafe.akka" %% "akka-actor-testkit-typed" % akkaVersion % Test,
  "org.scalacheck" %% "scalacheck" % "1.14.0" % Test,
  "org.scalameta" %% "munit" % "0.7.22" % Test
)

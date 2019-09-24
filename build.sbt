ThisBuild / scalaVersion := "2.12.7"

val bonesVersion = "0.5.0-SNAPSHOT"

lazy val hello = (project in file("."))
  .settings(
    name := "Bones: ScalaPB Integration Test",
    organization := "com.github.oletraveler",
    scalaVersion := "2.12.9", //TODO: cross compile 2.12 and 2.13
    version      := bonesVersion,
    libraryDependencies ++= Seq(
      "com.github.oletraveler" %% "bones-protobuf" % bonesVersion,
      "com.google.protobuf" % "protobuf-java" % "3.9.1",
      "com.github.oletraveler" %% "bones-test-schemas" % bonesVersion % Test,
      "org.scalacheck" %% "scalacheck" % "1.14.0" % Test,
      "org.scalatest" %% "scalatest" % "3.0.8" % Test
    )
  )




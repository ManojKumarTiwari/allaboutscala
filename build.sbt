name := "allaboutscala"

version := "0.1"

scalaVersion := "2.12.8"

libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.2.3"
libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging" % "3.9.2"
libraryDependencies ++= Seq(
  "joda-time" % "joda-time" % "2.9.3",
  "org.joda" % "joda-convert" % "1.8"
)
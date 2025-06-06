name := "13-MiscDemo"
organization := "mraza"
version := "0.1"
scalaVersion := "2.13.10"

autoScalaLibrary := false
val sparkVersion = "3.5.0"

val sparkDependencies = Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion
)

libraryDependencies ++= sparkDependencies

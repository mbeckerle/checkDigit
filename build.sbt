name := "dfdl-checkDigit"

organization := "com.owlcyberdefense"

version := "1.0.0"

scalaVersion := "2.12.14"

libraryDependencies ++= Seq(
  "org.apache.daffodil" %% "daffodil-tdml-processor" % "3.1.0" % "test",
  "com.novocode" % "junit-interface" % "0.11" % "test",
  "junit" % "junit" % "4.12" % "test",
)

testOptions += Tests.Argument(TestFrameworks.JUnit, "-v")

crossPaths := false

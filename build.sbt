enablePlugins(ScalaJSPlugin)	

name := "Scala.js Site"

scalaVersion := "2.11.8"

libraryDependencies += "org.scalatest" %%% "scalatest" % "3.0.0" % "test"
libraryDependencies += "be.doeraene" %%% "scalajs-jquery" % "0.9.0"
libraryDependencies += "org.scala-lang.modules" % "scala-xml_2.11" % "1.0.6"
libraryDependencies += "com.lihaoyi" %%% "scalatags" % "0.6.0"


skip in packageJSDependencies := false
jsDependencies += "org.webjars" % "jquery" % "2.1.4" / "2.1.4/jquery.js"
jsDependencies += RuntimeDOM
logBuffered in Test := false
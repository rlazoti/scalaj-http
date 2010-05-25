import sbt._
import sbt.Process._

class FoursquareProject(info: ProjectInfo) extends DefaultProject(info) {
  
  val commonsCodec = "commons-codec" % "commons-codec" % "1.3" % "compile" withSources()
  val specs  = "org.scala-tools.testing" % "specs" % "1.6.2.1"  % "test" withSources()
}
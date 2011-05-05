import sbt._
 
class Plugins(info: ProjectInfo) extends PluginDefinition(info) {
//  val akkaRepo = "Akka Repo" at "http://akka.io/repository"
//  val akkaPlugin = "se.scalablesolutions.akka" % "akka-sbt-plugin" % "1.0"
  
  val sbtIdeaRepo = "sbt-idea-repo" at "http://mpeltonen.github.com/maven/"
  val sbtIdea = "com.github.mpeltonen" % "sbt-idea-plugin" % "0.3.0"

  val retronymSnapshotRepo = "retronym's repo" at "http://retronym.github.com/repo/releases"
  val onejarSBT = "com.github.retronym" % "sbt-onejar" % "0.2"

}

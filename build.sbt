import com.twitter.sbt._

seq(StandardProject.newSettings: _*)

organization := "com.example"

name := "bitshow"

packageDistZipName := "bitshow.zip"

mainClass in Compile := Some("bitshow.Server")

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.9.0-1"

libraryDependencies ++= Seq(
   "net.databinder" %% "unfiltered-filter" % "0.4.1",
   "net.databinder" %% "unfiltered-jetty" % "0.4.1",
   "net.databinder" %% "unfiltered-json" % "0.4.1",
   "net.databinder" %% "unfiltered-uploads" % "0.4.1",
   "org.clapper" %% "avsl" % "0.3.3",
   "org.processing" % "core" % "1.1",
   "com.mongodb.casbah" %% "casbah" % "2.2.0-SNAPSHOT",
   "org.cloudfoundry" % "cloudfoundry-runtime" % "0.8.1"
)

resolvers ++= Seq(
  "java m2" at "http://download.java.net/maven/2",
  "tech" at "http://databinder.net/repo/",
  "scala snapshots" at "http://oss.sonatype.org/content/repositories/snapshots",
  "Spring milestone repository" at "http://maven.springframework.org/milestone"
)

EclipseKeys.withSource := true

EclipseKeys.createSrc := EclipseCreateSrc.Default + EclipseCreateSrc.Resource
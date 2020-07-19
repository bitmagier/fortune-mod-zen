import java.io._

import org.apache.commons.io.FileUtils

import scala.io.{BufferedSource, Source}
import scala.sys.process._

class ModBuilder {

  def getTxtFiles (path: File): Array[File] = {
    path.listFiles ().flatMap {
      case f: File if f.isDirectory => getTxtFiles (f)
      case f: File if f.getName.endsWith (".txt") => List (f)
      case _ => List ()
    }
  }

  def callStrFile (path: String) {
    val pathAbs = new File(path).getAbsolutePath
    import scala.sys.process._
    new File (path).listFiles().filter (!_.getName.endsWith (".dat")).foreach ((e) => {
      val datFileName = e.getName + ".dat"

      val cmd = "strfile \"" + pathAbs + "/" + e.getName + "\" \"" + pathAbs + "/" + datFileName + "\""
      println(cmd)
      cmd.!!
    })
  }

  def buildMods (sourcePath: String, outPath: String):Unit = {
    buildMod (new File(sourcePath), outPath)
  }

  private def buildMod (path: File, outPath: String):Unit = {
    val txtFiles = getTxtFiles (path)
    if (txtFiles.length > 0) {
      val modName = "Zen"
      val outFile = new File (outPath + "/" + modName)
      println ("creating " + outFile)

      var out: PrintWriter = null
      try {
        out = new PrintWriter(new FileWriter(outFile))
        for (file <- txtFiles) {
          var source: BufferedSource = null
          try {
            source = Source.fromFile(file)
            out.write((source.getLines() ++ "%").mkString("\n"))
          } finally {
            if (source != null) source.close()
          }
        }
      } finally {
        if (out != null) out.close ()
      }
    }
  }
}

object ModBuilder {
  def main(args: Array[String]) {
    val txtPath = "src/main/resources/txt"
    val modPath = "mod"

    new File (modPath).mkdir()
    FileUtils.cleanDirectory(new File (modPath))

    new ModBuilder().buildMods(txtPath, modPath)
    
    println

    val modFiles = new File(modPath).listFiles.filter(_.isFile).toList
    for (f <- modFiles) {
      s"/usr/bin/strfile $f" !
    }
  }
}
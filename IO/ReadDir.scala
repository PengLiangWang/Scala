import java.io._
import scala.reflect.io.Directory

object ReadDir{
    def main(args:Array[String]): Unit = {
         for(d <- subDir(new File("./a")))   
             println(d)
 
         println("**************")
         for(d <- subDirandFile(new File("./a")))
             println(d)
     }
    
     //遍历目录下的所有子目录
     def subDir(dir: File): Iterator[File] = {
          val children = dir.listFiles().filter(_.isDirectory())   
          children.toIterator ++ children.toIterator.flatMap(subDir _)
      }

      //遍历目录下的所有文件
      def subDirandFile(dir: File): Iterator[File] = {
          val dirs = dir.listFiles().filter(_.isDirectory())   
          val files = dir.listFiles().filter(_.isFile())
          files.toIterator ++ dirs.toIterator.flatMap(subDir _)
              
      }
}

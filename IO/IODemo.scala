import scala.io.Source


object IODemo{
    def main(args: Array[String]){
        val fileName="./test.txt"

        readAndPrint(fileName)
    }

    def readAndPrint(fileName: String){
        val source = Source.fromFile(fileName)    
        val lineIterator = source.getLines()
        for(l <- lineIterator){
            println(l)    
        }
    }
}

import java.io._


object FileTest{
    def main(args: Array[String]){
        val writer = new PrintWriter(new File("test.txt"))    

        println("请输入: ")
        val line = Console.readLine
        println("你输入了: "+ line)

        writer.write(line)
        writer.close()
    }
    
}

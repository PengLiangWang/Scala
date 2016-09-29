import java.io._


object FileTest{
    def main(args: Array[String]){
    //    val writer = new PrintWriter(new File("test.txt"))
   //     writer.write("slow bird")

        val writer = new PrintWriter("test.txt")
        for(i <- 1 to 100)
            writer.println(i)
        writer.close()
    }
}

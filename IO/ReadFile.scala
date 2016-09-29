import scala.io.Source

object ReadFile{
    def main(args: Array[String]) {
        print("请输入菜鸟教程官网 : " )
        val line = Console.readLine
        println("谢谢，你输入的是: " + line)
        val age = readInt()
        println("age: " + age)


        println("文件内容为:" )
        Source.fromFile("test.txt" ).foreach{ 
                print 
            }

    }
}

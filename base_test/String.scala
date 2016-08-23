object String{
    val greeting: String = "Hello, World!"

    def main(args: Array[String]){
         println(greeting);   
         val buf = new StringBuilder;    //虽然是val,仍可以修改
         buf += 'a'
         buf ++= "bedfg"
         println(buf.toString())

         /*字符串长度*/
         var Len: Int = greeting.length()
         println("Len: " + Len);


         /*字符串连接*/
         println(greeting + buf.toString)
         println(greeting.concat(buf.toString))

         
         /*可以调用printf格式化字符串*/
         var floatvar = 12.456
         var intvar = 10
         var stringvar = "Hello"
         var fs = printf("浮点数: %f, " + "整型数: %d, 字符串: " + " %s", floatvar, intvar, stringvar)
         println(fs)

         /*返回指定位置的字符*/
         var AtString: Char = greeting.charAt(5)
         println(AtString)

         /*返回字符串的哈希码*/
         var hash: Int = greeting.hashCode()
         println(hash)

         var string: String = "   hello    "
         var string1: String = string.trim()
         println("string: "+ string)
         println("string1: "+ string1)
    }
}

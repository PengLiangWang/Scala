
object MatchArray{
    def main(args: Array[String]){
         val arr = Array(0, 1, 2, 3)
        
         for(ary <- arr)
             println(ary)

         arr match{
             case Array(0) => println(0)    //匹配只包含一个0的数组
             case Array(x, y) => printf("x = %d, y = %d\n", x, y)
             case Array(0, _*) => println("0 ...")
             case _ =>println("something else")
             
         }
    }    
}

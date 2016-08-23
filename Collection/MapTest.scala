object MapTest{
   var A:Map[Char, Int] = Map()
   A += ('I' -> 1)
   A += ('J' -> 3)
   A += ('K' -> 4)
   A += ('L' -> 5)
   var colors = Map("red" -> "#FF0000", "azure" -> "#F0FFFF", "peru" -> "#CD853F")
   var nums:Map[Int, Int] = Map()

   def main(args: Array[String]){
         println(A('I')) 
         println(colors("red"))

         println("colors中的键值: " + colors.keys)
         println("colors中的value值: " + colors.values)
         println(colors.isEmpty)
         println(nums.isEmpty)


         /*循环输出 Map中的key和value */
         colors.keys.foreach{ i => print("Key = " + i)
                                   println(" value = " + colors(i))}


         if(colors.contains("red"))
             println("red 建存在, 对应值为: " + colors("red"))

         println(colors.get("red"))
   }
    
}

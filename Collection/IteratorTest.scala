/* Scala Iterator（迭代器）不是一个集合，它是一种用于访问集合的方法, 迭代器 it 的两个基本操作是 next 和 hasNext*/
object IteratorTest{
     def main(args: Array[String]){
         val it = Iterator("Baidu", "Google", "Runoob", "Taobao")

        /* 迭代器转换为列表
         val toarray = it.toList
         println(toarray)
         */
         //println(it.length)            //做过计算之后, 后面就为空了
         if(it.hasNext)
         {
             println("存在数据")    
         }
         else
             println("不存在数据")

         //println(it.size)
         while(it.hasNext)
             println(it.next())

     }    

}

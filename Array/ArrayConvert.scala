import scala.collection.mutable.ArrayBuffer

object ArrayConvert{
    def main(args: Array[String]){
        val a = Array(-1,2,3,5,-2,7,11,-3)
        val result = for(elem <- a ) yield 2*elem
        for(b <- result)
            println(b)


        println("************************")
        val result2=for(elem <- a if elem % 2 == 0) yield 2*elem
        for(c <- result2)
            println(c)


        println("**********给定一个整数数组,移除除第一个负数以为的所有负数**************")
        var first = true;
        val index = for(i <- 0 until a.length if first || a(i) >= 0) yield {if(a(i) < 0) first = false; i}    //拿到符合条件的下标
        for(d <- index)
            println(d)  
        println("或者");
        for(x <- 0 until index.length)
            println(index(x))


          println("**********************")
         //然后将元素移动到该去的位置, 并切断尾端
         for(j <- 0 until index.length) a(j) = a(index(j))

         val n = a.toBuffer
         n.trimEnd(a.length - index.length)    //数组缓冲才可以用trimEnd, 删除后面的几个元素

         for(m <- n)
             println(m)
    }
}

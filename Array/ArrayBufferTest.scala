import scala.collection.mutable.ArrayBuffer

object ArrayBufferTest{
    def main(args: Array[String])    
    {
        val b = ArrayBuffer[Int]()   //一个空的数组缓冲区, 准备存放整数

        b += 1
        b += (1,2,3,5,6,7,8,3)
        println(b)
        
        b.trimEnd(2)  //移除后面两个元素
        println(b)

        b.insert(4, 9, 3)   //下面为4的前面， 插入9,3两个元素
        println(b)

        b.remove(2,3)   //从下标为2开始，移除3个元素
        println(b)

        val a = b.toArray   //转换为Array类型
        for(i <- a)
            println("i = " + i)

    }
    
}

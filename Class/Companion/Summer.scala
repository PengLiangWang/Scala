import scala.collection.mutable.Map 

class ChecksumAccumulator { 
    private var sum = 0 
    def add(b: Byte) { 
         sum += b 
    } 
    def checksum(): Int = ~(sum & 0xFF) + 1 
}

object ChecksumAccumulator { 
    private val cache = Map[String, Int]() 
        def calculate(s: String): Int = 
               if (cache.contains(s)) 
                  cache(s)       
               else{ 
                   val acc = new ChecksumAccumulator 
                   for (c <- s) acc.add(c.toByte)              //不用看到返回值 sum 即可直接调用计算 checksum 
                   val cs = acc.checksum() 
                   cache += (s -> cs)  //结果放到映射中 
                   cs 
               } 
}

object Summer { 
    def main(args: Array[String]) { 
        println(ChecksumAccumulator.calculate("Hello Scala!"))
    }
}

//拉链操作
object ZipTest{
    def main(args: Array[String]){
        val symbols = Array("<", "-", ">") 
        val counts = Array(2,10,2)
        val pairs = symbols.zip(counts)

        for((k,v) <- pairs) printf("k: %s, v: %d\n", k, v)

        //toMap 对偶集合转换成映射
        val tMap = pairs.toMap
   //     val tMap = pairs.toList
        println(tMap)



        val prices = List(5.0, 2.0, 9.95)
        val quantities = List(10, 2, 1)

        val list  = prices zip quantities
        println(list);

        //val list2 = list.map(p=>p._1*p._2)
        val list2 = (prices zip quantities) map (p=>p._1*p._2)
        println(list2)
      
        val listSum = ((prices zip quantities) map (p=>p._1*p._2)).sum
        println(listSum)
    }
    
}

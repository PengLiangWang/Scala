object MapTest{
    def main(args: Array[String]){
        //构造不可变Map
        val scores = Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)    
        println("Bob -> "+ scores("Bob"))
        //scores("Bob") = 20    不可修改


        
        //构造可变Map
        val scores1 = scala.collection.mutable.Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8);
        println("Alice -> " + scores1("Alice"))
        scores1("Alice") = 30
        println("修改后的 Alice -> "+ scores1("Alice"))


        //构造空映射
        var scores2:Map[String, Int] = Map()
        scores2 += ("Cindy" -> 8, "Fred" -> 7)
        println("Cindy -> "+ scores2("Cindy"))
        //scores2("Cindy") = 80   //只可添加不可修改

        
        //getOrElse，如果存在则打印对应的值, 如果不存在打印0
        println(scores1.getOrElse("Bob", 0))
        println(scores1.getOrElse("Alex", 0))

         
        for(k <- scores2.keys) println("keys: " + k)
        for(v <- scores2.values) println("values: " + v)
        for((k,v) <- scores2) printf("key: %s, value: %d\n",k, v) 
           
        
        //排序
        val scores3 = scala.collection.immutable.SortedMap("Alice" -> 10, "Fred" -> 7, "Bob" -> 3, "Cindy" -> 8)
        println(scores3)

    }    
    
}

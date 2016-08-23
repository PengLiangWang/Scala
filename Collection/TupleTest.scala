/*与列表一样，元组也是不可变的，但与列表不同的是元组可以包含不同类型的元素*/
object TupleTest{
    val t = (1, 3.14, "Fred")    
    val t1 = new Tuple3(1, 3.14, "Fred")

    def main(args: Array[String]){
        println(t1._3)
        t.productIterator.foreach{ i =>println("Value = " + i)}
    }

}

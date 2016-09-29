object ZipTest{
    def main(args: Array[String]){
        val symbols = Array("<", "-", ">") 
        val counts = Array(2,10,2)
        val pairs = symbols.zip(counts)

        for((k,v) <- pairs) printf("k: %s, v: %d\n", k, v)

        //toMap 对偶集合转换成映射
        val tMap = pairs.toMap
        println(tMap)
    }
    
}

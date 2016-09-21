object UntilTest{
    def main(args: Array[String]){
        val s = Array(1,2,3,4,5,6)

        for (i <- 0 until s.length)
            printf("s(%d) = %d\n",i ,s(i))

        println("****************************")
        for(i <- s)
            println(i)

        println("******每两个元素一跳*******")
        for (i <- 0 until (s.length, 2))
            printf("s(%d) = %d\n",i ,s(i))

        println("******反转遍历*******")
        for (i <- (0 until s.length).reverse)
            printf("s(%d) = %d\n",i ,s(i))
    }    
}

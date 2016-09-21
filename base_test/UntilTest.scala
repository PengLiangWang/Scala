object UntilTest{
    def main(args: Array[String]){
        val s = "hello"
        var sum = 0

        for (i<-0 to s.length-1)
            printf("s(%d) =  %c\n", i,  s(i))

        for (ch <- "hello")
            println("ch = " + ch)

        for (i <- 0 until s.length)
            printf("s(%d) =  %c\n", i,  s(i))
    }    
}

object factorial{
    def main(args: Array[String])
    {
        for(i <- 1 to 20)    
            println(i + "的阶乘为: " + fact(i));
    }
    def fact(n: BigInt) : BigInt = {
        if(n < 1)
            1
        else
            n * fact(n-1)
    }
}

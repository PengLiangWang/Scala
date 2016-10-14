class HandleValue(a: Int, b: Int, c: Int){
    def calculate(fun: (Int, Int, Int) => Int)={
        fun(a,b,c);
    }
}



object SumHigherFun extends App{
    
    def sum(a: Int, b: Int, c: Int) = a+b+c
    def dec(a: Int, b: Int, c: Int) = a-b-c


    val v = new HandleValue(1,2,3);
    println("a + b + c = " + v.calculate(sum))
}

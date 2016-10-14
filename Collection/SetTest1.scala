//没看明白Set(n) 怎么回事

object SetTest1{
    def digits(n: Int): Set[Int] ={
        if(n<0) digits(-n)
        //else if (n<10) Set(n)   //原始被访问到的顺序应该是 5 1 6 2 3 4
        else if (n<10) scala.collection.immutable.SortedSet(n)    //可以顺序访问1 2 3 4 5 6
        else digits(n/10)+(n%10)
    } 

    def main(args: Array[String]){
        var set = digits(123456)        
        println(set)
        var set1 = set - 2
        println(set1)
        println(set.min)
        println(set.head)
        println(set.exists(_ % 2 == 0))
           
    }

}

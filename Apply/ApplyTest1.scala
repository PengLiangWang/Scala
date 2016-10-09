//伴生对象
class Fraction(n: Int, d: Int){
      val m = n + d
}

object Fraction{  //伴生对象的apply方法
    def apply(n: Int, d: Int) = new Fraction(n ,d)    
}

object ApplyTest1{
    def main(args: Array[String]){
        val result1 = Fraction(2,4)
        val result2 = Fraction(3,5)
        println(result1.m * result2.m)
    }
}

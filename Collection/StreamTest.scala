//流方法是懒值， 仅当结果被需要的时候才计算
import scala.io._
import scala.math._
object StreamTest extends App{ 

    def numsFrom(n: BigInt): Stream[BigInt] = n #:: numsFrom(n+1)        //#:: 构造出来一个流, 尾部被懒计算的不可变列表
    val tenOrMore = numsFrom(10)
    println(tenOrMore)  //Stream(10, ?)
    println(tenOrMore.tail.tail)


    //
    val Squares = numsFrom(1).map(x=>x*x)
    println(Squares)
    println(Squares.take(5).force) //1到5的平方值

    //
    val words = Source.fromFile("./words").getLines.toStream
    println(words)
    println(words(0))
    println(words(1))
    println(words(2))
    println(words)        //流缓存了访问过的行， 允许重新访问

    //使用view，实现类似懒值的效果
    val powers = (0 until 100).view.map(pow(10,_))    
    println(powers(3))    //只有调用powers的时候， 才会执行 10 的 3 次方(其他的不会执行)


}

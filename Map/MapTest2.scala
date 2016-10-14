//折叠有时候可以作为循环的替代, 计算某个字符串中字母出现的频率
object MapTest2 extends App{
    val fred = scala.collection.mutable.Map[Char, Int]()

    for(c <- "Mississippi") fred(c) = fred.getOrElse(c, 0) + 1
    println(fred)
}

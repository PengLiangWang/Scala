/* 模式匹配 */
object MatchTest{
    def main(args: Array[String]){
        println(matchtest(1))
        println(matchtest(2))
        println(matchtest('t'))
    }    

    def matchtest(x: Any): Any = x match {
        case 1 => "one"
        case y: Int => "为Int类型"
        case _ => "default"
    }
}


/*如果值存在， Option[T] 就是一个 Some[T] ，如果不存在， Option[T] 就是对象 None  */
object OptionTest{
    def main(args: Array[String]){
        val sites = Map("runoob" -> "www.runoob.com", "google" -> "www.google.com")
         
        println("show(sites.get(\"runoob\")): " + show(sites.get("runoob")))
        println("show(sites.get(\"baidu\")): " + show(sites.get("baidu")))

    }

    def show(x: Option[String]) = x match{
          case Some(s) => s
          case None => "No Found"
    }
        
}

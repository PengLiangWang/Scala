//提取器
object ExtractorTest{
    def main(args: Array[String]) {

        println ("Apply 方法 : " + apply("Zara", "gmail.com"));
        println ("Unapply 方法 : " + unapply("Zara@gmail.com"));
        println ("Unapply 方法 : " + unapply("Zara Ali"));

        println(ExtractorTest("wpl","imobpay.com"))   //直接调用对象, 就调用了apply方法
        println(ExtractorTest.unapply("wpl@imobpay.com"))

        var x = "Alex@imobpay.com"
        x match
        {
            case ExtractorTest(y) => println(x + "=>" + y)   // 遇到匹配模式， 默认调用unapply 
        } 


    }
    // 注入方法 (可选)
    def apply(user: String, domain: String) = {
        user +"@"+ domain
    }

    // 提取方法（必选）
    def unapply(str: String): Option[(String, String)] = {
        val parts = str split "@"
            if (parts.length == 2){
                Some(parts(0), parts(1)) 
            }else{
                None
            }
    }
}


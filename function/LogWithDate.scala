//偏函数
import java.util.Date

object LogWithDate{
    def main(args: Array[String]){
         val date = new Date
         val LogWithDateBound = log(date, _:String)

         LogWithDateBound("message1")
         Thread.sleep(1000)    //毫秒
         LogWithDateBound("message2")
         Thread.sleep(1000)
         LogWithDateBound("message3")
    }    

    def log(date: Date, message: String){
        println(date + "------" + message);    
    }
} 


/*
偏函数：
val f: PartialFunction[Char, Int] = {case '+' => 1; case '-' => -1}
f('-') // 返回 -1
f.DefinedAt('0')   //没有匹配到， 返回 false
f('0')  //没有匹配到，抛异常
*/

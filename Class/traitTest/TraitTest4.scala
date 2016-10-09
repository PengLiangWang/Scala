import java.io._

class Account{
    var balance = 100.0    
}

trait Logger{
    def log(msg: String)
    def info(msg: String){log("INFO: " + msg)}
    def warn(msg: String){log("WARN: " + msg)}
}

trait FileLogger extends Logger{
    val filename: String
    lazy val out = new PrintStream(filename)   //PrintWriter
    def log(msg: String) {out.println(msg); out.flush()}    //out.flush()
}

abstract class SavingAccount extends Account with FileLogger{    //FileLogger里面有filename未初始化, 需要添加 abstract
    def draw(amount: Double){
        if(amount > balance) log("非法金额")
        else
        {}
    }    
}

object TraitTest4{
    def main(args: Array[String])    
    {
        val acct = new SavingAccount with FileLogger{   //执行顺序是超类Account, Logger第一个特质, FileLogger第二个特质, 最后才是SavingAccount, 调用draw时，才会调用log，然后才会调用out写到文件中(lazy，第一次使用时才会初始化)
            val filename="myapp.log"                    
        }
        acct.draw(102)

        /*
        // 如果特质 FileLogger中 out 不用 lazy
        val acct = new {   //new之前, 提前定义块儿
           val filename = "myapp.log" 
        } with SavingAccount with FileLogger
        acct.draw(102)
        */
    }
}

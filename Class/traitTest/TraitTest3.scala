/* 叠加在一起的特质 super*/
class Account{
   var balance = 100.0
}

trait Logged{
   def log(msg: String) {println(msg)}   //非抽象方法 
}

//日志中加日期
trait TimestamLogger extends Logged{
   override def log(msg: String){               //如果log为抽象方法, 需要添加 abstract override 才不会报错
       super.log(new java.util.Date() + " " + msg)    
   }    
}

//切断过去冗长的日子消息
trait ShortLogger extends Logged{
    val maxLength = 4;   //特质中的字段
    override def log(msg: String){
        super.log(if(msg.length <= maxLength) msg else msg.substring(0, maxLength-3) + ".......")
    }

}

class SavingsAccount extends Account with TimestamLogger{
       def draw(account: Double){
           if(account > balance) log("Error")  
           else
               println("True")
       } 
}

class ShortAccount extends Account with ShortLogger{
       def draw(account: Double){
           if(account > balance) log("Error")  
           else
               println("True")
       } 
}

object TraitTest3{
   def main(args: Array[String]){
       var acct = new SavingsAccount
       acct.draw(105)

       /* 注意执行顺序  特质从后向前执行*/
       var acct2 = new SavingsAccount with ShortLogger    //带特质的对象, 将特质 SavingsAccount 和 ShortAccount 合并使用了
       acct2.draw(107)

       var acct3 = new ShortAccount with TimestamLogger
       acct3.draw(108)
   }    
}

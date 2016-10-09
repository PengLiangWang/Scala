/* 带有特质的对象 */
class Account{
    var balance = 100.0    
}

trait Logger{
    def log(msg: String) {}    
}

trait ConsoleLogger extends Logger{
    override def log(msg: String) {println(msg)}    
}

trait FileLogger extends Logger{
    override def log(msg: String) {println("FileLogger")}    
}


class SavingsAccount extends Account with Logger{
    def withdraw(amount: Double)    
    {
        if(amount > balance)  log("Insufficient funds")    
        else{}
    }
}

object TraitObject{
    def main(args: Array[String])
    {
        var account = new SavingsAccount with ConsoleLogger
        account.withdraw(102.0)

        var account2 = new SavingsAccount with FileLogger
        account2.withdraw(103)
    }
} 


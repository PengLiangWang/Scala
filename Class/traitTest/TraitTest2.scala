/* 带有具体实现的特质 */
class Account{
    var balance = 100.0    
}

trait ConsoleLogger{
    def log(msg: String) {println(msg)}    
}

class SavingsAccount extends Account with ConsoleLogger{
    def withdraw(amount: Double){
        if(amount > balance) log("非法金额")    
        else 
        {
            balance -= amount 
            println(balance)
        }
    }    

}

object TraitTest2{
    def main(args: Array[String])
    {
        val account = new SavingsAccount
        account.withdraw(200.0)
        account.withdraw(90)

        val acct = new Account
        println(acct.balance)
    }
}

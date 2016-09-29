class Account private(val id: Int, InitialBlance: Double){
    private var Balance = InitialBlance
    def balance=Balance
}

object Account{
    def apply(InitialBlance: Double) = 
    new Account(newUniqueNumber(), InitialBlance)

    private var number = 0
    private def newUniqueNumber() = {number += 1; number}
}
object ApplyTest{
    def main(args: Array[String]){
         val acct = Account(100.00)    //调用apply方法
         println(acct.id)
         println(acct.balance)
    }  
}

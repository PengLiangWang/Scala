import scala.collection.mutable.ArrayBuffer

class NetWork{
    class Member(val name: String){
         val a = 2
         val contacts = new ArrayBuffer[Member]   
     }

     private val members = new ArrayBuffer[Member]

     def join(name: String) = {
         val m = new Member(name)
         members += m
         m
     }
} 


object NestTest{
    def main(args: Array[String]){
        val chatter = new NetWork
        val myFace = new NetWork

        val test = new chatter.Member("Alex")
        println(test.a)
        test.contacts += test
        for(i <- test.contacts)
            println(i)
        

        val fred = chatter.join("Fred")
        val wilma = chatter.join("Wilma")
        fred.contacts += wilma
        
        val barney = myFace.join("Barney")
       // fred.contacts += barney   报错, 不能将myFace.Member添加到chatter.Member 元素缓冲当中
    
    }

}

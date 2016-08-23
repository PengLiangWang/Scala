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

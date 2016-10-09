//控制抽象
object Controlabstract{
    
    def repeat(n: Int)(action: =>Unit) = for(i<- 1 to n) action
    
    def main(args: Array[String]){
        var i = 0;
        repeat(5){     //相当于调用 repeat(5)(i=i+1;println(i))
            i=i+1;
            println(i)    
        }
    }
}




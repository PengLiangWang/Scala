//将内容打印到盒子里面
object BoxText{
    def main(args: Array[String]){
        box("Hello")
        
    }   


    def box(s: String){
        var border = "-" * s.length + "--\n" 
        println(border + "|" + s + "|\n" + border)
    }
}

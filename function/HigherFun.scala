object HigherFun{
    def main(args: Array[String]){
        println(apply(layout, 10))    
    }    
    
    //函数 f 和 值 v 作为参数，而函数 f 又调用了参数 v
    def apply(f: Int => String, v: Int) = f(v)          //f是个函数, 函数layout按名称传递，然后将v传递给layout
    
    def layout[B](x: B) = "[" + x.toString + "]"
}

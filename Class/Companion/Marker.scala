/* 伴生对象 , 单例对象会在第一次被访问的时候初始化*/
//私有构造方法
class Marker private(val color: String){
    println("创建" + this)    
    override def toString(): String = "颜色标记: " + color
}

//伴生对象, 与类共享名字, 可以访问类的私有属性和方法
object Marker{
    
    private val markers: Map[String, Marker] = Map(
        "red" -> new Marker("red"),
        "blue" -> new Marker("blue"),
        "green" -> new Marker("green")
    )
    
    def apply(color: String) = {
        if(markers.contains(color)) markers(color) else null    
    }

    def getMarker(color: String) = {
        if(markers.contains(color)) markers(color) else null    
    }

    def main(args: Array[String]){
        println(Marker("red")) 

        //单例函数调用, 省略.符号 相当于println(Marker.getMarker("blue"))
        println(Marker getMarker "blue")
        println(Marker("green"))    //默认使用apply方法
    }
}

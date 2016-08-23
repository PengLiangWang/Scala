/* 类是对象的抽象，而对象是类的具体实例。类是抽象的，不占用内存，而对象是具体的，占用存储空间 
   new关键字来创建类的对象
*/
import java.io._

class Point(xc: Int, yc: Int){
    var x: Int = xc
    var y: Int = yc


    def move(dx: Int, dy: Int){
        x = x + dx
        y = y + dy
        println("x 的坐标: " + x);
        println("y 的坐标: " + y);
    }
    
}

object ClassTest{
    def main(args: Array[String]){
        val pt = new Point(10, 20);

        //移动到新的位置
        pt.move(10, 10)
    }
}
/*执行用scalac 先生成 .class文件, 再执行scala*/

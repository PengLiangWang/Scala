/*
Scala 继承
Scala继承一个基类跟Java很相似, 但我们需要注意一下几点：
    1、重写一个非抽象方法必须使用override修饰符。
    2、只有主构造函数才可以往基类的构造函数里写参数。
    3、在子类中重写超类的抽象方法时，你不需要使用override关键字。
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

class Location(val xc: Int, val yc: Int, val zc: Int) extends Point(xc, yc){
    var z: Int = zc

    /* 子类重写父类的方法 */
    def move(dx: Int, dy: Int, dz: Int){
        x = x + dx;
        y = y + dy;
        z = z + dz;
        
        println("x 的坐标: " + x);
        println("y 的坐标: " + y);
        println("z 的坐标: " + z);

    }    
}

object ExtendsTest{
    def main(args: Array[String]){
        val pt = new Location(10, 20, 30);

        //移动到新的位置
        pt.move(10, 10, 10)
    }
}

//对于类私有字段, Scala生成私有的getter和setter方法， 但对于对象私有的字段， Scala根本不会生成getter和setter
import scala.reflect.BeanProperty
class Person{
    private var privateage=0    //类私有字段
    val timeStamp = new java.util.Date    //val属性, 只能get, 不允许set
    @BeanProperty var name: String = _    //生成4个方法

    //get函数
    def age = privateage
    //set函数
    def age_=(newage: Int){
        if(newage > privateage) privateage = newage;    
    }


    //private[this] var value = 0   //对象私有字段(只能访问到当前对象的value字段)
    private var value = 0
    def increment() {value += 1}
    def current() = value
    def isLess(other: Person) = value < other.value

}

object SetGetClass{
    def main(args: Array[String]){
        val Fred = new Person
        
        //调用set函数 age_=
        Fred.age = 30
        Fred.age = 32
        println(Fred.age)
        Fred.age = 21
        println(Fred.age)

        println(Fred.timeStamp)

        
        Fred.increment()
        println(Fred.current)
        val Alex = new Person
        println(Alex.isLess(Fred))   //true

    } 
}

/* 没有静态成员、静态方法这一说，但是object可以做到类似效果, 伴生类和伴生对象私有属性和方法都可以互相访问*/
class University{
    val id = University.newStudenNo
    private var number = 0
    def aClass(number: Int){this.number += number}
}

object University{
    private var studentNo = 0
    def newStudenNo = {
        studentNo += 1
        studentNo
    }
    var Unit = new University
    def printt = Unit.number
}

object ObjecOps{
    def main(args: Array[String]): Unit = {
         println(University.newStudenNo)   //第一次调用时，初始化成员变量(val id = University.newStudenNo 会把studentNo初始化为 1) 
         println(University.newStudenNo) 

         println(University.printt)

         /* 无权限调用 
         var unit = new University
         println(unit.number)
         */
    }
}

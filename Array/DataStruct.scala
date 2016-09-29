import scala.collection.mutable.ArrayBuffer

object DataStruct{
    def main(args: Array[String]){
        val a = Array(1,7,2,9).sum
        println(a)

        val m = Array(1,7,2,9).min
        println(m)

        //排序
        val b = ArrayBuffer(1,7,2,9)
        val bSorted = b.sortWith(_<_)  //b没有被改变
        println(bSorted)

        val d = b.mkString(" and ")
        println(d)

        val e = b.mkString("<", ",", ">")
        println(e)
    }
}

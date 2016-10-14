//可变列表
object ListTest1 extends App{
    val lst = scala.collection.mutable.LinkedList(1,-2,7,-9)
    var cur = lst
    while(cur != Nil)
    {
        if(cur.elem<0) cur.elem = 0
        cur = cur.next 
    }
    println(lst)   //cur 和 lst 指向同一个地方
}


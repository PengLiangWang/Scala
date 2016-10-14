/*Set(集合)是没有重复的对象集合，所有的元素都是唯一的, Scala 集合分为可变的和不可变的集合
* 默认情况下，Scala 使用的是不可变集合，如果你想使用可变集合，需要引用 scala.collection.mutable.Set 包
*/
object SetTest{
   var set = Set(1, 2, 3) 
   //var set: Set[Int] = Set(1, 2, 3) 

   def main(args: Array[String]){
       println(set.getClass.getName)
       println(set.exists(_ % 2 == 0))   //指定条件的元素是否存在exists的参数是Int => Boolean类型, 返回Boolean类型
       println(set.drop(1))


       import scala.collection.mutable.Set
       val mutableSet = Set(1,2,3)
       println(mutableSet.getClass.getName)

       mutableSet.add(4)
       mutableSet.remove(1)
       mutableSet += 5
       mutableSet -= 2
       println(mutableSet)

       val another = mutableSet.toSet
       println(another.getClass.getName)
   }
}
/*
  虽然可变Set和不可变Set都有添加或删除元素的操作，但是有一个非常大的差别。对不可变Set进行操作，会产生一个新的set，原来的set并没有改变，这与List一样。 而对可变Set进行操作，改变的是该Set本身，与ListBuffer类似
*/

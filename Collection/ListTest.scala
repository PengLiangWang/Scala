/*列表是不可变的，值一旦被定义了就不能改变*/
object ListTest{
    //字符串列表
    val site1: List[String] = List("Runoob", "Google", "Baidu")
    val site2 = "Runoob" :: ("Google" :: ("Baidu" :: Nil))
    
     //整型列表
     val nums1: List[Int] = List(1, 2, 3, 4)
     val nums2 = 1 :: (2 :: (3 :: (4 :: Nil)))

     //二维列表
     val dim1: List[List[Int]] =
     List(
             List(1, 0, 0),
             List(0, 1, 0),
             List(0, 0, 1)
         )

     val dim2 = (1 :: (0 :: (0 :: Nil))) ::
                (0 :: (1 :: (0 :: Nil))) ::
                (0 :: (0 :: (1 :: Nil))) :: Nil


      val empty1: List[Nothing] = List()
      val empty2 = Nil

       def main(args: Array[String]){
            println(site1.head)    
            println(site1(1))
            println(dim1(1)(1))
       }
}

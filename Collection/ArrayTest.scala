import Array._

object ArrayTest{
     var x:Array[String] = new Array[String](3)
     var z = new Array[String](3)   //上面的简写数组的定义
    
     z(0) = "Runoob"; z(1) = "Baidu"; z(2) = "Google";
     var y = Array("Runoob", "Baidu", "Google")     //两种初始化方式

     def main(args: Array[String]){
         var myList = Array(1.9, 2.3, 3, 5);    

         for( x <- myList)
             println(x)

          var total = 0.0
          for(i <- 0 to (myList.length - 1))
              total += myList(i)
          println("total: " + total)

          var max = myList(0);
          for(i <- 1 to (myList.length - 1))
              if(max < myList(i)) max = myList(i);
          println("max :" + max)


          /*多维数组*/
          var myMatrix = ofDim[Int](3,3)
          for(i <- 0 to 2){
              for(j <- 0 to 2){
                  myMatrix(i)(j) = j
              }
          }

          for(i <- 0 to 2){
              for(j <- 0 to 2){
                  print(" " + myMatrix(i)(j))
              }
              println();
          }
          /* concat 可以合并两个数组 */
     }
}

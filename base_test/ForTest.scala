object ForTest{
      def main(args: Array[String]){
          for(i<- 1 to 3; j<- 1 to 3 if i != j)    
              println(10*i + j)

          println("*****************")
          for(i<- 1 to 3; from = 4 - i; j <- from to 3)    
              println(10*i + j)

          //如果for循环的循环体以yield开始, 会构造出一个集合
          val a = for(i<- 1 to 10) yield i % 3
          println(a)
          for(i <- a) print(i + " " )
          println("")

          
          //下面第一个for循环，第一个类型为String
          //第二个for循环, 第一个类型为Int型
          val b = for(c <- "hello"; j <- 0 to 1) yield (c+j).toChar
          println(b)

          val c = for(i <- 0 to 1; j <- "hello") yield (i+j).toChar
          println(c)
      }
}

object TwoArray{
    def main(args: Array[String]){
        val matrix = Array.ofDim[Int](3,4)   //三行,四列
   
        for(i <- 0 to 2){
            for(j <- 0 to 3){
                matrix(i)(j) = j
            }
        }
        for(i <- 0 to 2){
            for(j <- 0 to 3){
                print(matrix(i)(j)+" ")
            }
            println()
        }

        //创建不规则数组(待解释)
        val triangle = new Array[Array[Int]](10)
        for(i <- 0 until triangle.length)
            triangle(i) = new Array[Int](i+1)
    }

}

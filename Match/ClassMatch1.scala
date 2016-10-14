object ClassMatch1{
    def main(args: Array[String]){
      //  val amt = Dollar(29.95)
        val amt = Currency(29.95, "EUR")
        val price = amt.copy()   //创建一个与现有对象值相同的新对象
        val amt2 = amt.copy(unit = "CHF")   //带名的参数来修改某些属性

        amt2 match{
            //case Dollar(v) => println("$"+ v)
            case Currency(_, u) => println("oh, noes, I got " + u)
            case _ => println(" ")
        }

     }

     //密封类
     sealed abstract class Amount              //通用超类声明的时候添加sealed, 所有子类与该密封类必须在同一个文件当中
     case class Dollar(value: Double) extends Amount
     case class Currency(value: Double, unit: String) extends Amount
}


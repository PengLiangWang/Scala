class Person {
      var name = ""
      override def toString = getClass.getName + "[name=" + name + "]"
}

class Employee extends Person {
      var salary = 0.0
      override def toString = super.toString + "[salary=" + salary + "]"    //连接 父类字符串
}


//getClass.getName获取类名称
object OverrideT extends App {
      val per = new Person
      per.name = "person"
      println(per.toString)

      val fred = new Employee
      fred.name = "Fred"
      fred.salary = 50000
      println(fred)
}

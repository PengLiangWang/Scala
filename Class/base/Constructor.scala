//一个类，如果没有显示定义主构造器， 则自动拥有一个无参数的主构造器
/*
主构造函数(有参数的主构造函数),  在Scala当中类也接收参数, 就像方法一样
class Person(val name: String, val age: Int){
    (......)中的内容就是主构造函数的参数    
    println("Just constructed another person")   //每次调用构造函数，都会执行一次
}

//如果参数不带val或var, 
class Person(name: String, age:Int)   //类似字段 private[this] val (对象私有化)
*/
class Person{
    private var name = ""
    private var age = 0

    def a=name
    def b=age

    def this(name: String){   //一个辅助构造器
        this()         //调用主构造器(主构造函数无参数)
        this.name = name
        println("构造器1: " + name)
    }

    def this(name: String, age: Int){     //另一个辅助构造器
        this(name)   //调用前一个构造器
        this.age = age
        printf("构造器2: %s, %d\n", name, age)
    }
}


object Constructor{
    def main(args: Array[String]){
        val p1 = new Person   //主构造器
        printf("name: %s, age: %d\n", p1.a, p1.b) 
        val p2 = new Person("Fred")   //调用第一个构造器
        val p3 = new Person("Alex", 42)  //调用第二个构造器
    }
}

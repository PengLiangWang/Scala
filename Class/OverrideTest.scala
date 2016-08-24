class Father{
    def name = "Archer"
    def score() = 1.0
    val id = 12
    def moveTo(x: Int, y: Int) = println("move to ("+x+"," +y+")")
}

class Children extends Father{
    override def name="Jack"   //子类的def 可以 override 父类的def
    override val score=2.0     //子类的val 可以 override 父类的def(不带参数的def)
    override def moveTo(x: Int, y: Int) = super.moveTo(x, y)
}



object OverrideTest{
    def main(args: Array[String]){
        var father = new Father;
        println(father.name)
        println(father.score)
        father.moveTo(2,3)

        var chid = new Children;
        println(chid.name)
        chid.moveTo(2,3)

    }
}

class Worker private{
    def work() = println("I am the only worker!")
}


/* 通过伴生对象访问类实例 */
object Worker{
    val worker = new Worker
    def GetWorkInstance(): Worker = {
        worker.work()
        worker
    }
    /*或者直接
    def GetWorkInstance() = worker.work()
    即可
    */
}

object Job{
    def main(args: Array[String]){
        for(i <- 1 to 5)    
            Worker.GetWorkInstance()
    }    
}

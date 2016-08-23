object GetTime{
    def main(args: Array[String]){
        delayed(time()) //函数 delayed参数为time() 等于 t 
    }    

    def time() = {
        println("获取时间, 单位为纳秒");    
        System.nanoTime;
    }
    def delayed(t: => Long)={   //按名传递, 将time()传递进来 t等同于time() (t:Long)则为按值传递
        println("在 delay 方法内");
        println("参数：" + t); //当执行t时, 会执行time()函数并返回最后一行值
        println(t)                      //重新调用t是,  会执行time()函数并返回最后一行值
        t                               //直接调用t, 没有println打印, 就只会输出"获取时间, 单位为纳秒" 
    }
}

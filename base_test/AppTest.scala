
//继承App特质替代main
//scala -Dscala.time AppTest Alex  程序执行时加上 -Dscala.time, 程序退出时会显示逝去的时间
object AppTest extends App{
        if(args.length > 0)    
        {
           println("Hello, " + args(0))    
        }
        else
        {
           println("Hello, World!")    
        }
}

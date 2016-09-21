object Test{
    def main(args: Array[String]){
        val x = Console.readLine("Input x； ")

        /*
        val s = if(x.toInt > 0)  "positive"  else -1
        println("s: "+ s)
        */
        if(x.toInt>0)
             println(1)
        else if(x.toInt == 0) 
            println(0); 
        else println(-1);


        val name = readLine("your name: ")
        print("your age: ")
        val age = readInt()
        printf("Hello , %s! Next year, you will be %d.\n", name, age+1)
    }
}

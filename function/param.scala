object param{
    def main(args: Array[String]){
        printfStrings("Runoob", "python", "Scala");       
    }    
    def printfStrings(args: String*) = {
        var i : Int = 0;
        for(rg <- args)
        {
            println("Arg value["+ i +"] = " + rg);    
            i = i + 1;
        }
    }
}

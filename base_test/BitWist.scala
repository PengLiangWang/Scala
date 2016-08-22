object BitWist {
    def main(args: Array[String])
    {
        var a = 60;   /* 60 = 0011 1100*/    
        var b = 13;   /* 13 = 0000 1101*/
        var c = 0;   
        var d = 0;
        
        c = a & b;
        println("a & b  = " + c);
        
        c = a << 2;
        println("a << 2 = " + c );   /* 1111 0000 = 240 */

        c = a >> 2;
        d = a >>>2;   /*无符号右移*/
        println("a >> 2 = " + c);
        println("a >>> 2 = " + d);
    }
}

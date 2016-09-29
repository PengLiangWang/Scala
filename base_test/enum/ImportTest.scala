//交通信号灯
import TrafficLightColor._


object ImportTest extends App{

    for (c <- TrafficLightColor.values) println(c.id + ":" + c) 

    println(doWhat(TrafficLightColor(0))) 

    def doWhat(color: TrafficLightColor) = {
        if(color == Red)  "stop"
        else if(color == Yellow) "Hurry up"
        else "go"
    }

    println(TrafficLightColor.withName("Yellow"))   //10
}

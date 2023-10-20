import chapter01.task01.mission01
import chapter01.task02.mission02
import chapter01.task03.mission03
import chapter01.task04.mission04
import chapter01.task05.mission05
//import chapter01.task06.mission06

fun main(){
    println("Enter number of mission and I give you an answer")
    var numberOfMission = readLine()!!.toInt()
    when (numberOfMission) {
        1 -> mission01()
        2 -> mission02()
        3 ->mission03()
        4 -> mission04()
        5 -> mission05()
    }
    //mission06()
}
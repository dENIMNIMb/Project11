package chapter01.task03

fun mission03() {
    var answer03 = 0
    println("Enter the first number")
    val firstNumber:Float = readLine()!!.toFloat()
    println("Enter the second number")
    val secondNumber:Float = readLine()!!.toFloat()
    println("Enter the third number")
    val thirdNumber:Float = readLine()!!.toFloat()
    println("Biggest number inda city")
    if(firstNumber>=secondNumber&&firstNumber>=thirdNumber){
        answer03 = firstNumber.toInt()
    } else if (secondNumber>=thirdNumber){
        answer03 = secondNumber.toInt()
    } else {answer03 = thirdNumber.toInt()
    }
    println("\u001b[33;1m$answer03\u001b[0m")
}
package chapter01.task02

fun mission02(){
    println("Enter the number for \u001B[35;1mmagic-wagic\u001B[0m")
    val n = readln().toInt()
    val answer02 = n%360
    println("Answer for second mission is: \u001b[33;1m$answer02\u001b[0m")
}
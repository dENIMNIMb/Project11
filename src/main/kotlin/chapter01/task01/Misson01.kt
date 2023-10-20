package chapter01.task01
fun mission01() {
    println("Enter the number for \u001B[35;1mmagic\u001B[0m")
    val n = readln().toInt()
    val binary = n.toString(2)
    val octal = n.toString(8)
    val hexadecimals = n.toString(16)
    println("Binary: \u001b[33;1m$binary\u001b[0m")
    println("Octal: \u001b[33;1m$octal\u001b[0m")
    println("Hexadecimals: \u001b[33;1m$hexadecimals\u001b[0m")
}
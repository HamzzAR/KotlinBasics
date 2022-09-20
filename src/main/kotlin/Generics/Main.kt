package Generics

fun main(args: Array<String>) {
    fun <T,U>weather( value1: T , value2: U) {
        println("Its $value1 and $value2")
    }

    weather(22,  "Sunny")
    weather( "Snowing" ,  0)

    var stackOfStrings = Stack<String>()
    stackOfStrings.push("uno")
    stackOfStrings.push("dos")
    stackOfStrings.push("tres")
    stackOfStrings.currentVal()
    stackOfStrings.pop()
    stackOfStrings.currentVal()

    var stackOfInts = Stack<Int>()
    stackOfInts.push(1)
    stackOfInts.push(2)
    stackOfInts.push(3)
    stackOfInts.currentVal()
    stackOfInts.pop()
    stackOfInts.currentVal()
}
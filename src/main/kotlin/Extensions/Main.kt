package Extensions

fun main(args: Array<String>) {
    fun String.asList(): List<Char> = this.toList()
    val myNextString = "Hello there"
    val resultList = myNextString.asList()
    println("The list is: $resultList")

    fun String.removeFirstAndLastChar(): String =  this.substring(1, this.length - 1)
    val myString = "Hello Everyone"
    val result = myString.removeFirstAndLastChar()
    println("First character is: $result")

    fun Double.km(): Double = this.div(1000.0)
    fun Double.cm(): Double = this.times(100.0)
    fun Double.mm(): Double = this.times(1000.0)

    val myDouble = 10.0
    val resultKm = myDouble.km()
    println("$myDouble metres is: $resultKm Kilometres")
    val resultCm = myDouble.cm()
    println("$myDouble metres is: $resultCm Centimetres")
    val resultMm = myDouble.mm()
    println("$myDouble metres is: $resultMm Millimetres")

    fun Example.printFunctionType(i: Int) { println("Extension function") }
    fun Example.anotherExtension() { println("Another Extension function") }

    Example().printFunctionType()
    Example().printFunctionType(1)
    Example().anotherExtension()
}
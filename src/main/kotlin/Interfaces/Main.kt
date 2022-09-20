package Interfaces

fun main(args: Array<String>) {
    val order = PizzaOrder()

    println("The number of toppings is ${order.numToppings}")
    println("The size of the pizza is ${order.size}")
    println("The maximum number of toppings is ${order.maxNumToppings}")
    order.numToppings = 5
    order.size = 14

    println("The number of toppings is ${order.numToppings}")
    println("The size of the pizza is ${order.size}")
    println("The maximum number of toppings is ${order.maxNumToppings}")

    val cat = Cat()
    println(cat.noise())
    cat.startPurr()
    cat.stopPurr()
}
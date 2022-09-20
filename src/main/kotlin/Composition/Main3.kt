package Composition

fun main(args: Array<String>) {
    var myCar = Car("Aston Martin", "Vanquish", "Green")
    println("My car's model is ${myCar.model}")
    println("My car's tyres rim size is ${myCar.tyres.rimSize}")

    myCar.tyres.manufacturer = "Michelin"
    myCar.tyres.rimSize = "R19"
    println("My car's tyres are made by ${myCar.tyres.manufacturer}")
    println("My car's tyres rim size is ${myCar.tyres.rimSize}")

    myCar.tyres = Tyre("Goodyear","R21")
    println("My car's tyres are made by ${myCar.tyres.manufacturer}")
    println("My car's tyres rim size is ${myCar.tyres.rimSize}")

    var myOtherCar = Car("Aston Martin", "Vanquish", "Black")
    println("The car has been serviced ${myOtherCar.hasBeenServiced}")

    myOtherCar.service
    println("The car has been serviced ${myOtherCar.hasBeenServiced}")

}
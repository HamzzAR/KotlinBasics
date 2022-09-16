fun main(args: Array<String>) {
    var newPerson = Person()
    newPerson.age = 26
    newPerson.name = "Hamza"
    newPerson.weight = 80.0
    newPerson.height = 120.0

    println("The person's age is ${newPerson.age}")
    println("The person’s name is ${newPerson.name}")
    println("The person’s weight is ${newPerson.weight}")
    println("The person’s height is ${newPerson.height}")
    println("Vote - ${newPerson.canVote}")

    val mySteps = Pedometer()
    mySteps.increment()
    mySteps.incrementBy(253)
    mySteps.reset( )
    mySteps.incrementBy(15 , 3)

    println(mySteps.steps)

    val falcon = Spaceship()
    falcon.name = "Falcon"
    println(falcon.position)
    falcon.moveLeft()
    println(falcon.position)
    falcon.moveLeft()
    println(falcon.position)
    falcon.moveRight()
    println(falcon.position)

    val destroyer = Fighter()
    destroyer.weapon = "Laser"
    destroyer.remainingFirePower = 10
    destroyer.name = "Destroyer"
    destroyer.health = 200
    println(destroyer.position)
    destroyer.moveRight()
    println(destroyer.position)

    val defender = ShieldedShip()
    defender.name = "Defender"
    defender.weapon = "Cannon"
    defender.moveRight()
    println(defender.position)
    defender.fire()
    println(defender.remainingFirePower)
    println("Finished")
}
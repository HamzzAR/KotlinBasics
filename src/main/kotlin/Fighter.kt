 open class Fighter: Spaceship() {
        var weapon = ""
        var remainingFirePower = 5
        fun fire() {
            if (remainingFirePower > 0) {
                remainingFirePower -= 1
            } else {
                println("You have no more fire power.")
            }
        }
 }
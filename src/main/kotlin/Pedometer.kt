class Pedometer {
    var steps = 0
    fun increment ( ) {
        steps += 1 }
    fun incrementBy(amount: Int) {
        steps += amount
    }
    fun reset ( ) {
        steps = 0 }
    fun incrementBy(amount: Int,  numberOfTimes: Int) {
        steps += amount * numberOfTimes
    }
}
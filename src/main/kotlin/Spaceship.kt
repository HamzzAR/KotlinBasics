open class Spaceship {
    var name: String = ""
    var health = 100
    var position = 0
    fun moveLeft() {
        position -= 1
    }
    fun moveRight() {
        position += 1
    }

    open fun wasHit() {
        health -= 5 }
}
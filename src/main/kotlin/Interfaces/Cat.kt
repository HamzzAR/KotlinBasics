package Interfaces

class Cat : Sound, Purring {
    // override an abstract function
    override fun noise(): String = "Meow"
    // override a concrete function
    override fun stopPurr() { println("can’t stop the purring") }
}
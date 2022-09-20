package Interfaces

class PizzaOrder : Pizza {
    // simple override
    override var numToppings = 0
    // override with get/set
    override var size: Int = 12
        get() = field
        set(value) { field = value}
}
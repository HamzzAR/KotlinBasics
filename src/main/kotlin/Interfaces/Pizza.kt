package Interfaces

interface Pizza {
    var numToppings: Int //abstract
    var size: Int       //abstract
    val maxNumToppings: Int  //concrete
        get() = 6
}
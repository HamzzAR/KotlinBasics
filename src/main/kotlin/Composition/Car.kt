package Composition

class Car(_manufacturer: String, _model: String, _colour: String) {
    var manufacturer: String
    var model: String
    var colour: String
    var tyres: Tyre
    var carEngine: Engine
    var hasBeenServiced: Boolean = false
    val service by lazy {PerformService(); hasBeenServiced = true}
    init {
        manufacturer = _manufacturer
        model = _model
        colour = _colour
        tyres = Tyre( "Bridgestone", "R17")
        carEngine = Engine("Petrol", 12)
    }
}

package Composition

class Engine(_fuel: String, _cylinders: Int) {
    var fuel: String
    var cylinders: Int
    init {
        fuel = _fuel
        cylinders = _cylinders
    }
}
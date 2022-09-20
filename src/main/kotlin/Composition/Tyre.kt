package Composition

class Tyre(_manufacturer: String, _rimSize: String) {
    var manufacturer: String
    var rimSize: String
    init{
        manufacturer = _manufacturer
        rimSize = _rimSize
    }
}
package Composition

class PerformService {
    var service: Boolean = false
    init{
        println("Service has been performed")
        service = true
    }
}
class Car (_model: String, _age: Int = 0)
{
    var model = _model
    var age = _age

    constructor() : this("Mazda",1) {}
    constructor(_age: Int) : this ("BMW",_age) {if (age>3) println("Annual MOT needed for $model")}

    init {
        if (age < 0) println("Car age must be a positive value")
    }
}
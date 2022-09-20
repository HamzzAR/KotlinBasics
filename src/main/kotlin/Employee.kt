open class Employee(_name:String = "", _address:String = "", _phoneNumber:String = "", _employeeNumber:Int = 0, _salary:Double = 0.0): TopPerson(_name, _address, _phoneNumber) {
    var employeeNumber:Int
    var salary:Double
    init {
        employeeNumber = _employeeNumber
        salary = _salary
    } }
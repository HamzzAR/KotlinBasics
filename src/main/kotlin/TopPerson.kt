open class TopPerson(_name:String = "", _address:String = "", _phoneNumber:String = "") {
    var name:String
    var address:String
    var phoneNumber:String
    init {
        name = _name
        address = _address
        phoneNumber = _phoneNumber
    }
}
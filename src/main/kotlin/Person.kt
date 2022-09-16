class Person {
    var age = 0
    var name = ""
    var weight = 0.0
    var height = 0.0
    val canVote: Boolean
        get() {
            return age >= 18
        } }
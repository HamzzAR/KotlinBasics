const val MAXIMUM:Int = 10000
fun main(args: Array<String>) {
//    println(MAXIMUM)

    val value = 1
//    println(value)

    var aVar = 2
//    println(aVar)
    aVar = 5
//    println(aVar)

    var greeting = "Hi"
    greeting += " there"
//    println("Hi there $greeting")

    val value1:Int = 4
    val coffee = true

    val aString = "Hi there"
//    println(aString.uppercase().length)

    val mString = """
        this
        and 
        that 
            this that
            what
            
        this
        """
//    println(mString.isEmpty())
//    println(aString.forEach { c -> println(c) })
//    println(aString.forEachIndexed() { i,c -> println("Index $i Character $c") })
//
//    println("I like Coffee? $coffee , $value1")

//    allAboutLists()
//    allAboutSets()
//    ranges()
//    maps()
//    allLoops()
    allNulls()
}

fun allNulls(){
//    Step 3: toIntOrNull() returns an optional
    val aString = "999"
    val anInt = aString.toIntOrNull()
    println(anInt)
    val aString1 = "A999"
    val anInt1 = aString1.toIntOrNull()
    println(anInt1)

// Step 4: If Statements and Forced Unwrapping
    val place:Int? = null
    if (place != null){
        println(place)
    }else{
        println("Contains null")
    }

//  Step 5: Defining your own optional
    val place1:Int?
    place1 = null

//    Step 6: Using a when statement
    when (place1) {
        1 ->  println("You won a Gold medal")
        2 ->  println("You won a Silver medal")
        3 ->  println("You won a Bronze medal")
        null -> println("Didn't finish")
        else ->  println("Also ran")
    }

//Step 7: Nil coalescing ??
    val opVar:Int? = null
    println(opVar)
    println(opVar ?:0)

    val addedOp = 1 + (opVar ?: 0)  // returns 1
    println(addedOp)

// Step 8: safely dealing with an empty collection and Null returns
    val numList = listOf(1,2,3,4,5,6)
    println(numList.first())  // returns 1
    println(numList.last())  // returns 6
    val empty = listOf<Int>()
    println(empty.firstOrNull())  // returns null
    println(empty.lastOrNull())  // returns null
    println(empty.firstOrNull()?.equals(1))   // returns null
    println(numList.firstOrNull()?.equals(1)) // returns true

    var str: String? = "Hello"
    str.let {
        if (it != null) {print("the string $it was returned")}
        else { print("null returned") }
    }


}
fun allLoops(){
//    Step 3: for loops
    for  (index in 1..5)  {
        println("This is number $index")
    }
    val names = listOf("The Doctor", "Dalek Khan", "The Master")
    for  (aName in names)  {
        println("Are you $aName ?")
    }
    val shoppingPoints =  mapOf("The Doctor" to 74 , "Davros" to 55 , "The Master" to 40)
    for  ((name, points) in shoppingPoints)  {
        println("$name has $points points")
    }
    for  (character  in "abcdefghijklmnopqrstuvwxyz1234567890")
    {
        println(character)
    }

//    Step 4: while loops
    var turns = 1
    while (turns <= 3) {
        println("This is turn number $turns")
        turns += 1 }

    var gotTurnsLeft = true;
    while (gotTurnsLeft) {
        turns -= 1
        if (turns == 0) {
            gotTurnsLeft = false
        }
        println("got another turn")
    }

//    Step 5: do while loops
    var counter = 0
    do {
        counter += 1
    } while (counter < 5)

//    Step 6: Break
    for  (counter in -5..5)
    {
        println("This $counter")
        if (counter == 0) {
            break }
    }
//  Step 7: Using downTo and step in a for loop
    for (index in 10 downTo 0 step 2) {
        println("This is number $index")
    }
}

fun maps(){
    val shoppingPoints1 =  mapOf("The Doctor" to 74 , "Davros" to 55 , "The Master" to 40)
    val count = shoppingPoints1.count()
    println(count)

    val myMap = mapOf<String, String>()
    val count2 = myMap.count()
    println(count2)

    val allKeys = shoppingPoints1.keys
    println(allKeys)
    val allValues = shoppingPoints1.values
    println(allValues)

    val myPoints5 = shoppingPoints1.getOrElse("Fred", {"Fred has no points"})
    println(myPoints5)

//    Step 6: Embedding lists and maps in maps
    val cardsDr = listOf(1 , 2 , 3 , 4 , 5)
    val cardsDavros = listOf(6 , 7 , 8 , 9 , 10)
    val shoppingCards = mapOf("The Doctor" to cardsDr , "Davros" to cardsDavros)
    println(shoppingCards)
    val cardsDr1 = mapOf("Tesco" to 70 , "Waitrose" to 20 , "Co-op" to 30 , "Aldi" to 90 , "Sainsburys" to 5)
    val cardsDavros1 = mapOf("Morrisons" to 1  , "Co-op" to 50 , "Aldi" to 447 , "Sainsburys" to 55)
    val storeCards = mapOf("The Doctor" to cardsDr1 , "Davros" to cardsDavros1)
    println(storeCards)

//  Step 7: Variable maps
    var shoppingPoints2 =  mutableMapOf("The Doctor" to 74 , "Davros" to 55, "The Master" to 40)
    shoppingPoints2["Omega"] = 9999
    shoppingPoints2["Omega"] = 1200

    val oldValue =  shoppingPoints2.put("Davros", 1234)
    println("Davros used to have $oldValue points on his store card.")
    val deletedItem = shoppingPoints2.remove("The Master")
    println("The master was removed and his balance was $deletedItem")
    shoppingPoints2 -= "Omega"
    println("The Map is now $shoppingPoints2")


    }

fun ranges(){
    val x = listOf(1,2,3,4)
    if (2 in x){
        println("It works!")
    }

    val setsX = setOf(1,2,3,4)
    if (3 in setsX){
        println("Works")
    }

    val place = 2
    when (place){
        1 -> println("you won")
        2 -> println("you came second")
        3 -> println("you are third")
        else -> println("Also ran")
    }

    val number = 5
    val text = "Goodbye"
    when {
        number >= 8 -> println("number is greater than 7")
        text == "hello" -> println("number less than eight, but text is equal to hello")
        else -> println("number less than eight and text not equal to hello") }

    val ran = 1..6
    println(ran.first)
    println(ran.last)
    println(ran.count())
    println(2 in ran)

    val month = 9
    when (month) {
        in 1..2, 12 -> println("Winter")
        in 3..5 -> println("Spring")
        in 6..8 -> println("Summer")
        in 9..11 -> println("Autumn")
        else -> println("Incorrect input.")
    }

    val day = 6
    if (day in 1..5)
    {
        println("Workday")
    }
    else if (day in 6..7)
    {
        println("Day off")
    }
    else
    {
        println("Incorrect input.")
    }
}

fun allAboutSets(){
    val doubleSet = setOf(10.1,11.2, 11.2)
    println(doubleSet)

    val anyTypeSet:Set<Any> = setOf("This", 3, true)
    println(anyTypeSet)
    anyTypeSet.forEach { ele -> println(ele) }

    val rangeSet = setOf(1,2,3,4)
    val rangeSet2 = setOf(11,22,33,44)
    val newSet:Set<Set<Int>> = setOf(rangeSet, rangeSet2)
    println(newSet)
    println(newSet.first())
    println(newSet.last())
    println("Drop: "+newSet.drop(1))

    var nameSet = mutableSetOf("apple", "khan", "Master")
    var uniSet = mutableSetOf("Orange", "khan", "Master", "Slow")
    nameSet.add("True")
    println(nameSet)
    nameSet+= "Ring"
    println(nameSet)
    nameSet.remove("Ring")
    println(nameSet)
    nameSet -= "True"
    println(nameSet)
    nameSet.clear()
    println(nameSet)

    var newSet2= nameSet.union(uniSet)
    var newIntersect = nameSet.intersect(uniSet)
    println(newSet2)
    var rangeSet3 = setOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    var rangeSet4 = setOf(5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)
    var newSet3 = rangeSet3.intersect(rangeSet4)
    println("This: "+newSet3)

    var count = 1
    var result = 10* count++

    var count2 = 1
    var result2 = 10* ++count2
    println(result)
    println(count)
}

fun allAboutLists(){
    val fib = listOf(0, 1, 2, 3, 5, 8)
    val size = fib.count()
    println("The values for the fib list are ${fib[1]} $size")

    val list1 = listOf("A" , "B", "C", "D")
    val list2 = listOf("a" , "b", "c", "d")
    val newList = list1 + list2
    val list3 = listOf(list1,list2)
    println(newList)
    println(list3)
    println(list1.first()+list1.last())
    println(list1.dropLast(2))
    println(list1.isEmpty())
    println(list1.plus("ABC").plus("TTTT").plus("GGG"))
    println(list1.plusElement("THIS!"))
    list1.forEach{ ele -> println(ele) }

    var names = mutableListOf("This and that", "element")
    names[0] = "apple"
    names.remove("element")
    println(names)

    names -= "apple"
    println(names)
}
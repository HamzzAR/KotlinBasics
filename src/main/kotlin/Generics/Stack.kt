package Generics

class Stack<T> {
    var items = mutableListOf<T>()
    fun push(item: T) {
        items.add(item)
    }
    fun pop() : T {
        return items.removeLast()
    }
    fun currentVal()
    {
        println("current Stack is : $items")
    } }
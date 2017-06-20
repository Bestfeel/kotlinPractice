package ch08.ReturningFromLambdasReturnWithALabel1

data class Person(val name: String, val age: Int)

fun lookForAlice(people: List<Person>) {
    people.forEach {
        if (it.name == "Alice") return@forEach
    }
    println("Alice might be somewhere")
}

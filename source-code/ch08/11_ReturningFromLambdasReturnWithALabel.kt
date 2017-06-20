package ch08.ReturningFromLambdasReturnWithALabel

data class Person(val name: String, val age: Int)

fun lookForAlice(people: List<Person>) {
    people.forEach l@{
        if (it.name == "Alice") return@l
    }
    println("Alice might be somewhere")
}

package ch08.ReturnStatementsInLambdasReturnFromEnclosingFunction1

data class Person(val name: String, val age: Int)

fun lookForAlice(people: List<Person>) {
    people.forEach {
        if (it.name == "Alice") return
    }
    println("Alice is not found")
}

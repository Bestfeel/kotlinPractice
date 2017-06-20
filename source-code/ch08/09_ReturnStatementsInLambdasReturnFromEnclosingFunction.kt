package ch08.ReturnStatementsInLambdasReturnFromEnclosingFunction

data class Person(val name: String, val age: Int)

fun lookForAlice(people: List<Person>) {
    for (person in people) {
        if (person.name == "Alice") return
    }
    println("Alice is not found")
}

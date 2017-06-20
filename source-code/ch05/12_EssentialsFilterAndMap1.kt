package ch05.EssentialsFilterAndMap1

data class Person(val name: String, val age: Int)

fun main(args: Array<String>) {
    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    people.filter { it.age > 30 }
}

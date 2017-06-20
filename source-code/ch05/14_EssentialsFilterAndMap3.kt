package ch05.EssentialsFilterAndMap3

data class Person(val name: String, val age: Int)

fun main(args: Array<String>) {
    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    people.map { it.name }
}

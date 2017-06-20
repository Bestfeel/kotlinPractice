package ch08.AnonymousFunctionsLocalReturnsByDefault

data class Person(val name: String, val age: Int)

fun lookForAlice(people: List<Person>) {
    people.forEach(fun (person) {
        if (person.name == "Alice") return
        println("${person.name} is not Alice")
    })
}

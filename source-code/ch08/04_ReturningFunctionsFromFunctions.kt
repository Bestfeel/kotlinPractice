package ch08.ReturningFunctionsFromFunctions

data class Person(
        val firstName: String,
        val lastName: String,
        val phoneNumber: String?
)

object ContactListFilters {
    var prefix: String = ""
    var onlyWithPhoneNumber: Boolean = false

    fun getPredicate(): (Person) -> Boolean {
        val startsWithPrefix = { p: Person ->
            p.firstName.startsWith(prefix) || p.lastName.startsWith(prefix)
        }
        if (!onlyWithPhoneNumber) {
            return startsWithPrefix
        }
        return { startsWithPrefix(it)
                    && it.phoneNumber != null }
    }
}

fun main(args: Array<String>) {
    val contacts = listOf(Person("Dmitry", "Jemerov", "123-4567"),
                          Person("Svetlana", "Isakova", null))
    with (ContactListFilters) {
        prefix = "Dm"
        onlyWithPhoneNumber = true
    }
    println(contacts.filter(
        ContactListFilters.getPredicate()))
}

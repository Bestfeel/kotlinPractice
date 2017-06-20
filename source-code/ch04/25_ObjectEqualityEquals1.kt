package ch04.ObjectEqualityEquals1

class Client(val name: String, val postalCode: Int) {
    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Client)
            return false
        return name == other.name &&
               postalCode == other.postalCode
    }
    override fun toString() = "Client(name=$name, postalCode=$postalCode)"
}

fun main(args: Array<String>) {
    val processed = setOf(Client("Alice", 342562))
    println(processed.contains(Client("Alice", 342562)))
}

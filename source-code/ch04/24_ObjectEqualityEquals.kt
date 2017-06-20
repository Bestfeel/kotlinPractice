package ch04.ObjectEqualityEquals

class Client(val name: String, val postalCode: Int)

fun main(args: Array<String>) {
    val client1 = Client("Alice", 342562)
    val client2 = Client("Alice", 342562)
    println(client1 == client2)
}

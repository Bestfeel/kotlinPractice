package ch04.InitializingClassesPrimaryConstructorAndInitializerBlocks4

class User(val nickname: String,
           val isSubscribed: Boolean = true)

fun main(args: Array<String>) {
    val alice = User("Alice")
    println(alice.isSubscribed)
    val bob = User("Bob", isSubscribed = false)
    println(bob.isSubscribed)
}

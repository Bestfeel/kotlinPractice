package ch04.CompanionObjectPlaceForFactoryMethodsAndStaticMembers

class A {
    companion object {
        fun bar() {
            println("Companion object called")
        }
    }
}

fun main(args: Array<String>) {
    A.bar()
}

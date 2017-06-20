package ch09.DeclaringFunctionsWithReifiedTypeParameters

fun main(args: Array<String>) {
    val items = listOf("one", 2, "three")
    val strings = items.filterIsInstance<String>()
    println(strings)
}

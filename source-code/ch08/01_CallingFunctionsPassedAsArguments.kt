package ch08.CallingFunctionsPassedAsArguments

fun <T> Iterable<T>.filter(predicate: (T) -> Boolean): List<T> {
    val result = mutableListOf<T>()
    for (element in this) {
        if (predicate(element)) {
            result.add(element)
        }
    }
    return result
}

fun main(args: Array<String>) {
    val names = listOf("Peter", "John", "James")
    println(names.filter { it.startsWith("J") })
}

package ch09.UsesiteVarianceSpecifyingVarianceForTypeOccurrences

fun <T> copyData(source: MutableList<out T>,
                 destination: MutableList<T>) {
    for (item in source) {
        destination.add(item)
    }
}

fun main(args: Array<String>) {
    val ints = mutableListOf(1, 2, 3)
    val target = mutableListOf<Any>()
    copyData(ints, target)
}

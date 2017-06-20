package ch05.FlatMapAndFlattenProcessingElementsInNestedCollections

fun main(args: Array<String>) {
    val strings = listOf("abc", "def")
    println(strings.flatMap { it.toList() })
}

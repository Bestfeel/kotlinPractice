package ch05.FlatMapAndFlattenProcessingElementsInNestedCollections1

class Book(val title: String, val authors: List<String>)

fun main(args: Array<String>) {
    val books = listOf(Book("Thursday Next", listOf("Jasper Fforde")),
                       Book("Good Omens", listOf("Terry Pratchett",
                                                 "Neal Gaiman")))
    println(books.flatMap { it.authors }.toSet())
}

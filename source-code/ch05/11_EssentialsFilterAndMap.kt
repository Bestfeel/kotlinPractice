package ch05.EssentialsFilterAndMap

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3, 4)
    list.filter { it % 2 == 0 }
}

package ch05.GroupByConvertingAListToAMapOfGroups1

fun main(args: Array<String>) {
    val list = listOf("a", "ab", "b")
    println(list.groupBy(String::first))
}

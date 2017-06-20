package ch11.LambdasWithReceiverAndExtensionFunctionTypes3

fun main(args: Array<String>) {
    val map = mutableMapOf(1 to "one")
    map.apply { this[2] = "two"}
    with (map) { this[3] = "three" }
    println(map)
}

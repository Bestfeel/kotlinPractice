package ch11.LambdasWithReceiverAndExtensionFunctionTypes1

val appendExcl : StringBuilder.() -> Unit =
        { this.append("!") }

fun main(args: Array<String>) {
    val stringBuilder = StringBuilder("Hi")
    stringBuilder.appendExcl()
    println(stringBuilder)
    println(buildString(appendExcl))
}

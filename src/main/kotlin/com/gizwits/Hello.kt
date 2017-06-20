package com.gizwits

fun strLenSafe(s: String?): Int = s?.length ?: 0

fun parse(str: String): Int? {
    return str.toInt()
}

data class User(val id: Int, val age: Int)

fun main(args: Array<String>) {

    println("Hello, World")

    val person = Person(10, "feel")

    println(person)

    val x: String? = null
    println(strLenSafe(x))
    println(strLenSafe("abc"))

    print(User(100, 20))

}


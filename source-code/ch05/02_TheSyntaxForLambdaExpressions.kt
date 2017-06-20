package ch05.TheSyntaxForLambdaExpressions

fun main(args: Array<String>) {
    val sum = { x: Int, y: Int -> x + y }
    println(sum(1, 2))
}

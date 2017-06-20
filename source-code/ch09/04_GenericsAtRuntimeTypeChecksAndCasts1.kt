package ch09.GenericsAtRuntimeTypeChecksAndCasts1

fun printSum(c: Collection<Int>) {
    if (c is List<Int>) {
        println(c.sum())
    }
}

package com.gizwits

import java.math.BigInteger

/**
 * Created by feel on 2016/12/14.
 *  尾递归
 */


class Result(var value: BigInteger = BigInteger.valueOf(1))

/**
 * 尾递归使用关键字  tailrec
 */
tailrec fun fac(num: Int, result: Result) {
    if (num == 0) result.value else {
        result.value = result.value.times(BigInteger.valueOf(num.toLong()))
        fac(num - 1, result)
    }
}

fun main(args: Array<String>) {

    val result = Result()
    fac(5, result)
    print(result.value)
}
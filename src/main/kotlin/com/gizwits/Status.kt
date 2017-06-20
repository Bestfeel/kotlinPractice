package com.gizwits

/**
 * Created by feel on 2016/12/14.
 */

enum class Status {
    STOP, START, STALE
}

open class Opertion {
    fun stop() = Status.STOP
    fun start() = Status.START
    fun stale() = Status.STALE
}
package ch11.LambdasWithReceiverAndExtensionFunctionTypes2

inline fun <T> T.apply(block: T.() -> Unit): T {
    block()
    return this
}

inline fun <T, R> with(receiver: T, block: T.() -> R): R =
    receiver.block()

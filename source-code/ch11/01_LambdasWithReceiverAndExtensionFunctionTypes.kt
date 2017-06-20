package ch11.LambdasWithReceiverAndExtensionFunctionTypes

fun alphabet() = buildString {
    for (letter in 'A'..'Z') {
        this.append(letter)
    }
    append("\nNow I know the alphabet!")
}

package ch04.OpenFinalAndAbstractModifiersFinalByDefault2

fun main(args: Array<String>) {
    abstract class Animated {
        abstract fun animate()

        open fun stopAnimating() {
        }

        fun animateTwice() {
        }
    }
}

package ch05.SAMConstructorsExplicitConversionOfLambdasToFunctionalInterfaces

fun createAllDoneRunnable(): Runnable {
    return Runnable { println("All done!") }
}

fun main(args: Array<String>) {
    createAllDoneRunnable().run()
}

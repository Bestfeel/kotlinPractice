package ch05.ExecutingSequenceOperationsIntermediateAndTerminalOperations1

fun main(args: Array<String>) {
    listOf(1, 2, 3, 4).asSequence()
            .map { print("map($it) "); it * it }
            .filter { print("filter($it) "); it % 2 == 0 }
            .toList()
}

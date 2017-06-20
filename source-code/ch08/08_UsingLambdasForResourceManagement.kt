package ch08.UsingLambdasForResourceManagement

import java.io.BufferedReader
import java.io.FileReader
import java.io.File

fun readFirstLineFromFile(path: String): String {
    BufferedReader(FileReader(path)).use { br ->
        return br.readLine()
    }
}

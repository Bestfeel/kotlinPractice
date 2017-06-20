package com.gizwits

import com.google.gson.Gson
import java.io.File

/**
 * Created by feel on 2016/12/14.
 */

data class FileContent(val file: List<String>)

/**
 * 扩展Gson方法
 * 内联函数
 * 实体化的类型参数，关键字reified
 */
inline fun <reified T : Any> Gson.fromJson(json: String): T {
    return fromJson(json, T::class.java)
}

fun main(args: Array<String>) {

    val json = File(ClassLoader::class.java.getResource("/list.json").path).readText()

    val result: FileContent = Gson().fromJson(json)

    println(result)

}
package com.osamendi.devhouse.util

object ShellExecutor {
    fun run(cmd: String): String {
        val process = Runtime.getRuntime().exec(cmd)
        return process.inputStream.bufferedReader().readText()
    }
}

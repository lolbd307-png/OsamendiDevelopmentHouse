package com.osamendi.devhouse.ide

import com.osamendi.devhouse.util.ShellExecutor

object BuildRunner {
    fun buildDebug(path: String) {
        ShellExecutor.run("cd $path && ./gradlew assembleDebug")
    }
}
